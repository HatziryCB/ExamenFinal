package examen;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static protected int opcion, accion, contador, municipio;
    static protected String departamento, cabecera;
    static protected String siNo;
    static ArrayList<Registro> lista = new ArrayList<Registro>();
    static Scanner sc = new Scanner(System.in);
    static ListasArreglos metodos = new ListasArreglos();
    static Registro registro = new Registro(departamento,municipio,cabecera);

    public static void main(String[] args) {
        System.out.println("    BIENVENIDO AL PROGRAMA DE REGISTRO DE DEPARTAMENTOS DE GUATEMALA    ");
        System.out.println("                    Examen final de Programacion I");
        System.out.println("\nLos departamentos serán registrados por medio de Listas y Arreglos");
        System.out.println("\n1) Metodos por listas en Java");
        System.out.println("2) Metodos por arreglos en Java");
        System.out.print("\nPor favor elige el metodo que deseas utilizar: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("\n    METODOS DE REGISTRO POR LISTAS    ");
            metodos.registro();
            do {
                System.out.println("\nMENU");
                System.out.println("1) Mostrar los elementos de la lista");
                System.out.println("2) Verificar elemento en la lista");
                System.out.println("3) Eliminar elementos de la lista");
                System.out.println("4) Salir del programa");
                System.out.print("\nIngresa la opcion que deseas realizar: ");
                accion = sc.nextInt();
                sc.nextLine();
                switch (accion) {
                    case 1:
                        System.out.println("\nMostrando los elementos de la lista a continuación:");
                        System.out.println(lista);
                        break;
                    case 2:
                        System.out.print("\nIngrese el nombre del departamento que desea consultar: ");
                        String elemento = sc.nextLine();
                        metodos.busquedaLista(elemento);
                        break;
                    case 3:
                        System.out.print("\n¿Esta seguro de querer eliminar los elementos de la lista? (S/N) ");
                        siNo = sc.nextLine();
                        metodos.vaciarLista(siNo);
                        break;
                    case 4:
                        System.out.println("Esperamos que este programa haya sido de utilidad para ti" + "\nQue tengas un hermoso dia");
                        break;
                }
            } while (accion != 4);
        } else if (opcion == 2) {
            System.out.println("\n    METODOS DE REGISTRO POR ARREGLOS  ");
            metodos.registro();
            do {
                System.out.println("\nMENU");
                System.out.println("\n1) Mostrar todos los registros en el arreglo");
                System.out.println("2) Buscar e identificar la posicion del elemento en el arreglo");
                System.out.println("3) Buscar departamento por medio de iniciales");
                System.out.println("4) Mostrar los departamentos en posiciones pares con mas de 4 Municipios");
                System.out.println("5) Salir del programa");
                System.out.print("\nIngresa la opcion que deseas realizar: ");
                accion = sc.nextInt();
                switch (accion) {
                    case 1:
                        System.out.println("\nMostrando todos los elementos almacenados en el arreglo:");
                        metodos.mostrarArreglo();
                        break;
                    case 2:
                        metodos.busqueda();
                        break;
                    case 3:
                        metodos.busqueda2();
                        break;
                    case 4:
                        metodos.pares();
                        break;
                    case 5:
                        System.out.println("\nEsperamos que este programa haya sido de utilidad para ti" + "\nQue tengas un hermoso dia");
                        break;
                }
            } while (accion != 5);
        }

    }
}