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
        
        
        /*a) Crear un cliente asignando los datos directamente 
        (no use entrada por teclado) y pruebe que las validaciones
        implementadas en los mutadores están funcionando. 
        Muestre el estado del cliente recién creado. */
        
        System.out.printf("A)\n");
        Cliente Cli = new Cliente("17000000-3", "Igor");
        
        System.out.println("Estado cliente " + Cli.getNombre() + ":"+ Cli.isVigente());
        System.out.printf("*****************************\n");
        
        
        /*b) Crear un automóvil asignando los datos directamente 
        (no use entrada por teclado) y pruebe que las validaciones 
        implementadas en los mutadores están funcionando.
        Muestre el estado del vehículo recién creado. */
        
        System.out.printf("B)\n");
        Vehiculo V1 = new Vehiculo("XZ-YY-11","KIA","MORNING",2021);
        
        System.out.println("Estado Vehiculo 1: " + V1.getCondicion());
        System.out.printf("*****************************\n");
        
        /*c) Deshabilite al cliente creado 
        y muestre su estado para validar sus datos. */
        
        System.out.printf("C)\n");
        Cli.setVigente(false);
        System.out.println("Estado cliente " + Cli.getNombre() + ":"+ Cli.isVigente());
        System.out.printf("*****************************\n");
        
        /*d) Asigne en mantención al vehículo creado 
        y muestre su estado para validar sus datos. */
        
        System.out.printf("D)\n");
        V1.setCondicion('M');
        System.out.println("Estado Vehiculo 1: " + V1.getCondicion());
        System.out.printf("*****************************\n");
        
        /*e) Pruebe el ingreso de un arriendo ejecutando 
        la entrada de datos directa (sin teclado) por agregación 
        o composición según corresponda. 
        Use datos y/o objetos distintos a los que creó en a) y b). 
        Ingrese dos arriendos: uno que se ingrese satisfactoriamente..... */
        
        System.out.printf("E.1)\n");
        Cliente Cli2 = new Cliente("18333555-3", "DIEGO");
        Vehiculo V2 = new Vehiculo("AB-CD-12","SUZUKI","BALENO",2018);
        
        Calendar fecha_inicio = new GregorianCalendar();
        Arriendo r1 = new Arriendo(1001,fecha_inicio,4,V2,Cli2,23000);
        if(r1.Ingresar_arriendo())
            r1.GENERAR_TICKET();
        System.out.println("Estado Vehiculo 2: " + V2.getCondicion());
        System.out.printf("*****************************\n");
        
        
        
        /*y otro que no. Para ambos casos muestre mensajes al usuario según corresponda.
        Para el ingreso del arriendo satisfactorio genere el ticket de arriendo.
        Muestre el estado del vehículo arrendado para ver si sus datos están correctos*/
        
        System.out.printf("E.2)\n");
        Cliente Cli3 = new Cliente("17123123-4", "HUGO");
        Vehiculo V3 = new Vehiculo("AB-CD-12","CHEVROLET","SPARK",2017);
        Cli3.setVigente(false); //Condicion de ingreso insatisfactorio, cliente no habilitado
        
        Arriendo r2 = new Arriendo(1001,fecha_inicio,4,V3,Cli3,23000);
        if(r2.Ingresar_arriendo())      // -> si se ingresa el arriendo satisfactoriamente se genera el ticket
            r2.GENERAR_TICKET();
        else                            // -> sino se destruye el objeto
            r2=null;
        System.out.println("Estado Vehiculo 3: " + V3.getCondicion());
        System.out.printf("*****************************\n");
        
        /*f) Finalmente, ingrese dos devoluciones: 
        una que se ingrese satisfactoriamente y otra no. 
        Muestre mensajes al usuario según corresponda. 
        Muestre el estado del vehículo devuelto para ver si sus datos están correctos. */
        
        System.out.printf("F)\n");
        
        // Devolucion insatisfactoria, se entrega un vehiculo que no esta ligado a ese arriendo
        r1.Ingresar_devolucion(V3);

        // Devolucion satisfactoria
        
        System.out.println("Estado Vehiculo 2 PRE-DEVOLUCION: " + V2.getCondicion());
        r1.Ingresar_devolucion(V2);
        System.out.println("Estado Vehiculo 2 POST-DEVOLUCION: " + V2.getCondicion());
        System.out.printf("*****************************\n");
        
        
    }
}
