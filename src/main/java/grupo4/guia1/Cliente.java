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
    
}
