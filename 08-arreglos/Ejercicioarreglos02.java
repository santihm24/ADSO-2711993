import java.util.Scanner;
public class Ejercicioarreglos02{
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.print("Digite un numero");
        int n = entrada.nextInt();

        String cadena [] = new String [n];

        for (int i = 0; i<cadena.length; i++){

            System.out.println("Escriba una palabra");
            String palabra = texto.nextLine();
            cadena[i] = palabra;
        }

        System.out.println("el arreglo contiene: ");
        for (int i = 0; i<cadena.length; i++){

            System.out.println(cadena[i]);
        }

        System.out.println("ingrese un nombre que este en el arreglo");
        String nombre = texto.nextLine();

        for (int i = 0; i<cadena.length; i++){
            if(cadena[i].equals(nombre)){
                System.out.println("El nombre esta en posicion: "+i);
            }
        }
    }

}
