package Tasks;

import PageObjects.ConfirmaEnderecosPage;
import PageObjects.PreencheInformacoesPessoaisPage;
import Suporte.Esperas;
import Suporte.GeradorFakers;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreencheInformacoresPessoaisTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static GeradorFakers geradorFakers;
    private static PreencheInformacoesPessoaisPage preencheInformacoesPessoaisPage;
    private static ConfirmaEnderecosPage confirmaEnderecosPage;

    public PreencheInformacoresPessoaisTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        geradorFakers = new GeradorFakers(this.driver);
        confirmaEnderecosPage = new ConfirmaEnderecosPage(this.driver);
        preencheInformacoesPessoaisPage = new PreencheInformacoesPessoaisPage(this.driver);
    }
    public void preencherInformacoesPessoais(){
        preencheInformacoesPessoaisPage.getBotaoMr().click();
        preencheInformacoesPessoaisPage.getPrimeiroNome().sendKeys(geradorFakers.getPrimeiroNome());
        preencheInformacoesPessoaisPage.getUltimoNome().sendKeys(geradorFakers.getSegundoNome());
        preencheInformacoesPessoaisPage.getSenha().sendKeys(geradorFakers.getSenha());
        preencheInformacoesPessoaisPage.getDiaDoNascimento().click();
        preencheInformacoesPessoaisPage.getMesDoNascimento().click();
        preencheInformacoesPessoaisPage.getAnoDoNascimento().click();
        preencheInformacoesPessoaisPage.getAssineANossaNewsletter().isSelected();
        preencheInformacoesPessoaisPage.getRecebaOfertasEspeciais().isSelected();
        preencheInformacoesPessoaisPage.getEndereco().sendKeys(geradorFakers.getEndereco());
        preencheInformacoesPessoaisPage.getCidade().sendKeys(geradorFakers.getCidade());
        preencheInformacoesPessoaisPage.getEstado().click();
        preencheInformacoesPessoaisPage.getCEP().sendKeys(geradorFakers.getCep());
        preencheInformacoesPessoaisPage.getPais().click();
        preencheInformacoesPessoaisPage.getTelefoneFixo().sendKeys(geradorFakers.getTelefoneFixo());
        preencheInformacoesPessoaisPage.getTelefoneCelular().sendKeys(geradorFakers.getTelefoneCelular());
        preencheInformacoesPessoaisPage.getEnderecoAlternativo().clear();
        preencheInformacoesPessoaisPage.getEnderecoAlternativo().sendKeys(geradorFakers.getEnderecoAlternativo());
        preencheInformacoesPessoaisPage.getBotaoRegistro().click();
        validarPreencherInformacoes();
    }

    public void validarPreencherInformacoes(){
        WebElement verifica = esperas.esperarCarregarElemento(confirmaEnderecosPage.getDescricaoTelaUseOEnderecoDeEntregaComoEnderecoDeCobranca());
        Assertions.assertTrue(verifica.isDisplayed());
    }

}
