
import java.util.Scanner;

public class areasombreada

{
    
    public static void main(String[]args)
    
    {
      double a,c,r,areacua,s;
       
       Scanner teclado = new Scanner(System.in);
       System.out.print("digite el radio del circulo= ");
       r=teclado.nextDouble();  
       System.out.print("digite el area del cuadrado= ");
       c=teclado.nextDouble(); 
       areacua=c*c;
       a=Math.PI*(r*r);
       s=areacua-a;
       
       System.out.println("area del circulo="  + a);
       System.out.println("area del cuadrado="  + areacua);
       System.out.println("total area sombreada="  + s);
  
      
      
       
    }

    }