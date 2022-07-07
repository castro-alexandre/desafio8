package pagamento;

public class ParcelaUnica implements Parcelamento {

    private final int numeroParcelas = 1;

    @Override
    public void mensagemInicial() {
        System.out.println("Este tipo de pagamento será realizado em uma única parcela:");
    }

    @Override
    public void numParcelas(int num) {
    }

    @Override
    public int getNumParcelas() {
        return this.numeroParcelas;
    }
}
