/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.guia1;
import java.util.Calendar;


/**
 *
 * @author ibohm
 */
public class Devolucion {
   
    private Calendar FechaEntrega; 
    
    public Devolucion(Calendar FechaEntrega)
    {
        setFechaEntrega(FechaEntrega);
    }

    /**
     * @return the FechaEntrega
     */
    public Calendar getFechaEntrega() {
        return FechaEntrega;
    }

    /**
     * @param FechaEntrega the FechaEntrega to set
     */
    public void setFechaEntrega(Calendar FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }


}
