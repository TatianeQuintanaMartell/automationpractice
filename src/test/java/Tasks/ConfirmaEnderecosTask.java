package Tasks;

import PageObjects.ConfirmaEnderecosPage;
import PageObjects.ConfirmaRemessaPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaEnderecosTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static ConfirmaEnderecosPage confirmaEnderecosPage;
    private static ConfirmaRemessaPage confirmaRemessaPage;

    public ConfirmaEnderecosTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        confirmaEnderecosPage = new ConfirmaEnderecosPage(this.driver);
        confirmaRemessaPage = new ConfirmaRemessaPage(this.driver);
    }
    public void confirmarEnderecos(){
        confirmaEnderecosPage.getBotaoFazerOCheckOut().click();
        validarConfirmacaoEndereco();
    }
    public void validarConfirmacaoEndereco(){
        WebElement verifica = esperas.esperarCarregarElemento(confirmaRemessaPage.getImagemCaminhao());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
