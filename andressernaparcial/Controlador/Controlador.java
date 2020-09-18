/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.andressernaparcial.Controlador;

import udem.edu.co.andressernaparcial.Automovil;
import udem.edu.co.andressernaparcial.CamionDosEjes;
import udem.edu.co.andressernaparcial.CamionUnEje;
import udem.edu.co.andressernaparcial.Moto;

/**
 *
 * @author pipea
 */
public class Controlador {
    //arreglos  donde guardare los atributos de las intascias de la clases.
    public static Moto [] listamotos =  new  Moto[100];
    public static Automovil [] listaautomovil = new  Automovil[100];
    public static CamionDosEjes [] listacamiondosejes = new  CamionDosEjes [100];
    public static CamionUnEje [] listacamionuneje = new  CamionUnEje [100];
    
    // controlar la longitud de los arreglos
    public static int indexmotos=0;
    public static int indexautomovil=0;
    public static int indexcamiondosejes=0;
    public static int indexcamionuneje=0;
    
    public static void nuevamoto(String placa,String valorpeaje,String marca){
        
       
           
            listamotos [indexmotos]= new Moto(placa,valorpeaje,marca);
            indexmotos++;
        
    }
    public static void nuevoautomovil(String placa,String valorpeaje,String marca){
        
       
            listaautomovil [indexautomovil]= new Automovil(placa,valorpeaje,marca);
            indexautomovil++;
        
    }
     public static void nuevocamiondosejes(String placa,String valorpeaje,String marca){
        
       
            listacamiondosejes [indexcamiondosejes]= new CamionDosEjes(placa,valorpeaje,marca);
            indexcamiondosejes++;
        
    }
      public static void nuevocamionuneje(String placa,String valorpeaje,String marca){
        
        
            listacamionuneje [indexcamionuneje]= new CamionUnEje(placa,valorpeaje,marca);
            indexcamionuneje++;
      }
     public static void visualizar(){
         System.out.println("{");
         System.out.println("\"Vehiculos\":[");
            for (int i = 0; i < indexmotos; i++) {
           
                Moto M = listamotos[i];
                System.out.println("    {");
                System.out.println("     \"Placa\": "+"\""+M.getPlaca()+"\",");
                System.out.println("     \"Valor Peaje\": "+"\""+M.getValorpeaje()+"\",");
                System.out.println("     \"Marca\": "+"\""+M.getMarca()+"\"");
                System.out.println("    },");
            }
            
             for (int i = 0; i < indexautomovil; i++) {
           
                Automovil M = listaautomovil[i];
                System.out.println("    {");
                System.out.println("     \"Placa\": "+"\""+M.getPlaca()+"\",");
                System.out.println("     \"Valor Peaje\": "+"\""+M.getValorpeaje()+"\",");
                System.out.println("     \"Marca\": "+"\""+M.getMarca()+"\"");
                System.out.println("    },");
            }
            for (int i = 0; i < indexcamionuneje; i++) {
           
                CamionUnEje M = listacamionuneje[i];
                System.out.println("    {");
                System.out.println("     \"Placa\": "+"\""+M.getPlaca()+"\",");
                System.out.println("     \"Valor Peaje\": "+"\""+M.getValorpeaje()+"\",");
                System.out.println("     \"Marca\": "+"\""+M.getMarca()+"\"");
                System.out.println("    },");
            }
            for (int i = 0; i < indexcamiondosejes; i++) {
           
                CamionDosEjes M = listacamiondosejes[i];
                System.out.println("    {");
                System.out.println("     \"Placa\": "+"\""+M.getPlaca()+"\",");
                System.out.println("     \"Valor Peaje\": "+"\""+M.getValorpeaje()+"\",");
                System.out.println("     \"Marca\": "+"\""+M.getMarca()+"\"");
                
                if(indexcamiondosejes-i == 1){
                    System.out.println("    }");
                }
            
                if(indexcamiondosejes-i != 1){
                    System.out.println("    },");
                }
                        
                        
            }
        System.out.println("]");
        System.out.println("}");
    }

    public Controlador() {
    }
     
    
}
