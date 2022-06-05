package examen;
import java.util.Arrays;

public class ListasArreglos extends Menu {
    Menu principal = new Menu();
    int indice=0;
    public void registro(int contador){
        for (int i = 0; i <contador; i++) {
            System.out.print("\nRegistro "+(i+1)+"\nNombre del Departamento: ");
            nombre = sc.nextLine();
            lista.add("Registro "+(i+1)+"\nNombre del departamento:     "+nombre);
            arreglo[indice] = nombre;
            System.out.print("Cantidad de Municipios que posee: ");
            municipios = sc.nextLine();
            lista.add("\nCantidad de municipios:        "+municipios);
            arreglo[indice]=municipios;
            System.out.print("Cabecera: ");
            cabecera = sc.nextLine();
            lista.add("\nCabecera:                  "+cabecera+"\n");
            arreglo[indice]=cabecera;
        }
    }
    public void busquedaLista(String elemento){
        if (lista.contains(elemento)){
            System.out.println("El departamento de "+elemento+", si se encuentra en el registro.");
        }else {
            System.out.println("El departamento de "+elemento+", no se encuentra en el registro.");
        }
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
    public void consultarPosicion(String nombre){
        Arrays.asList(arreglo[indice]);
        if (Arrays.asList(arreglo[indice]).contains(nombre)){
            int posicion =Arrays.asList(arreglo[indice]).indexOf(nombre);
            System.out.println("El departamento de "+nombre+", si se encuentra en los registros en la posicion: "+posicion);
        }else {
            System.out.println("El departamento de "+nombre+", no se encuentra dentro de los registros");
        }
    }
    public void registroArreglo(int contador){
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
    }
}
