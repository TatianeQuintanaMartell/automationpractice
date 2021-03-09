package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaRemessaPage {
    private WebDriver driver;
    private Esperas esperas;

    public ConfirmaRemessaPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }

    public WebElement getAceitarOsTermosDeServico(){
        return esperas.esperarElementoEstarVisivel(By.id("uniform-cgv"));

    }
    public WebElement getBotaoFazerOCheckOutFrete(){
        return esperas.esperarElementoEstarVisivel(By.name("processCarrier"));

    }
    public WebElement getImagemCaminhao(){
        return esperas.esperarElementoEstarVisivel(By.className("delivery_option_logo"));
    }
}
