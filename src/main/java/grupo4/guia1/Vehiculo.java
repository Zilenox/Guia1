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
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int anno;
    private char condicion;
    
    public Vehiculo(String patente, String marca, String modelo, int anno) {
        setPatente(patente);
        setMarca(marca);
        setModelo(modelo);
        setAnno(anno);
        setCondicion('D');
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        if (!Check_patente(patente)) {
            Vehicule_messages("EL LARGO DE LA PATENTE TIENE QUE SER DE 8 CARACTERES");
            return;
        }
        if(!CheckUppercase(patente))
        {
            Vehicule_messages("LA PATENTE TIENE QUE SER EN MAYUSCULAS");
            return;
        }
        
        this.patente = patente;
    }
    
    public boolean Check_patente(String patente){
        if(patente.length() != 8){
            return false;
        }
        return true;
    }
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        if(!CheckUppercase(marca))
        {
            Vehicule_messages("LA MARCA TIENE QUE SER EN MAYUSCULAS");
            return;
        }
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        if(!CheckUppercase(modelo))
        {
            Vehicule_messages("EL MODELO TIENE QUE SER EN MAYUSCULAS");
            return;
        }
        this.modelo = modelo;
    }

    /**
     * @return the anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param anno the anno to set
     */
    public void setAnno(int anno) {
        
        if(!Check_a??o_fabricacion(anno)){
            Vehicule_messages("EL A??O DE FABRICACI??N DEBE"
                    + " SER MAYOR O IGUAL AL A??O 2000 Y MENOR O IGUAL QUE EL "
                    + " A??O ACTUAL");
        }
        this.anno = anno;
    }
    
    public boolean Check_a??o_fabricacion(int anho){
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear= calendar.get(calendar.YEAR);
        if(anho < 2000  || anho > currentYear) {     
            return false;
        }
        return true;
    }
    /**
     * @return the condicion
     */
    public char getCondicion() {
        return condicion;
    }

    /**
     * @param condicion the condicion to set
     */
    public void setCondicion(char condicion) {
        if (condicion != 'A' && condicion != 'D' && condicion != 'M') {
            Vehicule_messages("LA CONDICI??N DEL VEH??CULO NO ES V??LIDA");
            return;
        }
        if(this.condicion == 'A' && condicion == 'M'){
            Vehicule_messages("VEHICULO ACTUALMENTE ARRENDADO, NO SE PUEDE LLEVAR A MANTENCION");
        }
        this.condicion = condicion;
    }
    
    @Override
    public String toString() {
        return  "PATENTE: " + getPatente() + "\t" +
                "MODELO: " + getModelo() + "\t" +
                "MARCA: " + getMarca() + "\t" +
                "CONDICION: " + getCondicion();
    }
    
    private void Vehicule_messages(String data){
        System.out.println(data);
    }
    
    
    private boolean CheckUppercase(String str_input){
        char[] str_in_array = str_input.toCharArray();

        for (int i=0; i< str_input.length(); i++)
        {
            if(str_in_array[i] < 'A' || str_in_array[i] > 'Z')
            {
                if(str_in_array[i] < '0' || str_in_array[i] > '9')
                {
                    if(str_in_array[i] != '-')
                    {
                        //char no es mayuscula ni numero
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
