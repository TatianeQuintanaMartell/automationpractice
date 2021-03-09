package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreencheInformacoesPessoaisPage {
    private WebDriver driver;
    private Esperas esperas;

    public PreencheInformacoesPessoaisPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }

    public WebElement getBotaoMr(){
        return esperas.esperarElementoEstarVisivel(By.id("uniform-id_gender1"));
    }
    public WebElement getPrimeiroNome(){
        return esperas.esperarElementoEstarVisivel(By.id("customer_firstname"));
    }
    public WebElement getUltimoNome(){
        return esperas.esperarElementoEstarVisivel(By.id("customer_lastname"));
    }
    // email vem da tela anterior
    public WebElement getSenha(){
        return esperas.esperarElementoEstarVisivel(By.id("passwd"));
    }
    public WebElement getDiaDoNascimento(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='days']/option[2]"));
    }
    public WebElement getMesDoNascimento(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='months']/option[3]"));
    }
    public WebElement getAnoDoNascimento(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='years']/option[47]"));
    }
    public WebElement getAssineANossaNewsletter(){
        return esperas.esperarElementoEstarVisivel(By.id("uniform-newsletter"));
    }
    public WebElement getRecebaOfertasEspeciais(){
        return esperas.esperarElementoEstarVisivel(By.id("uniform-optin"));
    }
    public WebElement getEndereco(){
        return esperas.esperarElementoEstarVisivel(By.id("address1"));
    }
    public WebElement getCidade(){
        return esperas.esperarElementoEstarVisivel(By.id("city"));
    }
    public WebElement getEstado(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='id_state']/option[48]"));
    }
    public WebElement getCEP(){
        return esperas.esperarElementoEstarVisivel(By.id("postcode"));
    }
    public WebElement getPais(){
        return esperas.esperarElementoEstarVisivel(By.xpath("//*[@id='id_country']/option[2]"));
    }
    public WebElement getTelefoneFixo(){
        return esperas.esperarElementoEstarVisivel(By.id("phone"));
    }
    public WebElement getTelefoneCelular(){
        return esperas.esperarElementoEstarVisivel(By.id("phone_mobile"));
    }
    public WebElement getEnderecoAlternativo(){
        return esperas.esperarElementoEstarVisivel(By.id("alias"));
    }
    public WebElement getBotaoRegistro(){
        return esperas.esperarElementoEstarVisivel(By.id("submitAccount"));
    }
    public WebElement getMensagemNaTelaMobilePhone(){
        return esperas.esperarElementoEstarVisivel(By.name("phone_mobile"));
    }
}
