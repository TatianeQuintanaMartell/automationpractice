package Tasks;

import PageObjects.AdicionaAoCarrinhoPage;
import PageObjects.ConfereCarrinhoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdicionaAoCarrinhoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static AdicionaAoCarrinhoPage adicionaAoCarrinhoPage;
    protected static ConfereCarrinhoPage confereCarrinhoPage;

    public AdicionaAoCarrinhoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        adicionaAoCarrinhoPage = new AdicionaAoCarrinhoPage(this.driver);
        confereCarrinhoPage = new ConfereCarrinhoPage(this.driver);
    }
    public void adicionarAoCarrinho(){
        adicionaAoCarrinhoPage.getVisaoLista().click();
        adicionaAoCarrinhoPage.getBotaoAdicionaAoCarrinho().click();
        validarAdicionarAoCarrinho();
    }
    public void validarAdicionarAoCarrinho(){
        WebElement verifica = esperas.esperarCarregarElemento(confereCarrinhoPage.getMensagemProdutoAdicionadoComSucesso());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
