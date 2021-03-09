package Tasks;

import PageObjects.ConfereCarrinhoPage;
import PageObjects.ConfereResumoDoCarrinhoDeComprasPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfereCarrinhoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static ConfereResumoDoCarrinhoDeComprasPage confereResumoDoCarrinhoDeComprasPage;
    private static ConfereCarrinhoPage confereCarrinhoPage;

    public ConfereCarrinhoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        confereCarrinhoPage = new ConfereCarrinhoPage(this.driver);
        confereResumoDoCarrinhoDeComprasPage = new ConfereResumoDoCarrinhoDeComprasPage(this.driver);
    }
    public void conferirCarrinho(){
        confereCarrinhoPage.getProsseguirComChekout().click();
        validarConferirCarrinho();
    }
    public void validarConferirCarrinho(){
        WebElement verifica = esperas.esperarCarregarElemento(confereResumoDoCarrinhoDeComprasPage.getMenssagenResumoDoCarrinhoDeCompras());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
