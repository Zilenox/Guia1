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
    private int precio_diario;
    private Devolucion devolucion;
    
    public Arriendo(int Numero, Calendar FechaArriendo,int Dias, Vehiculo vehiculo, Cliente cliente, int precio_diario){
        
        /*if (!EvaluarArriendo(vehiculo,cliente)) {
            return;
        }*/
        setNumero(Numero);
        setFechaArriendo(FechaArriendo);
        setDias(Dias);
        setVehiculo(vehiculo);
        setCliente(cliente);
        setPrecio_diario(precio_diario);
        
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
        if(!Validar_dias(Dias)){
            return;
        }
            this.Dias = Dias;
    }
    
    public boolean Validar_dias(int dias){
        if(!(dias> 1 && dias<10)){
            ARRIENDO_messages("ERROR EL ARRIENDO DEBE SER ENTRE 2 Y 9 DIAS");
            return false;
        }
        return true;
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
        /**
     * @return the precio_diario
     */
    public int getPrecio_diario() {
        return precio_diario;
    }

    /**
     * @param precio_diario the precio_diario to set
     */
    public void setPrecio_diario(int precio_diario) {
        this.precio_diario = precio_diario;
    }
    public boolean EvaluarArriendo(Vehiculo v,Cliente c)
    {
        if(v.getCondicion() != 'D' || c.isVigente() == false ) {
            ARRIENDO_messages("VEHICULO Ó CLIENTE INVÁLIDOS");
            return false;
        }
        return true;
    }
    
    public boolean Ingresar_arriendo(){
        if(!EvaluarArriendo(this.vehiculo, this.cliente)){
            return false;
        }
        vehiculo.setCondicion('A');
        return true;
    }
    
    public void Ingresar_devolucion(Vehiculo veh){
        Calendar F_entrega= new GregorianCalendar();
        Devolucion d= new Devolucion(this,F_entrega);
        if(d.ValidarDevolucion( veh)){
            ARRIENDO_messages("Devolucion correcta");
        }
        else
            ARRIENDO_messages("Devolucion incorrecta");
    }
    
    
    public String getTOTAL(){
        Integer total = getDias()*getPrecio_diario();
        return total.toString();
    }
    
    
    
    public void GENERAR_TICKET() {
        int month_plusone =getFechaArriendo().get(Calendar.MONTH) +1;
        ARRIENDO_messages("--------------------------------------------------------------------------\n"
                + "\t\t\t" + "TICKET ARRIENDO VEHICULO\n"
                + "\t\t\t" + "NUMERO ARRIENDO\t:" + getNumero()+ "\n" 
                + "\t\t\t" + "VEHICULO \t:" + getVehiculo().getPatente() + " " 
                + getVehiculo().getMarca() + " " + getVehiculo().getModelo() + "\n"
                + "\t\t\t" + "PRECIO DIARIO\t$" + getPrecio_diario() + "\n\n"
                + "FECHA\t\tCLIENTE\t\t\tDIAS\t\tA PAGAR\n"
                + "--------------------------------------------------------------------------\n"
                + getFechaArriendo().get(Calendar.DAY_OF_MONTH)+ "-"
                + month_plusone + "-"      
                + getFechaArriendo().get(Calendar.YEAR)+ "\t"  
                + getCliente().getCedula() + "/" + getCliente().getNombre() + "\t\t"
                + getDias() + " dias\t\t" +getTOTAL() + "\n"
                + "--------------------------------------------------------------------------\n"
                + "\n\n\t\t\t\t\t\t\t-------------\n\t\t\t\t\t\t\t FIRMA CLIENTE ");
     }

    /**
     * @return the devolucion
     */
    public Devolucion getDevolucion() {
        return devolucion;
    }

    /**
     * @param devolucion the dev to set
     */
    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    private void ARRIENDO_messages(String data){
        System.out.println(data);
    }
}
