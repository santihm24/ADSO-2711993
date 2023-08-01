import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un numero: ");
        int n1 = entrada.nextInt();

        System.out.print("digite otro numero: ");
        int n2 = entrada.nextInt();

        int suma = n1+n2;

        System.out.print("la suma de los numeros es: "+suma);

    }
} 