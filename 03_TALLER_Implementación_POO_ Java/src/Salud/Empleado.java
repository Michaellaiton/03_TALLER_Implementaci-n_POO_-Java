package Salud;
import java.util.Scanner;
public class Empleado extends Persona {
    private String cargoempl;
    private String departamentoempl;
    private double valorHoraempl;
    private double horasTrabajadasemple;

    public Empleado(String TipoDocumento, int documento, String nombrepe, String apellidope, double pesope, double estaturape, int edadpe, String sexope, double pesoActualpe, 
    String cargoempl, String departamentoempl, double valorHoraempl, double horasTrabajadasemple) {
        super(TipoDocumento, documento, nombrepe, apellidope, pesope, estaturape, edadpe, sexope);
        this.cargoempl = cargoempl;
        this.departamentoempl = departamentoempl;
        this.valorHoraempl = valorHoraempl;
        this.horasTrabajadasemple = horasTrabajadasemple;
    }

    public String getcargo() {
        return cargoempl;
    }

    public void setcargo(String cargoempl) {
        this.cargoempl = cargoempl;
    }

    public String getdepartamento() {
        return departamentoempl;
    }

    public void setdepartamento(String departamentoempl) {
        this.departamentoempl = departamentoempl;
    }

    public double getvalorHora() {
        return valorHoraempl;
    }

    public void setValorHora(double valorHoraempl) {
        this.valorHoraempl = valorHoraempl;
    }

    public double gethorasTrabajadas() {
        return horasTrabajadasemple;
    }

    public void sethorasTrabajadas(double horasTrabajadasemple) {
        this.horasTrabajadasemple = horasTrabajadasemple;
    }
        public void pedirEmpleado(){
            Scanner Lectura=new Scanner(System.in);
            System.out.println("Cargo actual");
            cargoempl=Lectura.next();
            System.out.println("Horas trabajadas?");
            horasTrabajadasemple=Lectura.nextDouble();
            System.out.println("valor de la hora");
            valorHoraempl=Lectura.nextDouble();
    }

    /**
     * 
     */
    public void mostrarEmpleado(){
        System.out.println("El numero de Documento es: "+getTipoDocumento());
        System.out.println("El Documento es "+getNumdocumento());
        System.out.println("El nombre completo es "+ getnombrepe() + getapellidope());
        System.out.println("El cargo es " + getcargo());
        System.out.println("Las horas trabajadas son " +gethorasTrabajadas());
        }

    public void calcularHonorarios(){
        double reteica;
        double totalPagar;
        totalPagar=valorHoraempl*horasTrabajadasemple;
        reteica=(0.966*totalPagar);
        totalPagar=(totalPagar-reteica);
        System.out.println("El total a pagar es: "+ totalPagar);
    }
}