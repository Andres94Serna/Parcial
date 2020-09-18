/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.andressernaparcial;



/**
 *
 * @author pipea
 */
public abstract class Vehiculo {
// atributos de la clase abtracta vehiculos
     protected String placa,valorpeaje,marca;
    
// genero un construstor vacio
    public Vehiculo() {
    }
// genero un constructor con los atributos de la clase
    public Vehiculo(String placa, String valorpeaje, String marca) {
        this.placa = placa;
        this.valorpeaje = valorpeaje;
        this.marca = marca;
    }
 //genero los metodos get y set de los atributos

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getValorpeaje() {
        return valorpeaje;
    }

    public void setValorpeaje(String valorpeaje) {
        this.valorpeaje = valorpeaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}