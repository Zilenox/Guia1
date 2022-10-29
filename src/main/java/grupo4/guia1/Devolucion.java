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
    private Arriendo arriendo;
    public Devolucion(Arriendo arriendo, Calendar FechaEntrega)
    {
        setArriendo(arriendo);
        setFechaEntrega(FechaEntrega);
        
    }

    private boolean ValidarFechaEntrega(Calendar fecha){
        if(getArriendo().getFechaArriendo().compareTo(fecha) >0){
            DEVOLUCION_messages("Fecha de devolucion no puede ser anterior a la fecha de arriendo");
            return false;
        }
        return true;
    }
    public boolean ValidarDevolucion(Vehiculo v){
        if(getArriendo().getVehiculo().equals(v)){
            getArriendo().getVehiculo().setCondicion('D');
            return true;
        }
        return false;
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
        if(!ValidarFechaEntrega(FechaEntrega)){
            return;
        }
        this.FechaEntrega = FechaEntrega;
    }

    /**
     * @return the arriendo
     */
    private Arriendo getArriendo() {
        return arriendo;
    }

    /**
     * @param arriendo the arriendo to set
     */
    private void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }

    private void DEVOLUCION_messages(String data){
        System.out.println(data);
    }
}
