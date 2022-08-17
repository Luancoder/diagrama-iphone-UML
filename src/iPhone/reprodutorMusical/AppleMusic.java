package iPhone.reprodutorMusical;

public class AppleMusic extends ReprodutorMusical {

    public void abrirReprodutorMusical() {
        selecionarMusica();
        reproduzirMusica();
        pausarMusica();
    }

    protected void selecionarMusica() {
        System.out.println("Secionando música...");
    }


    protected void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }


    protected void pausarMusica() {
        System.out.println("Pausando música...");
    }
}
