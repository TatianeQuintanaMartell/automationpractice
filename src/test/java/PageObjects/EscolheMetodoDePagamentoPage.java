package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EscolheMetodoDePagamentoPage {
    private WebDriver driver;
    private Esperas esperas;

    public EscolheMetodoDePagamentoPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }
    public WebElement getPaguePorTransferenciaBancaria(){
        return driver.findElement(By.className("bankwire"));
    }
    public WebElement getOpcaoPagueEmCheque(){
        return esperas.esperarElementoEstarVisivel(By.className("cheque"));
    }
}
