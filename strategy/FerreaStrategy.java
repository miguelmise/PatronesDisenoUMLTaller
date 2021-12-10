/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;


public class FerreaStrategy implements TransporteStrategy{

    @Override
    public void distribuir(String ubicacion) {
        System.out.println("Se distribuye por via ferrea a "+ubicacion);    
    }
}
