
package Remuneraciones;
import java.util.Scanner;


public class Test_Liquidación {
        
     
       
 
       

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Imponible Impon = new Imponible();
         
        System.out.println("Por favor ingrese Nombre: ");    
        
        Impon.setNombre(scan.next());
        
        System.out.println("Por favor ingrese RUT: ");  
        
        Impon.setRut(scan.next());
        
        System.out.println("Por favor ingrese Días trabajados: ");
        
        Impon.setDt(scan.nextInt());
        
        System.out.println("Por favor ingrese Sueldo Base: ");
        
        Impon.setSb(scan.nextInt());
     
        System.out.println("Por favor ingrese carga familiar: ");
        
        Impon.setCf(scan.nextInt());
  
        System.out.println("Por favor ingrese, Si ha trabajado horas extra la cantidad de horas extra trabajadas: ");
        Impon.setHe(scan.nextDouble());
    

        
        
        System.out.println("");
        System.out.println("LIQUIDACION DE SUELDO POR PANTALLA\n" +
"****************** DATOS DEL TRABAJADOR****************************\n" +
"Rut : "+Impon.rut+"\n" +
"Nombre : "+Impon.nombre+"\n" +
"Días Trabajados : \n" +
"Sueldo Base : (1 puntos)\n" +
"Numero Horas Extras : (1 puntos)\n" +
"Cargas Familiares : (1 puntos)\n" +
"****************************IMPONIBLE******************************\n" +
"Valor días trabajados : (2 puntos)\n" +
"Valor gratificación : (2 puntos)\n" +
"Valor horas extras : (2 puntos)\n" +
" ___________________________\n" +
"Total Suma de Imponibles : (4 puntos)\n" +
"****************************NO IMPONIBLE****************************\n" +
"Valor Movilización : (2 puntos)\n" +
"Valor colación : (2 puntos)\n" +
"Valor Carga Familiar : (2 puntos)\n" +
" ___________________________\n" +
"Total Suma de No Imponibles : (4 puntos)\n" +
"*************************** SUMA HABERES ****************************\n" +
"Total Haberes : (sumaImponibles) + (no imponibles) (10 puntos)\n" +
"*************************** DESCUENTOS ****************************\n" +
"Valor AFP 12,75% : (2 puntos)\n" +
"Valor Fonasa 7% : (2 puntos)\n" +
" _____________________________\n" +
"Total Suma Descuentos : (6 puntos)\n" +
"********************* TOTAL A PAGAR ********************************\n" +
"Valor liquido a pagar : (Total Haberes) – (descuentos) (10 puntos) ");
        System.out.println("");
             
        
        
     
        
        

        
                
    }


    
}
