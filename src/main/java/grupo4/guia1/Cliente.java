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
        if(!check_rut(Cedula)){
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
        
        if (str_input.length() != 10) {
            CLIENTE_messages("EL LARGO DE LA CEDULA TIENE QUE SER DE 10 CARACTERES");
            return false;
        }
        
        if(str_in_array[8] != '-' || !(str_in_array[9] >= '0' && str_in_array[9] <= '9')) {
            CLIENTE_messages("EL FORMATO DE LA CEDULA ES INCORRECTO");
            return false;
        }
        
        for (int i=0; i< 8; i++)
        {
            if(str_in_array[i] < '0' || str_in_array[i] > '9'){
                CLIENTE_messages("EL FORMATO DE LA CEDULA ES INCORRECTO");
                return false;
            }
        }
        
        return true;
    }
    
    private void CLIENTE_messages(String data){
        System.out.println(data);
    }
}
