package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FazAutenticacaoPage {
    private WebDriver driver;
    private Esperas esperas;

    public FazAutenticacaoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getCampoEmail(){
        return esperas.esperarElementoEstarVisivel(By.id("email_create"));
    }
    public WebElement getBotaoCriaConta(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='SubmitCreate']"));
    }
    public WebElement getDescricaoNaTelaCrieSuaContaAqui(){
        return esperas.esperarElementoEstarVisivel(By.id("create-account_form"));
    }
}
