import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdusca la cantidad de dinero q tiene: ");
        double dinero = entrada.nextDouble();

        int ramo70 = (int)dinero / 70;
        double resto1 = dinero % 70;

        int ramo120 = (int)dinero / 120;
        double resto2 = dinero % 120;

        System.out.println(String.format( "Puedes compar %s ramos de 70 $ pesos y le sobran %s $", ramo70, resto1));

        System.out.println(String.format( "Y %s ramos de 120 $ pesos y le sobran %s $", ramo120, resto2));


    }
}
