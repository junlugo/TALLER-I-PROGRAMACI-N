package org.acme;

import java.util.*;

public class Gasto {
        private int id;
        private Date fecha;
        private double monto;
        private String descripcion;
    
        public Gasto(int id, Date fecha, double monto, String descripcion) {
            this.id = id;
            this.fecha = fecha;
            this.monto = monto;
            this.descripcion = descripcion;
        }
    
        // Getters y Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public Date getFecha() {
            return fecha;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public double getMonto() {
            return monto;
        }
    
        public void setMonto(double monto) {
            this.monto = monto;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        @Override
        public String toString() {
            return "Gasto{" +
                    "id=" + id +
                    ", fecha=" + fecha +
                    ", monto=" + monto +
                    ", descripcion='" + descripcion + '\'' +
                    '}';
        }
    }

