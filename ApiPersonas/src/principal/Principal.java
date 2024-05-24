
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;

public class Principal {
    
    public static void main(String[] args){
        
        CRUD ventana = new CRUD();
        
        
        /*//EndPoint obtener
        ConsumoAPI consumo = new ConsumoAPI();
        
        
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta obtener: " +respuesta01);
        
        
        //Endpoint insertar
        Map<String,String> datosInsertar = new HashMap<>();
        datosInsertar.put("cedula","122509355");
        datosInsertar.put("nombres","santiago");
        datosInsertar.put("apellidos","Hoyos");
        datosInsertar.put("telefono","31938667");
        datosInsertar.put("direccion","cuba");
        datosInsertar.put("email","santiago@gmail.com");
        
        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php",datosInsertar);
        System.out.println("Respuesta Insertar: "+respuesta02 );
        
        
        //EndPoint actualizar
        
        Map<String, String> datosActualizar = new HashMap<>();
        
        datosActualizar.put("cedula","122509355");
        datosActualizar.put("nombres","santiagoo");
        datosActualizar.put("apellidos","Hoyoss");
        datosActualizar.put("telefono","31938667");
        datosActualizar.put("direccion","cuba");
        datosActualizar.put("email","santiago@gmail.com");
        
        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php",datosActualizar);
        System.out.println("Respuesta Actualizar: "+respuesta03 );
        
        
        Map<String, String> datosEliminar = new HashMap<>();
        
        datosEliminar.put("cedula","122509355");
        String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
        System.out.println("Respuesta Eliminar: "+respuesta04 );
        
        //Extrayendo datos de un texto JSON
        
        JsonArray listado = JsonParser.parseString(respuesta01).getAsJsonArray();
        for(int i = 0; i<listado.size(); i++){
           
       
           JsonObject temp = listado.get(i).getAsJsonObject();
           
           String cedula = temp.get("cedula").getAsString();
           String nombres = temp.get("nombres").getAsString(); 
           String apellidos = temp.get("apellidos").getAsString();
           String telefono = temp.get("telefono").getAsString();
           String direccion = temp.get("direccion").getAsString();
           String email = temp.get("email").getAsString();
           
           System.out.println(cedula+" - "+nombres);
           
            
        }*/
       
        
    }
    
}

        
        
        
        
        
        
        