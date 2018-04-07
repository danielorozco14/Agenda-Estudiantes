/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agendaestudiantes;
/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617 at uca.edu.sv>
 */
import java.util.Objects;

public class Estudiante {

    private String nombres;
    private String apellidos;
    private String carnet;
    private String asistencia;

    public Estudiante() {
    }

    public Estudiante(String carnet) {
        this.carnet = carnet;
    }

    public Estudiante(String nombres, String apellidos, String carnet) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
    

    @Override
    public String toString() {
        return "Estudiante{" + "Nombres=" + nombres + ", Apellidos=" + apellidos + ", Carnet=" + carnet + ", Asistencia=" + asistencia +'}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.carnet);
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
        if (getClass()
                != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        return Objects.equals(this.carnet, other.carnet);
    }

    public static void main(String... args) {
        Estudiante est1 = new Estudiante();
//        Estudiante est3 = new Estudiante("Néstor Santiago", "Aldana Rodriguez", "00031111");
//        Estudiante est4 = new Estudiante("Néstor Santiago", "Rodriguez", "00031111");
//        
//        if((est3.equals(est4)==true)){
//            System.out.println("Los carnets son iguales");
//        }else
//            System.out.println("Los carnets son distintos");
        
        Menu menu = Menu.getInstance();
        menu.mostrar();
    }

}
