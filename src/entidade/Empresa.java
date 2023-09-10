/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author pollo
 */
public class Empresa {
    private String rasonSocial;
    private int cuil;
    private ArrayList<Empleado>empleado;

    public Empresa(String rasonSocial, int cuil) {
        this.rasonSocial = rasonSocial;
        this.cuil = cuil;
        this.empleado = new ArrayList<Empleado>();
    }

   

    public String getRasonSocial() {
        return rasonSocial;
    }

    public void setRasonSocial(String rasonSocial) {
        this.rasonSocial = rasonSocial;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }
    public void agregarEmpleado(Empleado e){
        
        this.empleado.add(e);
    }
    public void mostrarEmpleado( ){
        for (Empleado e:empleado) {
            System.out.println(e);
           
}
    }

    @Override
    public String toString() {
        return  rasonSocial ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.rasonSocial, other.rasonSocial)) {
            return false;
        }
        return true;
    }
    
}
