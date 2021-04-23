/*
A) Declaración de clases (atributos, métodos y encapsulamiento).
B) Instanciación de una clase
C) Referencia al objeto actual
D) Método (paso de parámetros y retorno de valores)
E) Constructores y destructores
F) Sobrecarga de métodos
G) Sobrecarga de operadores (unario y binario).
*/
package equipo_examen;


/**
Equipo 2:
* Yoselin Andrea Licon Arguello
* Jesus Alberto Chavez Melero
* Ruben Alvarado Loya
* Scott Alampi
* Alan Isak Lozoya Blanco
* * 
 */
public class Cochera {

    
    public static void main(String[] args) {
        
        Coche miCoche = new Coche("verde", 80, 3.8f);
         
          miCoche.avanzar();
          miCoche.parar();
          
        Motor miMotor = new Motor("diesel", 500);
            
            miMotor.marca="ford";
            miMotor.getMarca();  
            
            System.out.println("Marca del coche: "+miMotor.getMarca());    
            System.out.println(" ");
    
        Coche tuCoche = new Coche("rojo", 120, 4.1f);
             tuCoche.avanzar(1000);
             
        Motor tuMotor = new Motor("electrico", 490);
            tuMotor.marca="Tesla";
            tuMotor.getMarca();    
            
            System.out.println("Marca del coche: " + tuMotor.getMarca());    
            System.out.println("");
    
        Coche suCoche = new Coche ("amarillo", 100, 3.2f);
            suCoche.avanzar(1000,120);
          
        Motor suMotor = new Motor("Hibrido", 106);
            
            suMotor.marca="Nissan";
            suMotor.getMarca();            
            System.out.println("Marca del coche: "+suMotor.getMarca());

    }
      
    }
    
