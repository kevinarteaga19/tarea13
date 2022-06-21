package tarea13;

public class Personal {

    protected String nombres;

    protected String apellidos;

    protected int dni;

    protected double salario;

    protected double comision;

    public Personal(String nombres, String apellidos, int dni, double salario, double comision) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salario = salario;
        this.comision = comision;
    }

    protected String getNombres() {

        return nombres;
    }

    protected String getApellidos() {

        return apellidos;
    }

    protected int getDni() {

        return dni;
    }

    protected double getSalario() {

        return salario;
    }

    protected double getComision() {

        return comision;
    }

    protected double transaccion()
    {
        return  this.salario * this.comision;
    }

    protected double sueldo()
    {
        return this.salario + this.transaccion();
    }
}
