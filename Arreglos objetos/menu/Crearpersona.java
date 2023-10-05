import java.util.Scanner;

public class Crearpersona{

    public static void main (String[]args){
        //declaracion de entrada
        Scanner entrada = new
        Scanner(System.in);
        
        //crear el arreglo
        
        Persona lista[] = new Persona[100];

        //Crear el ciclo

        while(opc != 3){

            System.out.print("-----------------------------------");
            System.out.print("---------------Menu-----------------");
            System.out.print("--------------------------------------");
            System.out.print("------------1.Crear Persona-----------");
            System.out.print("------------2.Ver Lista---------------");
            System.out.print("------------3.Salir-------------------");

            int opc = entrada.nextInt();

            System.out.println("Digite la opcion que quiere: ");

            if(opc == 1){

                System.out.print("Digite el nombre:");
                System.out.print("Digite la cedula:");
                System.out.print("Digite la edad:");
                System.out.print("Digite la altura:");
                System.out.println("Digite el peso");

            }


        }



    }
}
