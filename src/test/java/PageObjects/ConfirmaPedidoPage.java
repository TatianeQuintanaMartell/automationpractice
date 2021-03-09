package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaPedidoPage {
    private WebDriver driver;
    private Esperas esperas;

    public ConfirmaPedidoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getConfirmacaoDoPedido(){
        return esperas.esperarElementoEstarVisivel(By.className("icon-home"));
    }
    public WebElement getCaixaDeMensagemSeuPedidoEmMinhaLojaFoiConcluido(){
        return esperas.esperarElementoEstarVisivel(By.className("page-heading"));
    }
}
