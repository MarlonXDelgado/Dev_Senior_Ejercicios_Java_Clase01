import java.util.Scanner;

public class PedireImprimirPorConsola {
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);
        String palabra1;
        String palabra2;
        String palabra3;

        System.out.println("Introduzca la 1er palabra: ");
        palabra1 = entrada.nextLine();

        System.out.println("Introduzca la 2da palabra: ");
        palabra2 = entrada.nextLine();

        System.out.println("Introduzca la 3er palabra: ");
        palabra3 = entrada.nextLine();

        System.out.printf("%s %s %s", palabra1, palabra2,palabra3);

        entrada.close();
        
    }
}
