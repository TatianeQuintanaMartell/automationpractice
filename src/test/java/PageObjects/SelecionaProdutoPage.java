package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionaProdutoPage {
    private WebDriver driver;
    private Esperas esperas;

    public SelecionaProdutoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getItemDeMenuCamisetas(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a[@title='T-shirts']"));

    }

    public WebElement getImagemDoCarrinho(){
        return esperas.esperarElementoEstarVisivel(By.className("shopping_cart"));
    }


}
