package compra;

import java.util.HashMap;
import java.util.Map;

import clientes.Cliente;
import produtos.categorias.CategoriaProduto;

public class CarrinhoDeCompra {
    
    private Map<String, CategoriaProduto> carrinho;
    private Cliente cliente;
    private double precoTotal;

    public CarrinhoDeCompra(Cliente cliente) {
        this.cliente = cliente;
        this.carrinho = new HashMap<>();
        this.precoTotal = 0;
    }

    public boolean put(String key, CategoriaProduto value) {
        try {
            this.carrinho.put(key, value);
            this.precoTotal += value.getPreco();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(String key){
        try {
            CategoriaProduto produto = this.carrinho.remove(key);
            this.precoTotal -= produto.getPreco();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean clear() {
        try {
            this.carrinho.clear();
            this.precoTotal = 0;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public CategoriaProduto get(String key) {
        return this.carrinho.get(key);
    }

    public Map<String,CategoriaProduto> getCarrinho() {
        return this.carrinho;
    }

    public void setCarrinho(Map<String,CategoriaProduto> carrinho) {
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return "{" +
            " carrinho='" + getCarrinho() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", precoTotal='" + getPrecoTotal() + "'" +
            "}";
    }

}
