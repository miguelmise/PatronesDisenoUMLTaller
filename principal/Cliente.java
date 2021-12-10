/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import strategy.AereaStrategy;
import strategy.CiclistaStrategy;
import strategy.Logistica;


public class Cliente {

    public static void main(String[] args) {
         Logistica transport=new Logistica();
         transport.setEstrategia(new CiclistaStrategy());
         transport.distribuir("Los rosales");
         
         Logistica transport2=new Logistica();
         transport.setEstrategia(new AereaStrategy());
         transport.distribuir("Galapagos");
    }
    
}
