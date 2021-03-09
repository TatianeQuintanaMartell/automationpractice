package Tasks;

import PageObjects.ConfirmaRemessaPage;
import PageObjects.EscolheMetodoDePagamentoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaRemessaTask {

    private static WebDriver driver;
    private static Esperas esperas;
    private static EscolheMetodoDePagamentoPage escolheMetodoDePagamentoPage;
    private static ConfirmaRemessaPage confirmaRemessaPage;

    public ConfirmaRemessaTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        escolheMetodoDePagamentoPage = new EscolheMetodoDePagamentoPage(this.driver);
        confirmaRemessaPage = new ConfirmaRemessaPage(this.driver);
    }
    public void confirmarRemessa(){
        confirmaRemessaPage.getAceitarOsTermosDeServico().click();
        confirmaRemessaPage.getBotaoFazerOCheckOutFrete().click();
        validarConfirmacaoDeRemessa();
    }
    public void validarConfirmacaoDeRemessa(){
        WebElement verifica = esperas.esperarCarregarElemento(escolheMetodoDePagamentoPage.getOpcaoPagueEmCheque());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
