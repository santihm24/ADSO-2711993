import java.util.Scanner;

public class Ejercicio02{
    public static void main( String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la temperatura en Celsius: ");
        float tem = entrada.nextFloat();

        float grados_f = (tem*9/5)+32;

        System.out.print("la temperatura en farenheit es: "+grados_f);
        
    }
} 


        

