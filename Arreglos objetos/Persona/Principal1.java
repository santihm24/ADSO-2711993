package Persona;

public class Principal1 {
    public static void main(Strings[]args){
        Persona listado [] = new Persona [10];
        listado[0] = new Persona(1225093538,Santiagoa,23,181,84);
        listado[1] = new Persona(12456564,Juan,43,234,212);

        for (int i=0; i<listado.length;i++){
            if(listado[i] != null){
                System.out.println("=>" +listado[i].getcedula())
            }
        }
    }
}
