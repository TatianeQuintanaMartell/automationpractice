package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfereResumoDoCarrinhoDeComprasPage {
    private WebDriver driver;
    private Esperas esperas;

    public ConfereResumoDoCarrinhoDeComprasPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getFazerOCheckout(){
        return esperas.esperarElementoEstarVisivel(By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium"));

    }
    public WebElement getMenssagenResumoDoCarrinhoDeCompras(){
        return esperas.esperarElementoEstarVisivel(By.id("cart_title"));

    }
}
