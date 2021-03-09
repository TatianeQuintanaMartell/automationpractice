package Tasks;

import PageObjects.AdicionaAoCarrinhoPage;
import PageObjects.SelecionaProdutoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionaProdutoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static SelecionaProdutoPage selecionaProdutoPage;
    private static AdicionaAoCarrinhoPage adicionaAoCarrinhoPage;

    public SelecionaProdutoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        selecionaProdutoPage = new SelecionaProdutoPage(this.driver);
        adicionaAoCarrinhoPage = new AdicionaAoCarrinhoPage(this.driver);
    }
    public void selecionarItemDeMenuCamisetas(){
        selecionaProdutoPage.getItemDeMenuCamisetas().click();
        validarSelecaoDeProduto();
    }
    public void validarSelecaoDeProduto(){
        WebElement verifica = esperas.esperarCarregarElemento(adicionaAoCarrinhoPage.getImagemCamiseta());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
