package Tasks;

import PageObjects.FazAutenticacaoPage;
import PageObjects.PreencheInformacoesPessoaisPage;
import Suporte.Esperas;
import Suporte.GeradorFakers;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FazAutenticacaoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static FazAutenticacaoPage fazAutenticacaoPage;
    private static PreencheInformacoesPessoaisPage preencheInformacoesPessoaisPage;
    private static GeradorFakers geradorFakers;


    public FazAutenticacaoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        fazAutenticacaoPage = new FazAutenticacaoPage(this.driver);
        preencheInformacoesPessoaisPage = new PreencheInformacoesPessoaisPage(this.driver);
        geradorFakers = new GeradorFakers(this.driver);

    }
    public void fazerAutenticacao(){
        fazAutenticacaoPage.getCampoEmail().sendKeys(geradorFakers.getEmailCriarConta());
        fazAutenticacaoPage.getBotaoCriaConta().click();
        validarFazerAutenticacao();
    }
    public void validarFazerAutenticacao(){
        WebElement verifica = esperas.esperarCarregarElemento(preencheInformacoesPessoaisPage.getMensagemNaTelaMobilePhone());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
