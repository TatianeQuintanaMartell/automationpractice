package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaEnderecosPage {
    private WebDriver driver;
    private Esperas esperas;

    public ConfirmaEnderecosPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getBotaoFazerOCheckOut(){
        return esperas.esperarElementoEstarVisivel(By.name("processAddress"));
    }
    public WebElement getDescricaoTelaUseOEnderecoDeEntregaComoEnderecoDeCobranca(){
        return esperas.esperarElementoEstarVisivel(By.id("address_invoice"));
    }
}
