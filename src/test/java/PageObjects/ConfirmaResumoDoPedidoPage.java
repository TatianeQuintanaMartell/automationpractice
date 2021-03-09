package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaResumoDoPedidoPage {
    private WebDriver driver;
    private Esperas esperas;

    public ConfirmaResumoDoPedidoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getEuConfirmoMeuPedido(){
        return esperas.esperarElementoEstarVisivel(By.className("btn-default"));
    }
    public WebElement getDescricaoTelaPagamentoPorTransferenciaBancaria(){
        return esperas.esperarElementoEstarVisivel(By.className("page-heading"));
    }

}
