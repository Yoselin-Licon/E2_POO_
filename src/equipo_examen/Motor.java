/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alber
 */

package equipo_examen;

public  class Motor {
    
    private String tipo;
    private int caballos;
    
    String marca="ford";
    
    
    public Motor(String tipo, int caballos){
        this.tipo=tipo;
        this.caballos=caballos;
        
        System.out.println("El motor es de tipo: "+ tipo+
                          "\nTiene una potencia de: "+caballos+ "HP");
        
    }
    
    public String getMarca(){
        return marca;
        
    }
    

    
}
