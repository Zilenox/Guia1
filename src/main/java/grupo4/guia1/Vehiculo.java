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
        if (patente.length() != 8) {
            //throw new IllegalArgumentException("EL LARGO DE LA PATENTE DEBE SER DE 8");
            System.out.println("EL LARGO DE LA PATENTE TIENE QUE SER DE 8 CARACTERES");
            return;
        }
        if(!CheckUppercase(patente))
        {
            //throw new IllegalArgumentException("LA PATENTE TIENE QUE SER EN MAYUSCULAS");
            System.out.println("LA PATENTE TIENE QUE SER EN MAYUSCULAS");
            return;
        }
        
        this.patente = patente;
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
            //throw new IllegalArgumentException("LA PATENTE TIENE QUE SER EN MAYUSCULAS");
            System.out.println("LA MARCA TIENE QUE SER EN MAYUSCULAS");
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
            //throw new IllegalArgumentException("LA PATENTE TIENE QUE SER EN MAYUSCULAS");
            System.out.println("EL MODELO TIENE QUE SER EN MAYUSCULAS");
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
        GregorianCalendar calendar = new GregorianCalendar();
        
        int currentYear= calendar.get(calendar.YEAR);
        //System.out.printf("current year: %d\n", currentYear);
        if (anno < 2000  || anno > currentYear) {     
            /*throw new IllegalArgumentException("EL AÑO DE FABRICACIÓN DEBE"
                    + " SER MAYOR O IGUAL AL AÑO 2000 Y MENOR O IGUAL QUE EL "
                    + " AÑO ACTUAL");*/
            System.out.println("EL AÑO DE FABRICACIÓN DEBE"
                    + " SER MAYOR O IGUAL AL AÑO 2000 Y MENOR O IGUAL QUE EL "
                    + " AÑO ACTUAL");
        }
        this.anno = anno;
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
            //throw new IllegalArgumentException("LA CONDICIÓN DEL VEHÍCULO NO ES VÁLIDA");
            System.out.println("LA CONDICIÓN DEL VEHÍCULO NO ES VÁLIDA");
            return;
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
    
    private boolean CheckUppercase(String str_input){
        char[] str_in_array = str_input.toCharArray();
        //System.out.println("lenght:"+str_input.length());
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
