package Suporte;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TesteBase extends GerenciadorDriver{
    private static WebDriver driver;
    private String URL = "http://automationpractice.com";

    public static WebDriver pegarDriver(){
        driver = setDriver(TipoDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void iniciar(){
        pegarDriver().get(URL);
    }

    @AfterEach
    public void terminar(){
        fecharDriver();
    }

}

