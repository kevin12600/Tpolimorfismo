/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaprincipal;

/**
 *
 * @author DELL LATITUDE 5401
 */
public class Tareaprincipal {

    public static void main(String[] args) {
        Vehiculo misVehiculos[]= new Vehiculo [4];
        misVehiculos[0]= new Vehiculo("GHT334","TOYOTA","A39");
        misVehiculos[1]= new VehiculoFurgoneta(20,"gth345","Ford","P12");
        misVehiculos[2]= new VehiculoDeportivo(400,"hgt323","Ferrari","S84");
        misVehiculos[3]= new VehiculoTurismo(4,"RTE234","AUDI","RT3");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        
        
        
        
    }
}
