import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la temperatura en grados celcius: ");
        float grados_celcius = entrada.nextFloat();

        float temperatura = (grados_celcius*9/5)*32;

        System.out.print("La temperatura en grados farenheit es: "+temperatura);
        


    }
} 