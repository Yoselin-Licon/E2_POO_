/*
A) Declaración de clases (atributos, métodos y encapsulamiento).
B) Instanciación de una clase
C) Referencia al objeto actual
D) Método (paso de parámetros y retorno de valores)
E) Constructores y destructores
F) Sobrecarga de métodos
G) Sobrecarga de operadores (unario y binario).
*/

// Prueba 23

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
            Motor mimotor = new Motor("diesel", 500);
            mimotor.marca="ford";
            mimotor.getMarca();            
            System.out.println("Marca del coche: "+mimotor.getMarca());    
    System.out.println("");
    
        Coche tuCoche = new Coche("rojo", 120, 4.1f);
          tuCoche.avanzar(1000);
            Motor tumotor = new Motor("electrico", 490);
            tumotor.marca="Tesla";
            tumotor.getMarca();            
            System.out.println("Marca del coche: "+tumotor.getMarca());    
    System.out.println("");
    
        Coche suCoche = new Coche ("amarillo", 100, 3.2f);
          suCoche.avanzar(1000,120);
            Motor sumotor = new Motor("Hibrido", 106);
            sumotor.marca="Nissan";
            sumotor.getMarca();            
            System.out.println("Marca del coche: "+sumotor.getMarca());

    }
      
    }
    
