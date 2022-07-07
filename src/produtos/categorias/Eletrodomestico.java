package produtos.categorias;

import produtos.tiposDeProdutos.TipoDeEletrodomestico;

public class Eletrodomestico extends CategoriaProduto {
    
    private TipoDeEletrodomestico eletrodomestico;

    public Eletrodomestico(TipoDeEletrodomestico eletrodomestico, int codigo, double preco) {
        super(codigo, preco);
        this.eletrodomestico = eletrodomestico;
    }

    public TipoDeEletrodomestico getEletrodomestico() {
        return eletrodomestico;
    }

    public void setEletrodomestico(TipoDeEletrodomestico eletrodomestico) {
        this.eletrodomestico = eletrodomestico;
    }

    @Override
    public String toString() {
        return "{" +
            " eletrodomestico='" + getEletrodomestico() + "'" +
            "}";
    }

}
