/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.guia1;

/**
 *
 * @author ibohm
 */
public class Cliente {
    private String Cedula;
    private String Nombre;
    private boolean Vigente;

    public Cliente(String Cedula, String Nombre)
    {
        setCedula(Cedula);
        setNombre(Nombre);
        setVigente(true);
    }
    
    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        if (Cedula.length() != 10) {
            //throw new IllegalArgumentException("EL LARGO DE LA PATENTE DEBE SER DE 8");
            System.out.println("EL LARGO DE LA CEDULA TIENE QUE SER DE 10 CARACTERES");
            return;
        }
        if(!check_rut(Cedula)){
            System.out.println("EL FORMATO DE LA CEDULA ES INCORRECTO");
            return;
        }
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Vigente
     */
    public boolean isVigente() {
        return Vigente;
    }

    /**
     * @param Vigente the Vigente to set
     */
    public void setVigente(boolean Vigente) {
        this.Vigente = Vigente;
    }
    
    
    private boolean check_rut(String str_input){
        char[] str_in_array = str_input.toCharArray();
        
        
        
        if(str_in_array[8] != '-')
            return false;
        else if (!(str_in_array[9] >= '0' && str_in_array[9] <= '9'))  
        {
            if(str_in_array[9] != 'k' && str_in_array[9] != 'K')
                return false;
        }
        for (int i=0; i< 8; i++)
        {
            if(str_in_array[i] < '0' || str_in_array[i] > '9')
            {
                return false;
            }
        }
        
        return true;
    }
}
