package Tasks;

import PageObjects.FinalizaCompraPage;
import PageObjects.SelecionaProdutoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalizaCompraTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static SelecionaProdutoPage selecionaProdutoPage;
    private static FinalizaCompraPage finalizaCompraPage;

    public FinalizaCompraTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        selecionaProdutoPage = new SelecionaProdutoPage(this.driver);
        finalizaCompraPage = new FinalizaCompraPage(this.driver);
    }
    public void finalizarCompra(){
        finalizaCompraPage.getSair().click();
        validarRetornoAPaginaInicial();
    }

    public void validarRetornoAPaginaInicial(){
        WebElement verifica =esperas.esperarCarregarElemento(selecionaProdutoPage.getImagemDoCarrinho());
        Assertions.assertTrue(verifica.isDisplayed());

    }

}

