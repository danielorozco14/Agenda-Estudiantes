/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaestudiantes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;


public class Menu {

    private static Menu menu;

    private Menu() {
    }
    
    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opciones() {
        System.out.println("----- Menu -----");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Mostrar Estudiante");
        System.out.println("3. Modificar Estudiante");
        System.out.println("4. Pasar Lista de Estudiantes");
        System.out.println("5. Eliminar Estudiante");
        System.out.println("6. Salir");
    }
    

    public void mostrar() {
        int opcion = 7;
        Scanner leer = new Scanner(System.in);
        ListaEstudiantes estudiantes = new ListaEstudiantes();

        while (opcion != 6) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        estudiantes.add();
                        break;
                    case 2:
                        estudiantes.mostrar();
                        break;
                    case 3:
                        estudiantes.modificar();
                        break;
                    case 4:
                        estudiantes.pasarLista();
                        break;
                    case 5:
                        estudiantes.eliminar();
                        break;
                    case 6:
                        System.out.println("\t\tPrograma Finalizado");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException Error) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }

}
