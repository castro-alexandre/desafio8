package compra;

import java.io.Console;

import pagamento.TipoDePagamento;

public class Compra {

    boolean compraFinalizada;
    CarrinhoDeCompra carrinhoDeCompra;
    TipoDePagamento tipoDePagamento;

    public Compra(CarrinhoDeCompra carrinhoDeCompra, TipoDePagamento tipoDePagamento) {
        this.carrinhoDeCompra = carrinhoDeCompra;
        this.tipoDePagamento = tipoDePagamento;
        this.compraFinalizada = false;
    }

    public void atualizaDesconto() {
        if (this.carrinhoDeCompra.getCarrinho().size() >= 15) {
            this.carrinhoDeCompra.setPrecoTotal(this.carrinhoDeCompra.getPrecoTotal() * 0.9);
        }
        if (this.carrinhoDeCompra.getCarrinho().size() >= 10 && this.carrinhoDeCompra.getCarrinho().size() < 15){
            this.carrinhoDeCompra.setPrecoTotal(this.carrinhoDeCompra.getPrecoTotal() * 0.92);
        }
        if (this.carrinhoDeCompra.getCarrinho().size() >= 5 && this.carrinhoDeCompra.getCarrinho().size() < 10) {
            this.carrinhoDeCompra.setPrecoTotal(this.carrinhoDeCompra.getPrecoTotal() * 0.95);
        }
    }

    public boolean autorizaCompra() {
        if (!this.compraFinalizada) {
            atualizaDesconto();
            System.out.println(getCarrinhoDeCompra());
            System.out.println("Gostaria de finalizar esta compra? sim ou não?");
            Console c1 = System.console();
            String resposta = c1.readLine().toLowerCase();
            if (resposta.equals("sim")) {
                return true;
            }
            return false;
        }
        System.out.println("Desculpe, esta compra já foi finalizada");
        return false;
    }

    public boolean finalizaCompra() {
        
        if (this.autorizaCompra()) {
            this.tipoDePagamento.getParcelamento().mensagemInicial();
            int numParcelas = this.tipoDePagamento.getParcelamento().getNumParcelas();
            double valorParcela = this.carrinhoDeCompra.getPrecoTotal()/numParcelas;
            System.out.printf("O pagamento será feito em %d vez(es) de %3.2f.\n", numParcelas, valorParcela);
            System.out.println("Compra efetuada com sucesso!\n");
            this.compraFinalizada = true;
            return true;
        }
        return false;
    }

    public CarrinhoDeCompra getCarrinhoDeCompra() {
        return this.carrinhoDeCompra;
    }
    
}
