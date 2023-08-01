import java.util.Scanner;

public class Ejercicio05{
    public static void main( String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la base: ");
        float base = entrada.nextFloat();

        System.out.print("Digite la altura: ");
        float altura = entrada.nextFloat();

        float Area = (base*altura)/2;

        System.out.print("El area del triangulo es: "+Area);

    }
}

    

