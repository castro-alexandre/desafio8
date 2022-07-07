
import java.util.Arrays;
import java.util.List;

import clientes.Cliente;
import compra.Compra;
import compra.CarrinhoDeCompra;
import pagamento.TipoDePagamento;
import produtos.categorias.Brinquedo;
import produtos.categorias.Eletrodomestico;
import produtos.categorias.Eletronico;
import produtos.categorias.Vestuario;
import produtos.tiposDeProdutos.TipoDeBrinquedo;
import produtos.tiposDeProdutos.TipoDeEletrodomestico;
import produtos.tiposDeProdutos.TipoDeEletronico;
import produtos.tiposDeProdutos.TipoDeVestuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente("Francisco", 12345678900L);
        Cliente cliente2 = new Cliente("Alexandre", 10987654321L);
        
        Brinquedo b = new Brinquedo(TipoDeBrinquedo.BICICLETA, 1, 1000);
        Eletrodomestico ed = new Eletrodomestico(TipoDeEletrodomestico.SOM, 2, 2000);
        Eletronico el = new Eletronico(TipoDeEletronico.CELULAR, 3, 3000);
        Vestuario v = new Vestuario(TipoDeVestuario.BLUSA, 4, 100);

        CarrinhoDeCompra carrinho1 = new CarrinhoDeCompra(cliente1);
        CarrinhoDeCompra carrinho2 = new CarrinhoDeCompra(cliente2);
        
        List<CarrinhoDeCompra> carrinhos = Arrays.asList(carrinho1, carrinho2);

        for (CarrinhoDeCompra carrinho : carrinhos) {
            for (int i = 0; i < 15; i++) {
                carrinho.put("prod" + i, b);
            }
        }

        for (int i = 0; i < 5; i++) {
            carrinho2.remove("prod" + i);
        }

        // O cliente1 finalizará a compra, pagando com boleto.
        Compra compra1 = new Compra(carrinho1, TipoDePagamento.BOLETO);
        compra1.finalizaCompra();

        // O cliente2 finalizará a compra, pagando em 3 vezes com Cartão Parcelado.
        Compra compra2 = new Compra(carrinho2, TipoDePagamento.CARTAO_PARCELADO);
        compra2.finalizaCompra();
    }
}
