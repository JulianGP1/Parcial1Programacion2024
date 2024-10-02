import Interfaces.Interfacee;

import java.util.Scanner;

import static Interfaces.Interfacee.*;

public class Main {
    public static void main(String[] args) {
        boolean r = true;
        Scanner sc = new Scanner(System.in);
        while (r) {
            System.out.println("***MENU*** \n 1)Ingresar nueva pelicula \n 2)Modificar pelicula \n 3)Ver pelicula \n 4)Listado de peliculas \n /5 salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Lpeliculas();
                    break;
                case 2:
                    modPelisucla();
                case 3:
                    verPelicula();
                case 4:
                    listado();
                case 5:
                    return;


            }


        }
    }
}