package produtos.categorias;

import produtos.tiposDeProdutos.TipoDeVestuario;

public class Vestuario extends CategoriaProduto {

    private TipoDeVestuario vestuario;

    public Vestuario(TipoDeVestuario vestuario, int codigo, double preco) {
        super(codigo, preco);
        this.vestuario = vestuario;
    }

    public TipoDeVestuario getVestuario() {
        return vestuario;
    }

    public void setVestuario(TipoDeVestuario vestuario) {
        this.vestuario = vestuario;
    }

    @Override
    public String toString() {
        return "{" +
            " vestuario='" + getVestuario() + "'" +
            "}";
    }
    
}
