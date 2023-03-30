package Ejecucion_Principal;

import Salud.Empleado;
import Salud.Persona;

public class Iniciar {
    public static void main(String[] args) {
        //Retos 1
        double resultado, pesope=0, estaturape=0;
        //crear un objeto->instancia de una clase
        //Retos 1 y 2
        Persona n=new Persona(null, 0, null, null, estaturape, estaturape, 0, null);
        //invocando un metodo
        n.pedirdatos();
        n.mostrarpersona();
        resultado=n.calcularImc(pesope, estaturape);
        if (resultado<25){
            System.out.println("peso bajo");
        }
        else if (resultado >= 25 && resultado <= 25){
            System.out.println("peso idel");
        }
        else{
            System.out.println("sobre peso");
        }
        n.mayoredad();

        //Reto 3
        Empleado e1=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);
        e1.pedirdatos();
        e1.pedirEmpleado();
        e1.mostrarEmpleado();
        e1.calcularHonorarios();
   }
}