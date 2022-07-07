package pagamento;

public enum TipoDePagamento {

    BOLETO(new ParcelaUnica()), 
    CARTAO_PARCELADO(new AteTresParcelas()), 
    CARTAO_A_VISTA(new ParcelaUnica()),
    PAYPAL(new ParcelaUnica());

    private Parcelamento parcelamento;

    private TipoDePagamento(Parcelamento parcelas) {
        this.parcelamento = parcelas;
    }

    public Parcelamento getParcelamento() {
        return this.parcelamento;
    }
}
