package produtos.categorias;

import produtos.tiposDeProdutos.TipoDeEletronico;

public class Eletronico extends CategoriaProduto {
    
    private TipoDeEletronico eletronico;

    public Eletronico(TipoDeEletronico eletronico, int codigo, double preco) {
        super(codigo, preco);
        this.eletronico = eletronico;
    }

    public TipoDeEletronico getEletronico() {
        return eletronico;
    }

    public void setEletronico(TipoDeEletronico eletronico) {
        this.eletronico = eletronico;
    }

    @Override
    public String toString() {
        return "{" +
            " eletronico='" + getEletronico() + "'" +
            "}";
    }

}
