package Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfacee {
   static List<Peliculas> Lpeliculas = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("***MENU*** \n 1)Ingresar nueva pelicula \n 2)Modificar pelicula \n 3)Ver pelicula \n 4)Listado de peliculas \n /5 salir");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Lpeliculas();
        }

    }
    public static List<Peliculas> Lpeliculas() {
        boolean r=true;
        System.out.println("coloque codigo de su pelicula");
        int codigo=sc.nextInt();

        sc.nextLine();
        System.out.println("coloque nombre de su pelicula");
        String nombre=sc.nextLine();
        System.out.println("coloque descripcion de su pelicula");
        String descripcion=sc.nextLine();
        System.out.println("coloque fecha de publicacion de su pelicula");
        String fecha=sc.nextLine();
        System.out.println("coloque genero de su pelicula");
        String genero=sc.nextLine();
        System.out.println("coloque cantidad de vistas de su pelicula");
        try {
            int cantidad=sc.nextInt();
        } catch (Exception e) {
            System.out.println("no es una cantidad de vistas");

        }

        System.out.println("coloque actores que participan de su pelicula");
        String actores=sc.nextLine();
        sc.nextLine();
        Peliculas pelicula1 =new Peliculas(codigo,nombre,descripcion,fecha,genero,0,actores);

        Lpeliculas.add(pelicula1);

        return Lpeliculas;
    }
    public static void verificar(int code, Peliculas pelicula1) throws Exception {
        if (code==pelicula1.codigo) {
            throw new Exception("¡La cuenta ya está registrada!");
        }
    }

    public static void modPelisucla(){
        System.out.println("ingrese el codigo de la pelicula a editar ");
        int codigo=sc.nextInt();
        for (Peliculas peliculas : Lpeliculas) {
            if (peliculas.getCodigo()==peliculas.getCodigo()) {
                System.out.println("ingrese nuevo nombre de su pelicula");
                peliculas.setNombre(sc.nextLine());
                sc.nextLine();
                System.out.println("ingrese nuevo descripcion de su pelicula");
                peliculas.setDescripcion(sc.nextLine());
                System.out.println("ingrese nuevo fecha de publicacion de su pelicula");
                peliculas.setFecha(sc.nextLine());
                System.out.println("ingrese nuevo genero de su pelicula");
                peliculas.setGenero(sc.nextLine());
                System.out.println("ingrese nuevo cantidad de vistas de su pelicula");
                try {
                    int cantidad=sc.nextInt();
                    peliculas.setCantidad(sc.nextInt());
                } catch (Exception e) {
                    System.out.println("no es una cantidad de vistas");

                }
                System.out.println("ingrese nuevo actores de su pelicula");
                peliculas.setActores(sc.nextLine());

            }else {
                System.out.println("el codigo no existe aun");
            }
        }
    }
    public static void verPelicula(){
        System.out.println("ingrese el nombre de la pelicua que desea ver");
        for (Peliculas peliculas : Lpeliculas) {
            if (peliculas.getNombre().equals(sc.nextLine())) {
                int n=peliculas.getCantidad();
                peliculas.setCantidad(n+1);
            }
            else{
                System.out.println("la pelicula no existe");
            }
        }
    }
    public static void listado(){
        System.out.println("NOMBRE:"+"   "+"DESCRIPCION:"+"    "+"FECHA DE ESTRENO:"+"    "+"GENERO:"+ "     "+"CANTIDAD DE VISTAS:");
        for (Peliculas peliculas : Lpeliculas) {
            System.out.println(peliculas.getNombre()+"         "+peliculas.getDescripcion()+"       "+peliculas.getFecha()+"       "+peliculas.getGenero()+"       "+peliculas.getCantidad());
        }
    }
}
