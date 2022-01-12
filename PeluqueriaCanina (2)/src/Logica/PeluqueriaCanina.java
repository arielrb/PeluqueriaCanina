package Logica;

import IGU.Principal;


public class PeluqueriaCanina 
{
    public static void main(String[] args) 
    {//Vinculo al controlador de la logica
        Controladora control = new Controladora();
        //Igu, agregamos la instacia de la logica como parametro a Principal para vincularlos
        Principal principal = new Principal(control);
        //Por ultimo seteo visible y en el centro al programa al ejecutar
        principal.setVisible(true); 
        principal.setLocationRelativeTo(null);
        
    }
    
}
