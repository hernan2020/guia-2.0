import java.util.Scanner;

public class conevdeunid

// 1 pulgada equivale a 0.0833 pies
// 1 pulgada equivale a 2.54 centimetros
// 1 legua equivale a 190080.02 centimetros
// 1 yarda equivale a 36 pulgadas
{
    public static void Main(String[]args)
    {
        Scanner teclado= new Scanner(System.in);    
        
        int opc;
        double pulgadas,pies,centimetros,yarda,legua,yard,C,Y,L,P;
        
        System.out.println("INGRESE LA OPCION QUE DESEA CONVERTIR");
        System.out.println("1. pulgadas a pies ");
        System.out.println("2. pulgadas a centimetros");
        System.out.println("3. legua a pulgadas");
        System.out.println("4. yarda a pulgadas");
        
        opc= teclado.nextInt();
        
        switch(opc)
        {
                // 1 pulgada equivale a 0.0833 pies
                // 1 pulgada equivale a 2.54 centimetros
                // 1 legua equivale a 190080.02 pulgadas
               // 1 yarda equivale a 36 pulgadas
        case 1:
            System.out.println("digite la cantidad de pulgadas a convertir:");
            pulgadas=teclado.nextDouble();
            //pies= P
            P= pulgadas * 0.0833;
            System.out.println("las pulgadas equivalen a :  " + P+  "  PIES");
            break;
            
        case 2:
            System.out.println("digite la cantidad de pulgadas a convertir:");
            pulgadas=teclado.nextDouble();
            //centimetros=C
            C= pulgadas * 2.54;
            System.out.println("las pulgadas equivalen a :  " + C+  "  CENTIMETROS");
            break;
            
        case 3:
            System.out.println("digite la cantidad de legua a convertir:");
            L=teclado.nextDouble();
            //legua=L
            pulgadas= L * 190080.02;
            System.out.println("La legua equivalen a :  " + pulgadas+  "  pulgadas");
            break;
            
       case 4:
            System.out.println("digite la cantidad de yarda a convertir:");
            Y=teclado.nextDouble();
            //yarda=y
            pulgadas= Y * 36;
            System.out.println("La yarda equivalen a :  " + pulgadas+  "  pulgadas");
            break;
        
        
        default:
        
        System.out.println("la opcion no es valida");
        
        
         
        }
        
          
    }
  
}
