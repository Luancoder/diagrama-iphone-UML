package iPhone.navegador;

public class Safari extends Navegador {

    public void abrirNavegador() {
        exibirPagina();
        atulizarPagina();
        novaAba();
    }

   protected void exibirPagina() {
        System.out.println("Exibindo página...");
    }


  protected void atulizarPagina() {
        System.out.println("Atualizando página...");
    }


   protected void novaAba() {
        System.out.println("Abrindo nova aba");
    }
}
