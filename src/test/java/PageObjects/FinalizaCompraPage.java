package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalizaCompraPage {
    private WebDriver driver;
    private Esperas esperas;

    public FinalizaCompraPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }

    public WebElement getSair(){
        return esperas.esperarElementoEstarVisivel(By.className("logout"));
    }
    public WebElement getBotaoMaisVendidos(){
        return esperas.esperarElementoEstarVisivel(By.className("blockbestsellers"));
    }
}
