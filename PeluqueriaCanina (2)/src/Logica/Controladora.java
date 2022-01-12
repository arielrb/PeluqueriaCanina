package Logica;
import Persistencia.ControladorPersistencia;
public class Controladora {
    
    ControladorPersistencia controlPersis = new ControladorPersistencia();

public void crearCliente(String num_cliente,String nombre_perro,String raza,String color,String alergico, String atencion_especial,String nombre_duenio,String celular,String observacion){
    //Primero creo un objeto cliente luego seteo las variables que traje del igu
Cliente client = new Cliente();

/*En caso de id doy como parametro un int random que luego sera convertido en la persistencia  
de manera ordenada automaticamente*/

client.setId((int) Math.random());
client.setNombre_perro(nombre_perro);
client.setObservaciones(observacion);
client.setCelular_duenio(celular);
client.setColor(color);
client.setRaza(raza);
client.setNum_cliente(num_cliente);
client.setAtencion_especial(atencion_especial);
client.setAlergico(alergico);
client.setNombre_duenio(nombre_duenio);
//Por ultimo vinculo a la persistencia donde se añadira a la BBDD
controlPersis.crearCliente(client);
}

}