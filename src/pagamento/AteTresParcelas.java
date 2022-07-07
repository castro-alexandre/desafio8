package pagamento;

import java.io.Console;

public class AteTresParcelas implements Parcelamento{

    private int numParcelas;

    @Override
    public void numParcelas(int num) {
        if (num >= 3) {
            this.numParcelas = 3;
        } else if (num > 0 && num < 3) {
            this.numParcelas = num;
        } else {
            this.numParcelas = 1;
        }
    }
    
    @Override
    public int getNumParcelas() {
        return this.numParcelas;
    }

    @Override
    public void mensagemInicial() {
        System.out.println("Você poderá dividir o pagamento em até 3 vezes. Quantas vezes quer dividir?");
        Console con = System.console();
        int numeroParcelas = Integer.parseInt(con.readLine());   
        System.out.println("Obrigado.");
        this.numParcelas(numeroParcelas);
    }
}
