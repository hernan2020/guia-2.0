
import java.util.Scanner;


public class colectivo
{
    public static void main(String[]args)
  
    {

    Scanner teclado = new Scanner(System.in);
   
    int capabus;    
    int npersonas;
   
      
    double gentepag= 10000;
    int conduc=    2000; 
   
   
     System.out.println("capacidad del bus ");
     capabus = teclado.nextInt();
     System.out.println("personas a recoger ");
     npersonas = teclado.nextInt();
   
  int primero= npersonas / capabus;
  boolean segundo= npersonas % capabus !=0 ? true : false;
    
   
  
   
   if(segundo)
   {
    primero ++;
    }
    
     
     
    System.out.println("trayectos de bus : "+ primero);
     
     
     
    System.out.println("dinero a pagar turistas :"+ npersonas*gentepag);
    
    
    System.out.println("pago del conductor al propietario :"+primero*conduc);

         
     
     
      
}
}