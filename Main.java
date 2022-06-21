package tarea13;

public class Main {

    public static void main(String[] args) {

        Dueño dueño = new Dueño("Kevin", "Arteaga", 73627795, 930, 0.1);

        System.out.println("Personal "+dueño.getNombres()+" "+dueño.getApellidos());
        System.out.println("DNI: "+dueño.getDni());
        dueño.setInicial(1500);
        System.out.println("SALARIO: "+dueño.getSalario());
        System.out.println("TRANSACCION: "+dueño.transaccion());
        System.out.println("SUELDO: "+dueño.sueldo());
    }
}
