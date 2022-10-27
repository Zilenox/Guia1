/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.guia1;
import java.util.GregorianCalendar;
/**
 *
 * @author ibohm
 */
public class Arriendo {
    private int Numero;
    private GregorianCalendar FechaArriendo; 
    private int Dias;
    private Vehiculo vehiculo;
    private Cliente cliente;
    
    public Arriendo(int Numero, GregorianCalendar FechaArriendo,int Dias, Vehiculo vehiculo, Cliente cliente){
        setNumero(Numero);
        setFechaArriendo(FechaArriendo);
        setDias(Dias);
        setVehiculo(vehiculo);
        setCliente(cliente);
        
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the FechaArriendo
     */
    public GregorianCalendar getFechaArriendo() {
        return FechaArriendo;
    }

    /**
     * @param FechaArriendo the FechaArriendo to set
     */
    public void setFechaArriendo(GregorianCalendar FechaArriendo) {
        this.FechaArriendo = FechaArriendo;
    }

    /**
     * @return the Dias
     */
    public int getDias() {
        return Dias;
    }

    /**
     * @param Dias the Dias to set
     */
    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
