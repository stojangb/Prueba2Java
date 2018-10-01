
package Remuneraciones;
import java.util.Scanner;


public class Test_Liquidación {
     Scanner scan = new Scanner(System.in);  
     
       private String rut,nombre;
        
       public int dt,sb,cf; // dias trabajados , sueldo base , carga familiar 
       public double he; //horas extra
        
     
     public String Setrut(String rut){
      return this.rut = rut;
      }
     
     public int Getdt(){
     return dt;
     }

    public static void main(String[] args) {
      
      Test_Liquidación liquid = new Test_Liquidación();
      
      
      
      
 
        
        Automoviles car = new Automoviles();
        System.out.print("");
        System.out.print(car.getMarca());
        System.out.println("");
        
        System.out.println("Esto deberia mostrar la suma de 4 y 5");
        
        System.out.println(car.cuatro+car.cinco);
        
        
        System.out.println("Hola");
        
    
        
   
        
        System.out.println("Por favor ingrese Nombre: ");
        //liquid.nombre = scan.next();
        System.out.println("Por favor ingrese RUT: ");
        liquid.rut = "hola rut";
        //liquid.Setrut(rut) = scan.next();          
       
        
        System.out.println("Por favor ingrese Días trabajados: ");
        //liquid.dt = scan.nextInt();
        System.out.println("Por favor ingrese Sueldo Base: ");
       // liquid.sb = scan.nextInt();
        System.out.println("Por favor ingrese carga familiar: ");
       // liquid.cf = scan.nextInt();
        System.out.println("Por favor ingrese, Si ha trabajado horas extra la cantidad de horas extra trabajadas: ");
       // liquid.he = scan.nextDouble();        
        //debo enviar estos datos mediante referencia a objetoa a imponible
        
            
    //Métodos
    

    
        
        
        
        System.out.println("");
        System.out.println("LIQUIDACION DE SUELDO POR PANTALLA\n" +
"****************** DATOS DEL TRABAJADOR****************************\n" +
"Rut : (1 puntos)\n" +
"Nombre : (1 puntos)\n" +
"Días Trabajados : (1 puntos)\n" +
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
