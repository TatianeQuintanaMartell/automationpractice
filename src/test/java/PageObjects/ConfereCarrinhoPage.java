package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfereCarrinhoPage {
    private WebDriver driver;
    private Esperas esperas;

    public ConfereCarrinhoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getProsseguirComChekout(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@title='Proceed to checkout']"));

    }
    public WebElement getMensagemProdutoAdicionadoComSucesso(){
        return esperas.esperarElementoEstarVisivel(By.className("icon-ok"));

    }

}
