package produtos.categorias;

import produtos.tiposDeProdutos.TipoDeBrinquedo;

public class Brinquedo extends CategoriaProduto {
    
    TipoDeBrinquedo brinquedo;

    public Brinquedo(TipoDeBrinquedo brinquedo, int codigo, double preco) {
        super(codigo, preco);
        this.brinquedo = brinquedo;
    }

    public TipoDeBrinquedo getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(TipoDeBrinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    @Override
    public String toString() {
        return "{" +
            " brinquedo='" + getBrinquedo() + "'" +
            "}";
    }
}
