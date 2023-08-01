import java.util.Scanner;
 public class Ejercicio03{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un numero entero: ");
        int Primer_numero_entero = entrada.nextInt();

        System.out.print("Digite segundo numero entero: ");
        int Segundo_numero_entero = entrada.nextInt();

        int mezcla = Primer_numero_entero;

        Primer_numero_entero = Segundo_numero_entero;

        Segundo_numero_entero = mezcla;
        System.out.print("Primer numero: "+Primer_numero_entero+"segundo numero: "+Segundo_numero_entero);


    }

}