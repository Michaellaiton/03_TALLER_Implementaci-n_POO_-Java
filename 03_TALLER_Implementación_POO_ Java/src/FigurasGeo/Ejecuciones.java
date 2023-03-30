package FigurasGeo;
import java.util.Scanner;
public class Ejecuciones {
    public static void main(String[] args) {
        float lado, base, altura, radio;
        int desiciones, i=1;
        Scanner Lectura = new Scanner(System.in);


        while(i==1){
            
        System.out.println("Elija, un numero segun la figura que quiera saber");
        System.out.println("1 si la figura es (Cuadrado)");
        System.out.println("2 Si su figura es (Rectangulo)");
        System.out.println("3 Si su figura es (Triangulo)");
        System.out.println("4 Si su figura es (Circulo)");
        desiciones=Lectura.nextInt();

        
        if(desiciones==1){
        System.out.println("valor del cuadrado");
        lado=Lectura.nextFloat();
        Cuadrado c1=new Cuadrado(lado);
        c1.calcularArea();
        }
        
        else if(desiciones==2){
        System.out.println("valor de la base del rectangulo");
        base=Lectura.nextInt();
        System.out.println("valor de la altura del rectangulo");
        altura=Lectura.nextInt();
        Rectangulo r1=new Rectangulo(base, altura);
        r1.calcularArea();
        }

        else if(desiciones==3){
        System.out.println("valor de la base del triangulo");
        base=Lectura.nextInt();
        System.out.println("valor de la altura del triangulo");
        altura=Lectura.nextInt();
        Triangulo t1=new Triangulo(base, altura);
        t1.calcularArea();
        }
    
        else if(desiciones==4){
        System.out.println("valor del radio del circulo");
        radio=Lectura.nextFloat();
        Circulo C1=new Circulo(radio);
        C1.calcularArea();
        }
        i++;
    } 

    System.out.println("¿Quire colcer a calcular el area de otra figura', si es asi dijite el NUMERO 0, de lo contrario Digite OTRO valor NUMERICO");
    i=Lectura.nextInt();

    if(i!=1){
        System.out.println("Gracias por confiar en nosotros :)");
    }
    }
}