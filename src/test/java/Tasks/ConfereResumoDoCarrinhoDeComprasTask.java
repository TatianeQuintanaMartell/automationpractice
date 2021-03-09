package Tasks;

import PageObjects.ConfereResumoDoCarrinhoDeComprasPage;
import PageObjects.FazAutenticacaoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfereResumoDoCarrinhoDeComprasTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static ConfereResumoDoCarrinhoDeComprasPage confereResumoDoCarrinhoDeComprasPage;
    private static FazAutenticacaoPage fazAutenticacaoPage;


    public ConfereResumoDoCarrinhoDeComprasTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        confereResumoDoCarrinhoDeComprasPage = new ConfereResumoDoCarrinhoDeComprasPage(this.driver);
        fazAutenticacaoPage = new FazAutenticacaoPage(this.driver);

    }
    public void conferirResumoDoCarrinho(){
        confereResumoDoCarrinhoDeComprasPage.getFazerOCheckout().click();
        validarResumoDoCarrinho();
    }
    public void validarResumoDoCarrinho(){
        WebElement verifica = esperas.esperarCarregarElemento(fazAutenticacaoPage.getDescricaoNaTelaCrieSuaContaAqui());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
