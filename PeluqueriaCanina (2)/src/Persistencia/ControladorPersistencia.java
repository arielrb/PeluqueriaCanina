package Persistencia;

import Logica.Cliente;

public class ControladorPersistencia {
    //Hago una instacia de jpa controller para vincular y relizar el metodo
    ClienteJpaController clienteJPA = new ClienteJpaController();
    //metodo para dar de alta
    public void crearCliente(Cliente client){
    try
        {
        clienteJPA.create(client);
        }
        catch (Exception exc){
            System.out.println("No se pudo crear el cliente");
        }
        
    }

}
