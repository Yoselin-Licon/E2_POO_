
package equipo_examen;


public class Coche {
    
    private String color;
    private int velocidad;
    private float tamaño;
    
public Coche (){
    
}
   public Coche(String color, int velocidad, float tamaño){
       this.color =color;
       this.velocidad = velocidad;
       this.tamaño = tamaño;
       

       System.out.println("El color de tu carro es: "+color);
       System.out.println("vas a la velocidad de: "+velocidad+" km/h");
       System.out.println("El tamaño de tu carro es: "+tamaño+" metros de largo");
       
   }
   
   
   public void avanzar(){
       System.out.println("Tu coche esta estacionado");
       
   }
   public void avanzar(int metros){
       System.out.println("has avanzado: "+metros+" m");
       
   }
   public void avanzar(int metros, int velocidad){
       System.out.println("has avanzado: "+metros+" m"+ "\nA la velocidad de: "+velocidad+"km/h");
   }
   
   public void parar(){
       int a=3, b=0;
       b=++a;
       int suma=a+b;
       System.err.println("Tienes"+suma);
       System.out.println("tienes: "+b+ " llantas");
       
       if (b>=4){
           System.err.println("El carro puede circular");
           
       }else{
            System.err.println("El carro no puede circular");
       }
       
               
   }

   
    
    
    
    
    
    
    
    
    
    }

/*
   public Coche(String color){
       this.color = color;

   } 
   
   public Coche(String color, int velocidad){
       this.color= color;
       this.velocidad=velocidad;       
   }
*/