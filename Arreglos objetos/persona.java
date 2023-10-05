public class persona{

    int cedula;
    String nombre;
    int edad;
    double altura;
    double peso;
    
    public persona(int dato1, String dato2,int dato3,double dato4, double dato5);

    cedula = dato1;
    nombre = dato2;
    edad = dato3;
    altura = dato4;
    peso = dato5;

}

public int getcedula(){
    return cedula;
}

public String getString(){
    return String;
}
 
public int getedad(){
    return edad;
}

public double getaltura(){
    return altura;
}

public double getpeso(){
    return peso;
}

public void setcedula(int dato){
    cedula = dato;
}

public void setnombre(String dato){
    nombre = dato;
}

public void setedad(int dato){
    edad = dato;
}

public void setaltura(double dato){
    altura = dato;
}

public void setpeso(double dato){
    peso = dato;
}
