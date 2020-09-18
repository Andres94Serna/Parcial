/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.andressernaparcial.main;

import udem.edu.co.andressernaparcial.Controlador.Controlador;

/**
 *
 * @author pipea
 */
public class Main {
    public static Controlador P;
     public static void main(String[] args){
         P = new Controlador();
           
         P.nuevamoto("FXY24E","FREE","AKT");
         P.nuevamoto("YUT78A","1200","YAMAHA");
         P.nuevoautomovil("QWER462","1100","SEAT");
         P.nuevoautomovil("BGT851","1700","BMW");
         P.nuevocamionuneje("UTH","50000","FOTON");
         P.nuevocamionuneje("QÑI786","78000","FOTON");
         P.nuevocamiondosejes("TYU","10000","FOTON");
         P.nuevocamiondosejes("TYU","10000","FOTON");
         P.nuevocamiondosejes("TYU","10000","FOTON");
         P.visualizar();
         
          
      }
    
}
