package FigurasGeo;

public class Cuadrado extends Figuras {
   private float lado;

   public Cuadrado (float lado){
   this.lado=lado;
   }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

       
    public void calcularArea() {
       float area=0;
       area=lado*lado;
       System.out.println("El lado del cuadrado es igual"+ lado+" a su area que es: " +area);
   
    }
}