package iPhone.menuAplicativos;

import iPhone.navegador.Safari;
import iPhone.reprodutorMusical.AppleMusic;
import iPhone.telefone.ApplePhone;

public class MenuAplicativos {
    public static void main(String[] args) {
        System.out.println("<<<<<Menu de aplicativos: >>>>>");

        System.out.println("---Abrir AppleMusic ---");
        AppleMusic appleMusic = new AppleMusic();
        appleMusic.abrirReprodutorMusical();

        System.out.println("---Abrir Safari ---");
        Safari safari =new Safari();
        safari.abrirNavegador();

        System.out.println("---Abrir ApplePhone ---");
        ApplePhone applePhone = new ApplePhone();
        applePhone.abrirApplePhone();
    }
}
