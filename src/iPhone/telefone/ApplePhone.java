package iPhone.telefone;

public class ApplePhone extends Telefone {

    public void abrirApplePhone() {
        fazerLigacao();
        atenderLigacao();
        reproduzirCorreioVoz();
    }

    protected void fazerLigacao() {
        System.out.println("Ligando para um contato...");
    }


    protected void atenderLigacao() {
        System.out.println("Atendendo ligação...");
    }


    protected void reproduzirCorreioVoz() {
        System.out.println("Reproduzindo correio de voz...");
    }
}
