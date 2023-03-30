package Salud;

import java.util.Scanner;
public class Persona {
   private String tipoDocumento; 
   private int Numdocumento;
   private String nombrepe;
   private String apellidope;
   private double pesope;
   private double estaturape;
   private int edadpe;
   private String sexope;
  // private double pesoActualpe;

  //Reto 3
public Persona(String tipoDocumento, int Numdocumento, String nombrepe, String apellidope, double pesope, double estaturape, int edadpe, String sexope) {
    this.tipoDocumento = tipoDocumento;
    this.Numdocumento = Numdocumento;
    this.nombrepe = nombrepe;
    this.apellidope = apellidope;
    this.pesope = pesope;
    this.estaturape = estaturape;
    this.edadpe = edadpe;
    this.sexope = sexope;
}

public String getTipoDocumento() {
    return tipoDocumento;
}

public void setTipoDococuemto(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
}

public int getNumdocumento() {
    return Numdocumento;
}

public void setNumDocumento(int Numdocumento) {
    this.Numdocumento = Numdocumento;
}

public String getnombrepe() {
    return nombrepe;
}

public void setnombrepe(String nombrepe) {
    this.nombrepe = nombrepe;
}

public String getapellidope() {
    return apellidope;
}

public void setapellidope(String apellidope) {
    this.apellidope = apellidope;
}

public double getpesope() {
    return pesope;
}

public void setpesope(double pesope) {
    this.pesope = pesope;
}

public double getestaturape() {
    return estaturape;
}

public void setestaturape(double estaturape) {
    this.estaturape = estaturape;
}

public int getedadpe() {
    return edadpe;
}

public void setedadpe(int edadpe) {
    this.edadpe = edadpe;
}

public String getsexope() {
    return sexope;
}

public void setsexope(String sexope) {
    this.sexope = sexope;
}

   //Reto 1 y 2
   public void pedirdatos(){
    Scanner teclado=new Scanner(System.in);
    System.out.println("favor Usuario, digite su tipo de documento");
    tipoDocumento=teclado.next();
    System.out.println("Favor digite su numero de documento");
    Numdocumento=teclado.nextInt();
    System.out.println("Digite su nombre por favor");
    nombrepe=teclado.next();
    System.out.println("Digite su apellido por favor");
    apellidope=teclado.next();
    /*//Reto 1 y 2
    System.out.println("Por favor digite su peso");
    pesope=teclado.nextDouble();
    System.out.println("por favor de digitar su estatura");
    estaturape=teclado.nextDouble();
    System.out.println("Digite su edad actual");
    edadpe=teclado.nextInt();
    System.out.println("Digitar su sexo");
    sexope=teclado.next();*/
   }
   public void mostrarpersona(){
    System.out.println("El Tipo de documento es "+tipoDocumento);

    System.out.println("El Numero de documento es"+Numdocumento);
    System.out.println("Nombre; "+nombrepe);

    System.out.println("Apellido; "+apellidope);

    System.out.println("El peso Actual es: "+pesope);

    System.out.println("Estatura "+estaturape);

    System.out.println("Edad Actual "+edadpe);

    System.out.println("Sexo genero "+sexope);

   }
   public double calcularImc(double pesope, double estaturape){
    double pesoActualpe=pesope/estaturape/estaturape;
    //Reto 2
    return pesoActualpe;
   }
  
    /*if (pesoActualpe<25){
        System.out.println("el peso esta muy bajo de lo ideal");
    }
    else if (pesoActualpe >= 25 && pesoActualpe <= 25){
        System.out.println("Se encuentra en el peso Ideal");
    }
    else{
        System.out.println("Se encuentra por encima del pero ideal");
    }
   }*/
   public void mayoredad(){
    if (edadpe>=18){
        System.out.println("Mayor de Edad");
    }
    else{
        System.out.println("Menor de edad");
    
    }
    //teclado.close();
}
   }
  
