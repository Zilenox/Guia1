/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.guia1;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author ibohm
 */
public class Arriendo {
    private int Numero;
    private Calendar FechaArriendo; 
    private int Dias;
    private Vehiculo vehiculo;
    private Cliente cliente;
    
    public Arriendo(int Numero, Calendar FechaArriendo,int Dias, Vehiculo vehiculo, Cliente cliente){
        
        setNumero(Numero);
        setFechaArriendo(FechaArriendo);
        setDias(Dias);
        setVehiculo(vehiculo);
        setCliente(cliente);
        if (!validarArriendo()) {
            throw new IllegalArgumentException("VEHICULO Ó CLIENTE INVÁLIDOS");
            /*System.out.println("VEHICULO Ó CLIENTE INVÁLIDOS");
            return;*/
        }
        
        Calendar F_entrega= new GregorianCalendar();
        F_entrega.set(Calendar.DAY_OF_MONTH,getFechaArriendo().get(Calendar.DAY_OF_MONTH));
        F_entrega.set(Calendar.MONTH,getFechaArriendo().get(Calendar.MONTH));
        F_entrega.set(Calendar.YEAR,getFechaArriendo().get(Calendar.YEAR));
        F_entrega.add(Calendar.DAY_OF_MONTH, getDias());
        Devolucion d= new Devolucion(F_entrega);
        
        getVehiculo().setCondicion('A');
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
    public Calendar getFechaArriendo() {
        return FechaArriendo;
    }

    /**
     * @param FechaArriendo the FechaArriendo to set
     */
    public void setFechaArriendo(Calendar FechaArriendo) {
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
        if(!(Dias> 1 && Dias<10))
        {
            System.out.println("EL ARRIENDO DEBE SER ENTRE 2 Y 9 DIAS");
            return;
        }
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
    
    private boolean validarArriendo()
    {
        if(getVehiculo().getCondicion() != 'D' || getCliente().isVigente() == false ) {
            //si condicion vehiculo no es disponible, o el cliente no esta vigente
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        /*
            Example
            System.out.println("Date: " + getFechaArriendo().get(Calendar.DAY_OF_MONTH));
            System.out.println("Month: "+ getFechaArriendo().get(Calendar.MONTH));
            System.out.println("Year: " + getFechaArriendo().get(Calendar.YEAR));
        
        */
        
        return  "Numero  arriendo: " + getNumero()+ "\t" +
                "Fecha arriendo: " + getFechaArriendo()+ "\t" +
                "Días arriendo: " + getDias();
        
 
    }
}
