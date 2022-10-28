/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo4.guia1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ibohm
 */
public class Guia1 {

    public static void main(String[] args) {
        Vehiculo V = new Vehiculo("XX-YY-22","KIA","HFG",2019);
        Cliente C = new Cliente("17000000-K", "Igor");
        
        Calendar fecha_inicio = new GregorianCalendar();
        fecha_inicio.add(Calendar.MONTH, 1);
        Arriendo r = new Arriendo(1,fecha_inicio,5,V,C);

        
    }
}
