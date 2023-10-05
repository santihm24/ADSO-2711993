import java.util.Scanner;

public class Ejerciciof01{

    public static void main(String[] args) {

		int años = 20;
		imprimirAños( años );

		// Invocando Funcion
		System.out.println("Resultado suma:"+sumar(5, 4) );
		System.out.println("Resultado suma:"+sumar(2, 3) );
		System.out.println("Resultado suma:"+sumar(7, 8) );
		System.out.println("Resultado suma:"+sumar(-1, 20) );
        System.out.println("Resultado suma:"+sumar(6, 8) );
	}

	public static int sumar(int a, int b){
		int respuesta = a + b;
		return respuesta;
	}

	public static void imprimirAños(int a){
		System.out.println("Los años son: "+a);
	}

}
