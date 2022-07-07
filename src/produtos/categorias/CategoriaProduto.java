package produtos.categorias;
import java.util.Objects;

public abstract class CategoriaProduto {
    
    private int codigo;
    private double preco;

    public CategoriaProduto() {
    }

    public CategoriaProduto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CategoriaProduto)) {
            return false;
        }
        CategoriaProduto categoriaProduto = (CategoriaProduto) o;
        return codigo == categoriaProduto.codigo && preco == categoriaProduto.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, preco);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", preco='" + getPreco() + "'" +
            "}";
    }

}
