public class Principal{
    public static void main (string[]args) { 
        
        Persona Pe01 = new persona(1225093538,santiago,23,1.81,69);

        System.out.println("cedula"+pe01.getcedula());
        System.out.println("nombre"+pe01.getnombre());
        System.out.println("edad"+pe01.getedad());
        System.out.println("altura"+pe01.getaltura());
        System.out.println("peso"+pe01.getpeso());

    }
}
