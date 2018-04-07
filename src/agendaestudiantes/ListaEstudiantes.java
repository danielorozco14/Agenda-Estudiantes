/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaestudiantes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ListaEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public ListaEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void add() {
        Estudiante estudiante = new Estudiante();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los nombres del estudiante: ");
        estudiante.setNombres(leer.nextLine());

        System.out.println("Ingrese los apellidos del estudiante: ");
        estudiante.setApellidos(leer.nextLine());

        System.out.println("Ingrese el carne del estudiante: ");
        estudiante.setCarnet(leer.next());

        estudiantes.add(estudiante);
    }

    public void pasarLista() {

        Estudiante Asst = new Estudiante();
        int cont = 0, cont1 = 0;
        for (Estudiante est : estudiantes) {
            Scanner asistencia = new Scanner(System.in);
            System.out.println("Ha asistido el estudiante? " + est.getNombres() + " " + est.getApellidos() + " S/N?");
            String opcion = asistencia.nextLine();
            if ("S".equals(opcion) || "s".equals(opcion)) {
                est.setAsistencia("Asistio");
            } else if ("N".equals(opcion) || "n".equals(opcion)) {
                est.setAsistencia("No asistio");
            }
        }
    }

    public void modificar() {
        Estudiante Mod = new Estudiante();
        Scanner buscar = new Scanner(System.in);

        System.out.println("Ingrese el carnet a buscar: ");
        String carnet = buscar.nextLine();

        int cont = 0, cont1 = 0;

        for (Estudiante est : estudiantes) {
            Scanner cambiar = new Scanner(System.in);
            if (est.getCarnet().equals(carnet) && cont == 0) {

                System.out.println("Este alumno existe: " + est.getNombres() + " " + est.getApellidos());

                System.out.println("Ingrese los nombres del estudiante: ");
                Mod.setNombres(cambiar.nextLine());

                System.out.println("Ingrese los apellidos del estudiante: ");
                Mod.setApellidos(cambiar.nextLine());

                System.out.println("¿Desea modificar el carnet?");
                String opcion = cambiar.nextLine();

                if (opcion.equals("S") || opcion.equals("s")) {
                    System.out.println("Ingrese el carne del estudiante: ");
                    Mod.setCarnet(cambiar.next());
                    Mod.setAsistencia(est.getAsistencia());
                    System.out.println("\t\tFinalizando Modificacion");
                } else {
                    Mod.setCarnet(carnet);
                    Mod.setAsistencia(Mod.getAsistencia());
                    System.out.println("\t\tFinalizando Modificacion");
                }

                estudiantes.set(cont, Mod);
                break;
            } else if (est.getCarnet().equals(carnet) && cont != 0) {
                System.out.println("Este alumno existe: " + est.getNombres() + " " + est.getApellidos());

                System.out.println("Ingrese los nombres del estudiante: ");
                Mod.setNombres(cambiar.nextLine());

                System.out.println("Ingrese los apellidos del estudiante: ");
                Mod.setApellidos(cambiar.nextLine());

                System.out.println("¿Desea modificar el carnet?");
                String opcion = cambiar.nextLine();

                if (opcion.equals("S") || opcion.equals("s")) {
                    System.out.println("Ingrese el carne del estudiante: ");
                    Mod.setCarnet(cambiar.next());
                    Mod.setAsistencia(est.getAsistencia());
                    System.out.println("\t\tFinalizando Modificacion");
                } else {
                    Mod.setCarnet(carnet);
                    Mod.setAsistencia(est.getAsistencia());
                    System.out.println("\t\tFinalizando Modificacion");
                }

                estudiantes.set(cont, Mod);
                break;

            } else if (est.getCarnet().equals(carnet) == false) {
                cont1++;
                if (estudiantes.size() == cont1) {
                    System.out.println("No existe este numero de carnet en el registro o el alumno no ha sido registrado");
                }
            }
            cont++;
        }
    }

    public void eliminar() {
        Estudiante Mod = new Estudiante();
        Scanner buscar = new Scanner(System.in);

        System.out.println("Ingrese el carnet a buscar: ");
        String carnet = buscar.nextLine();

        int cont = 0, cont1 = 0;

        for (Estudiante est : estudiantes) {
            Scanner cambiar = new Scanner(System.in);
            if (est.getCarnet().equals(carnet) && cont == 0) {

                System.out.println("Este alumno existe: " + est.getNombres() + " " + est.getApellidos());

                System.out.println("¿Desea eliminar el alumno? S/N?");
                String opcion = cambiar.nextLine();

                if (opcion.equals("S") || opcion.equals("s")) {
                    estudiantes.remove(cont);
                    System.out.println("\t\tAlumno Eliminado");
                } else {
                    System.out.println("\t\tFinalizando Eliminacion");
                }
                break;
            } else if (est.getCarnet().equals(carnet) && cont != 0) {

                System.out.println("Este alumno existe: " + est.getNombres() + " " + est.getApellidos());

                System.out.println("¿Desea eliminar el alumno? S/N?");
                String opcion = cambiar.nextLine();

                if (opcion.equals("S") || opcion.equals("s")) {
                    estudiantes.remove(cont);
                    System.out.println("\t\tAlumno Eliminado");
                } else {
                    System.out.println("\t\tFinalizando Eliminacion");
                }
                break;

            } else if (est.getCarnet().equals(carnet) == false) {
                cont1++;
                if (estudiantes.size() == cont1) {
                    System.out.println("No existe este numero de carnet en el registro o el alumno no ha sido registrado");
                }
            }
            cont++;
        }
    }

    public void mostrar() {
        //for (Estudiante e : estudiantes) {
        //    System.out.println(e.toString());
        //}
        int size = estudiantes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(estudiantes.get(i));
        }
    }
}
