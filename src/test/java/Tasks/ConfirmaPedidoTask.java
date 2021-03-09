package Tasks;

import PageObjects.ConfirmaPedidoPage;
import PageObjects.FinalizaCompraPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaPedidoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static ConfirmaPedidoPage confirmaPedidoPage;
    private static FinalizaCompraPage finalizaCompraPage;

    public ConfirmaPedidoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        confirmaPedidoPage = new ConfirmaPedidoPage(this.driver);
        finalizaCompraPage = new FinalizaCompraPage(this.driver);
    }
    public void ConfirmarPedido(){
        confirmaPedidoPage.getConfirmacaoDoPedido().click();
        validarConfirmacaoDeResumoDoPedido();
    }
    public void validarConfirmacaoDeResumoDoPedido(){
        WebElement verifica = esperas.esperarCarregarElemento(finalizaCompraPage.getBotaoMaisVendidos());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
