package examen;

import java.util.Arrays;

public class ListasArreglos extends Menu {
    Menu principal = new Menu();

    public void registro(int contador) {
        sc.nextLine();
        for (int i = 0; i < contador; i++) {
            System.out.print("\nNombre del departamento: ");
            departamento = sc.nextLine();
            System.out.print("Numero de municipios: ");
            municipio = sc.nextInt();
            System.out.print("Cabecera: ");
            sc.nextLine();
            cabecera = sc.nextLine();
            Registro registro = new Registro(departamento, municipio, cabecera);
            lista.add(registro);
            arreglo[indice] = registro;
            indice++;
        }
    }

    public void busquedaLista(String elemento) {
        for (int i = 0; i < lista.size(); i++) {
            Registro registro = lista.get(i);
            if (registro.getDepartamento().equals(elemento)) {
                System.out.println("El departamento de \"" + elemento + "\", si se encuentra en el registro.");
                return;
            }
        }
        System.out.println("El departamento de \"" + elemento + "\", no se encuentra en el registro.");
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

    public void consultarPosicion(String nombre) {
        Arrays.asList(arreglo[indice]);
        if (Arrays.asList(arreglo[indice]).contains(nombre)) {
            int posicion = Arrays.asList(arreglo[indice]).indexOf(nombre);
            System.out.println("El departamento de " + nombre + ", si se encuentra en los registros en la posicion: " + posicion);
        } else {
            System.out.println("El departamento de " + nombre + ", no se encuentra dentro de los registros");
        }
    }
    /*public void registroArreglo(int contador){
        for (int i = 0; i <contador; i++) {
            arreglo2[indice]="Nombre del departamento: "+arreglo[indice]+"\nNumero de municipios: "+arreglo[indice+1]+"\nCabecera: "+arreglo[indice+2];
            indice++;
        }
    }
    public void mostrarArreglo(){
        try{
            for (int i = 0; i <arreglo.length ; i++) {
                if (arreglo[indice]!=null){
                    System.out.println(arreglo2[indice]);
                }
            }
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }*/
}
