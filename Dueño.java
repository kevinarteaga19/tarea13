package tarea13;

public class Dueño extends Personal {

    private double inicial;

    public Dueño (String nombres, String apellidos, int dni, double salario, double comision){

        super(nombres, apellidos, dni, salario, comision);
    }

    public double getInicial() {
        return inicial;
    }

    public void setInicial(double inicial) {
        this.inicial = inicial;
    }

    @Override

    public double transaccion(){
        return this.inicial * this.comision;
    }

    @Override

    public double sueldo()
    {
        return this.inicial + this.transaccion();
    }
}
