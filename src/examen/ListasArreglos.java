package examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasArreglos extends Menu {
    Menu principal = new Menu();
    int indice = 0;
    protected String[] arreglo = new String[50];
    protected String[] vectorNombre = new String[50];
    protected int[] numeroMun = new int[50];
    String buscar;

    public void registro() {
        System.out.print("Ingrese la cantidad de registros que desea almacenar: ");
        contador = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < contador; i++) {
            System.out.println("\nRegistro " + (i + 1));
            System.out.print("Nombre del departamento: ");
            departamento = sc.nextLine();
            System.out.print("Numero de municipios: ");
            municipio = sc.nextInt();
            System.out.print("Cabecera: ");
            sc.nextLine();
            cabecera = sc.nextLine();
            Registro registro = new Registro(departamento, municipio, cabecera);
            lista.add(registro);
            vectorNombre[i] = departamento;
            numeroMun[i] = municipio;
            this.registroArreglo(departamento, municipio, cabecera);
        }
    }

    public void busquedaLista(String elemento) {
        for (int i = 0; i < lista.size(); i++) {
            Registro registro = lista.get(i);
            if (registro.getDepartamento().equals(elemento)) {
                System.out.println("\nEl departamento de \"" + elemento + "\", si se encuentra en el registro.");
                return;
            }
        }
        System.out.println("\nEl departamento de \"" + elemento + "\", no se encuentra en el registro.");
    }

    public void vaciarLista(String siNo) {
        if (siNo.equals("s") || siNo.equals("S")) {
            System.out.println("La lista ha sido vaciada");
            lista.clear();
            System.out.println("Elementos de la lista actualmente: ");
            System.out.println(lista);
        } else if (siNo.equals("n") || siNo.equals("N")) {
            System.out.println("La lista sigue conservando sus elementos");
        }
    }

    public void registroArreglo(String departamento, int municipio, String cabecera) {
        indice = indice + 1; //indice+=1; <== is the same, se puede escribir de ambas formas
        arreglo[indice] = "Nombre de departamento: " + departamento + "\nNumero de municipios: " + municipio + "\nCabecera: " + cabecera + "\n";
    }

    public void mostrarArreglo() {
        try {
            for (int i = 1; i < arreglo.length; i++) {
                if (!arreglo[i].isEmpty()) {
                    System.out.println(arreglo[i]);
                }
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public void busqueda() {
        int iterador = -1;
        System.out.print("\nIngrese el nombre del departamento que desea consultar: ");
        sc.nextLine();
        buscar = sc.nextLine();
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i] == null ? (buscar) == null : vectorNombre[i].equals(buscar)) {
                iterador = i;
            }
        }
        if (iterador == -1) {
            System.out.println("\nEl departamento de \"" + buscar + "\" no ha sido registrado");
        } else {
            System.out.println("\nEl departamento de \"" + buscar + "\" fue registrado en la posicion: \"" + (iterador + 1) + "\"");
        }
    }

    public void busquedaArreglo() {
        int pos = -1;
        System.out.print("\nIngrese el nombre del departamento que desea consultar: ");
        buscar = sc.nextLine();
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i] == buscar || vectorNombre[i].equals(buscar)) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("\nEl departamento de \"" + buscar + "\", no se encuentra en el registro.");
        } else {
            System.out.println("\nEl departamento de \"" + buscar + "\" fue registrado en la posicion: " + pos);
        }
    }

    public void busqueda2() {
        System.out.print("\nIngrese la inicial del departamento de su interes:  ");
        sc.nextLine();
        buscar = sc.nextLine();
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i] == null ? (buscar) == null : vectorNombre[i].contains(buscar)) {
                System.out.println("\nEl departamento con inicial \"" + buscar + "\" es \" " + vectorNombre[i] + " \"");
                return;
            }
        }
        System.out.println("\nNo se encuentra en el registro");
    }

    public void pares() {
        System.out.println("\nDepartamentos en posicion par con mas de 4 Municipios ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                if (numeroMun[i] > 4) {
                    System.out.println(vectorNombre[i]);
                }
            }
        }
    }
}
