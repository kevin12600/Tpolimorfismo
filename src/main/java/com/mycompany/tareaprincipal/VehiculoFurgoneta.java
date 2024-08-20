/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaprincipal;

/**
 *
 * @author DELL LATITUDE 5401
 */
public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    @Override
    public String mostrarDatos(){
        return "Matricula: " + matricula+ "\nMarca: "+ marca+ "\nModelo :"+modelo+ "Carga :"+carga;
    }
    
    
}
