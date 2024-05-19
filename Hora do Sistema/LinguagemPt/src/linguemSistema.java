import java.util.Locale;

public class linguemSistema {

    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println(local.getDisplayLanguage()); // imprime "Português
    }
}