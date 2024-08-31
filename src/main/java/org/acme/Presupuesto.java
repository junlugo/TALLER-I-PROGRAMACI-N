
import java.util.*;

public class Presupuesto {
    private int id;
    private Date fechaInicio;
    private Date fechaFin;
    private double montoPresupuestado;
    private List<Gasto> gastos;

    public Presupuesto(int id, Date fechaInicio, Date fechaFin, double montoPresupuestado, List<Gasto> gastos) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoPresupuestado = montoPresupuestado;
        this.gastos = gastos;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMontoPresupuestado() {
        return montoPresupuestado;
    }

    public void setMontoPresupuestado(double montoPresupuestado) {
        this.montoPresupuestado = montoPresupuestado;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        return "Presupuesto{" +
                "id=" + id +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", montoPresupuestado=" + montoPresupuestado +
                ", gastos=" + gastos +
                '}';
    }
}

