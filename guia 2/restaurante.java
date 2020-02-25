import java.util.Scanner;

public class restaurante

{
    static boolean salid = true;
              public static void main(String[]args)
              {
                          Scanner teclado= new Scanner(System.in);
        
            
                            int opc,canpla;
                            int totalFinal=0;
                            double total_1=0,total_2=0,total_3=0,tot_1=0,iv=0.19;
                            double totfinal=0;
                            double des_veg,des_noveg,tot_fin2,tota_desc;
                            
                           
                            System.out.println("seleccione la cantidad de platos ");
                                canpla=teclado.nextInt();
                                
                                    
                                             
                                      do  {
            
                                
                        
                                                 System.out.println("seleccione el tipo de comida: "); 
                                                 
                                    
                                                System.out.println("1. VEGETARIA ");
                                                System.out.println("2. NO VEGETARIANA");
                                                System.out.println("3. COMIDA RAPIDA");        
                                                System.out.println("4. SALIR");
                                                
                                
                    
            
                                              opc= teclado.nextInt();
                                          
                                
                                  
                                  
        
        
                                              switch(opc)
        
                                              {
                                                case 1:
                                                {      
                                                  total_1+=vegeta();
                                                  break;
                                                }                       
                             
                                                case 2:
                                                  {
                                                    total_2+=comi_normal();
                                                    break;
                                                    }
                        
                                                    case 3:
                                                 {
                                                   total_3+=rapida();
                                                   break;
                                                 }
                                          
                                                 case 4:
                                    
                                                    {
                                                    salida();
                                                    break;
                                        
                                                  }
                                          
                                                      default:                                
                                
                                                      System.out.println("LA OPCION NO ES VALIDA");
                                                   }  
                                
                                
                                    }   while(opc!=4);
                                
                                    tot_1=total_1+total_2+total_3;
                                  
                                    System.out.println("SUB TOTAL: "+ tot_1); 
                                  
                               
                                  
                                    totfinal=tot_1*iv;
                                  
                                                                   
                                    System.out.println("IVA:     "+totfinal);
                                    
                                    
                                  
                                    tot_fin2=tot_1+totfinal;
                                 
                                    System.out.println("TOTAL FINAL:  "+ tot_fin2);
                                    
                                    
                                    
                                       
                                        des_veg=total_1*0.20;
                                        System.out.println("descuento por comida vegetariana:  "+ des_veg);
                                        
                                        
                                        
                                        des_noveg=total_2*0.10;
                                        System.out.println("descuento por comida no vegetariana:   "+ des_noveg);
                                        
                                        tota_desc=tot_fin2-(des_veg+des_noveg);
                                        System.out.println("TOTAL CON DESCUENTOS:     "+ tota_desc);
    
      
                      
                    
                     
                
                                    
                                    
                                } 
      
                            public static double vegeta()
                
        
                              {
                              
                              Scanner teclado= new Scanner(System.in);
                              
                              double cantso,total_1,jug,En,So,Ju,ensala;              
                              
                              double sopve=10000;             
                              double ensa=25000;
                              double jugos=5000;
                            
                                          
                              System.out.println("1. valor de sopa: 10000 ");              
                              System.out.println("digite cantida:   ");
                              cantso=teclado.nextDouble();
                              
                                        
                              System.out.println("2.  valor de ensalada: 25000 ");              
                              System.out.println("digite cantida:   ");
                              ensala=teclado.nextDouble();
                              
                              
                              System.out.println("3.  valor del jugo: 5000 ");              
                              System.out.println("digite cantida:   ");
                              jug=teclado.nextDouble();
                              
                              
                              So= cantso*sopve;
                              System.out.println("valor total sopas:        "+So);
                                              
                              
                              En= ensala*ensa;
                              System.out.println("valor total de ensalada:  "+En);
                              
                              Ju= jug*jugos;
                              System.out.println("valor total jugos:        "+Ju);
                              
                              total_1=Ju+En+So;
                              System.out.println("TOTAL A PAGAR:  "+total_1);
                              
                              return(total_1);
                         
                            }
        
                            public static double comi_normal()
                                {   
                                    Scanner teclado= new Scanner(System.in);
                            
                                    double car,poll,Ca,Po;
                                    
                                    double carne=30000;
                                    double ban_pollo=28000;
                                    double total_2;
                                    
                                               
                                  System.out.println("1. valor bandeja de carne: 30000");              
                                  System.out.println("digite cantida:  ");
                                  car=teclado.nextDouble();
                                  
                                            
                                  System.out.println("2.  valor bandeja de pollo: 28000 ");              
                                  System.out.println("digite cantida:  ");
                                  poll=teclado.nextDouble();
                                  
                                  
                                  Ca= car*carne;
                                  System.out.println("valor total bandeja de carne:  "+ Ca);
                                  
                                  Po=poll*ban_pollo;
                                  System.out.println("valor total bandeja de pollo:  "+ Po);
                                  
                                  total_2=Ca+Po;
                                  System.out.println("TOTAL A PAGAR:  "+total_2);
                                  
                                  return(total_2);
                            
                                }
            
                            public static double rapida()
                
                               {
                                   Scanner teclado= new Scanner(System.in);
                                
                                double perr,Pe,ham,Ha,total_3;
                                
                                double perro=5000;
                                double hamburgesa=7000;
                                
                                
                              System.out.println("1. valor perro caliente: 5000");              
                              System.out.println("digite cantida:  ");
                              perr=teclado.nextDouble();
                              
                              
                              System.out.println("2. valor hamburgesa: 7000");              
                              System.out.println("digite cantida:  ");
                              ham=teclado.nextDouble();
                              
                              
                              Pe= perr*perro;
                              System.out.println("valor total perro caliente:  "+ Pe);
                                            
                              
                              
                              Ha= ham*hamburgesa;
                              System.out.println("valor total hamburgesa:  "+ Ha);
                              
                              total_3=Pe+Ha;
                              System.out.println("TOTAL A PAGAR:  "+total_3);
                              
                              return(total_3);
                        
                        
                            }
                            
                            
                           public static void salida()
                           
                           {
                               boolean opc;
                              
                               opc = false;
                               
                               System.out.println("DISTRUTA TU COMIDA\n\n");
                            }
                          
                        }
                        
          