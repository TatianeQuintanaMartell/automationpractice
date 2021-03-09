package Tasks;

import PageObjects.ConfirmaPedidoPage;
import PageObjects.ConfirmaResumoDoPedidoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaResumoDoPedidoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static ConfirmaPedidoPage confirmaPedidoPage;
    private static ConfirmaResumoDoPedidoPage confirmaResumoDoPedidoPage;

    public ConfirmaResumoDoPedidoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        confirmaPedidoPage = new ConfirmaPedidoPage(this.driver);
        confirmaResumoDoPedidoPage = new ConfirmaResumoDoPedidoPage(this.driver);
    }
    public void ConfirmarResumoDoPedido(){
        confirmaResumoDoPedidoPage.getEuConfirmoMeuPedido().click();
        validarConfirmacaoDeResumoDoPedido();
    }
    public void validarConfirmacaoDeResumoDoPedido(){
        WebElement verifica = esperas.esperarCarregarElemento(confirmaPedidoPage.getCaixaDeMensagemSeuPedidoEmMinhaLojaFoiConcluido());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
