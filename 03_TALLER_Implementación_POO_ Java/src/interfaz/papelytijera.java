package interfaz;

import java.util.Random;
import java.util.Scanner;

public class papelytijera implements Juego{ 
        private int mano;
        private String jugadores;
        private int elecciones;
        Scanner Lectura=new Scanner(System.in);
    
        public void iniciar(){
            System.out.println("Nombre Jugadores ");
                jugadores=Lectura.next();
    }
    public void jugar(){
    System.out.println(jugadores+"Elija entre \n 1.Piedra \n 2.Papel \n 3.Tijera");
      elecciones=Lectura.nextInt(); 
      Random aleatorio=new Random();
      mano=aleatorio.nextInt(3)+1;
      System.out.println("!Piedra¡, !Papel¡ Y... !Tijera¡");
    }
    public void terminar(){
        if(mano==1 && elecciones==1){
            System.out.println("La AI Saco... !PIEDRA¡, has empatado. "+jugadores);
        }else if(mano==2 && elecciones==1){
            System.out.println("La AI, saco !PAPEL¡ has perdido, lo siento  "+jugadores);
        } else if(mano==3 && elecciones==1){
            System.out.println("La AI, saco... !TIJERA¡ Has ganado ¡Felicidades! "+jugadores);
        } else if(mano==1 && elecciones==2){
            System.out.println("La AI, saco...!PIEDRA¡ Has ganado "+jugadores);
        } else if(mano==2 && elecciones==2){
            System.out.println("La AI,saco...!PAPEL¡ Has empatado "+jugadores);
        } else if(mano==3 && elecciones==2){
            System.out.println("La AI,saco... !TTIJERA¡ Has perido "+jugadores);
        } else if(mano==1 && elecciones==3){
            System.out.println("La AI,saco... !PIEDRA¡ Has perdido "+jugadores);
        }else if(mano==2 && elecciones==3){
            System.out.println("La AI,saco... !PAPEL¡ Has ganado "+jugadores);
        }else if(mano==3 && elecciones==3){
            System.out.println("La AI, saco... !TIJERA¡ Has empatado "+jugadores);
        }
        
    }
    }