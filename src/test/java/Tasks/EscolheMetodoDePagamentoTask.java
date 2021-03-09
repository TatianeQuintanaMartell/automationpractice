package Tasks;

import PageObjects.ConfirmaResumoDoPedidoPage;
import PageObjects.EscolheMetodoDePagamentoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EscolheMetodoDePagamentoTask {
    private static WebDriver driver;
    private static Esperas esperas;
    private static EscolheMetodoDePagamentoPage escolheMetodoDePagamentoPage;
    private static ConfirmaResumoDoPedidoPage confirmaResumoDoPedidoPage;

    public EscolheMetodoDePagamentoTask(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
        escolheMetodoDePagamentoPage = new EscolheMetodoDePagamentoPage(this.driver);
        confirmaResumoDoPedidoPage = new ConfirmaResumoDoPedidoPage(this.driver);
    }
    public void EscolherFormaDePagamento(){
        escolheMetodoDePagamentoPage.getPaguePorTransferenciaBancaria().click();
        validarEscolherFormaDePagamento();
    }
    public void validarEscolherFormaDePagamento(){
        WebElement verifica = esperas.esperarCarregarElemento(confirmaResumoDoPedidoPage.getDescricaoTelaPagamentoPorTransferenciaBancaria());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
