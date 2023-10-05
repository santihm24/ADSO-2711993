import java.util.Scanner;

public class Ejercicio01{
    public static void main( String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.outprintln("digite un numero: ");
        int numero1 = entrada.nextInt();

        System.outprintln("digite otro numero: ");
        int numero2 = entrada.nextInt();

        int suma = numero1+numero2;

        System.outprintln("la suma de los dos numeros fue: " +suma);
    }
}