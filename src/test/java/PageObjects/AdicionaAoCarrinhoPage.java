package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdicionaAoCarrinhoPage {
    private WebDriver driver;
    private Esperas esperas;

    public AdicionaAoCarrinhoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getVisaoLista(){
        return esperas.esperarElementoEstarVisivel(By.id("list"));
    }
    public WebElement getBotaoAdicionaAoCarrinho(){
        return esperas.esperarElementoEstarVisivel(By.cssSelector(".ajax_add_to_cart_button"));
    }
    public WebElement getImagemCamiseta(){
        return esperas.esperarElementoEstarVisivel(By.className("cat_desc"));
    }

}
