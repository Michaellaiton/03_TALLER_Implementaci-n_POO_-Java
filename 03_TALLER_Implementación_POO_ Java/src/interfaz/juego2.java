package interfaz;

public class juego2 {
    public static void main(String[] args) {
      caraysello juego1=new caraysello();
      juego1.iniciar();
      juego1.jugar();
      juego1.terminar(); 

      papelytijera juego2=new papelytijera();
      juego2.iniciar();
      juego2.jugar();
      juego2.terminar();

    }
}