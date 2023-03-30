package interfaz;

import java.util.Random;
import java.util.Scanner;

public class caraysello implements Juego{

    private int monedas;
    private String jugadores;
    private int elecciones;
    Scanner teclado=new Scanner(System.in);
    
public void iniciar(){
    System.out.println("Nombre de los jugadores ");
    jugadores=teclado.next();
}


public void jugar(){
System.out.println(jugadores+"Elija con que va a jugar \n 1.Cara \n 2.Sello");
  elecciones=teclado.nextInt(); 
  Random aleatorio=new Random();
monedas=aleatorio.nextInt(2)+1;
  System.out.println("lanzo una moneda");
}
public void terminar(){
    if(monedas==1 && elecciones==1){
        System.out.println("Cayo cara, !Felicidades¡ ganaste "+jugadores);
    }else if(monedas==2 && elecciones==2){
        System.out.println("Cayo sello, !Felicidades! ganaste "+jugadores);
    } else if(monedas==1 && elecciones==2){
        System.out.println("Cayo cara, !Lo siento¡ has perdido "+jugadores);
    } else if(monedas==2 && elecciones==1){
        System.out.println("Cayo sello, !Lo siento¡ has perdido "+jugadores);
    }
    
}
}