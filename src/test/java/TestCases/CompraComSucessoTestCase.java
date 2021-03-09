package TestCases;

import Suporte.TesteBase;
import Tasks.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CompraComSucessoTestCase extends TesteBase {
    private WebDriver driver = this.pegarDriver();
    SelecionaProdutoTask selecionaProdutoTask = new SelecionaProdutoTask(driver);
    AdicionaAoCarrinhoTask adicionaAoCarrinhoTask = new AdicionaAoCarrinhoTask(driver);
    ConfereCarrinhoTask confereCarrinhoTask = new ConfereCarrinhoTask(driver);
    ConfereResumoDoCarrinhoDeComprasTask confereResumoDoCarrinhoDeComprasTask = new ConfereResumoDoCarrinhoDeComprasTask(driver);
    FazAutenticacaoTask fazAutenticacaoTask = new FazAutenticacaoTask(driver);
    PreencheInformacoresPessoaisTask preencheInformacoresPessoaisTask = new PreencheInformacoresPessoaisTask(driver);
    ConfirmaEnderecosTask confirmaEnderecosTask = new ConfirmaEnderecosTask(driver);
    ConfirmaRemessaTask confirmaRemessaTask = new ConfirmaRemessaTask(driver);
    EscolheMetodoDePagamentoTask escolheMetodoDePagamentoTask = new EscolheMetodoDePagamentoTask(driver);
    ConfirmaResumoDoPedidoTask confirmaResumoDoPedidoTask = new ConfirmaResumoDoPedidoTask(driver);
    ConfirmaPedidoTask confirmaPedidoTask = new ConfirmaPedidoTask(driver);
    FinalizaCompraTask finalizaCompraTask = new FinalizaCompraTask(driver);

    @Test
    public void realizarCompra(){
         selecionaProdutoTask.selecionarItemDeMenuCamisetas();
         adicionaAoCarrinhoTask.adicionarAoCarrinho();
         confereCarrinhoTask.conferirCarrinho();
         confereResumoDoCarrinhoDeComprasTask.conferirResumoDoCarrinho();
         fazAutenticacaoTask.fazerAutenticacao();
         preencheInformacoresPessoaisTask.preencherInformacoesPessoais();
         confirmaEnderecosTask.confirmarEnderecos();
         confirmaRemessaTask.confirmarRemessa();
         escolheMetodoDePagamentoTask.EscolherFormaDePagamento();
         confirmaResumoDoPedidoTask.ConfirmarResumoDoPedido();
         confirmaPedidoTask.ConfirmarPedido();
         finalizaCompraTask.finalizarCompra();
    }

}
