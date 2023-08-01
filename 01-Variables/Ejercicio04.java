import java.util.Scanner;

public class Ejercicio04{
    public static void main( String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite un numero entero: ");
        int x1 = entrada.nextInt();

        System.out.print("digite otro numero entero: ");
        int x2 = entrada.nextInt();


        x1= x1 + x2;
        x2= x1 - x2;
        x1= x1 - x2;

        System.out.println("el orden es: "+x1 + "y" +x2);


    }
}