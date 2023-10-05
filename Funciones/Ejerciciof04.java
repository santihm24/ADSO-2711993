import java.util.Scanner;

public class Ejerciciof04 {

    public static void main (String[] args){

        System.out.println("Resultado division:"+dividir(5, 5) );
		System.out.println("Resultado division:"+dividir(2, 3) );
		System.out.println("Resultado division:"+dividir(7, 8) );
		System.out.println("Resultado division:"+dividir(1, 20) );
		System.out.println("Resultado division:"+dividir(355, 20) );
	}

	public static int dividir(int a, int b){
		int respuesta = a / b;
		return respuesta;
	}


}
