import java.util.Scanner;

public class impuestos
{
    
    
    public static void main(java.lang.String[]args)
    {
     
            Scanner teclado= new Scanner(System.in);
        
        
        double prec_bruto;
        int opc;                    
        double camio;
        double automovil;
        double impcam;
        double impauto;
        double impu=5;
        double impuQ;
        double impA=9;
       
        
        System.out.println("digite el precio bruto : "); 
        prec_bruto=teclado.nextDouble();
        System.out.println("seleccione tipo de vehiculo ");
        System.out.println("1. camioneta");
        System.out.println("2. automovil");
        
                     
       
        opc= teclado.nextInt();
        
        
            
        switch(opc)
       
    
       {
        
           case 1:
         
         
            {
                
                 if(prec_bruto < 80 )
                {
                  
                    System.out.println("no hay impuestos = 0");
                  
                }
                else
                   {
                    impcam=prec_bruto/2;
                    System.out.println(" el impuesto es " + impcam);
                    }
            }
        
           break;
           
           case 2:
           
           
                {
                  if(prec_bruto <20)
                    {
                     impauto=prec_bruto+impu;
                     System.out.println("precio bruto mas impuesto: " +impauto);
                    }
                   
                                     
                    else 
                   if(prec_bruto>=20&&prec_bruto<=40)
                                    
                   {
                       impuQ=prec_bruto/5;
                       System.out.println("precio bruto mas impuesto: " + impuQ);
                    }
                    
                    if (prec_bruto >40)
                    {
                       impA=prec_bruto+impA;
                       System.out.println("precio bruto mas impuesto : " + impA);
                    }
                }
            break;
            
            default:
        
            System.out.println("la opcion no es valida");
            
            
            
       
        
        
            
        }
    
        }
        
}
