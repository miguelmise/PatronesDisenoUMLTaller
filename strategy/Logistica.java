/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class Logistica {

    private TransporteStrategy estrategia;

    public TransporteStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(TransporteStrategy estrategia) {
        this.estrategia = estrategia;
    }
    public void distribuir(String ubicacion){
        estrategia.distribuir(ubicacion);
    }
}
