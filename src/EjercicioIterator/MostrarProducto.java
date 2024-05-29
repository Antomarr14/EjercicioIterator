package EjercicioIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MostrarProducto {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int IdCounter = 1;

        while (true) {
            System.out.println("Ingrese el Id");
            int Id = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea

            System.out.println("Ingresa el nombre del producto");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese la marca");
            String marca = entrada.nextLine();

            System.out.println("Ingrese el precio");
            double precio = entrada.nextDouble();
            entrada.nextLine(); // Consumir el salto de línea

            String codigo = generarCodigo(nombre, marca, random);

            Producto producto = new Producto(IdCounter++, codigo, nombre, marca, precio);
            productos.add(producto);

            System.out.println("¿Desea ingresar otro producto? (si/no)");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("\nProductos registrados: ");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static String generarCodigo(String nombre, String marca, Random random) {
        String codigo = nombre.substring(0, 3) + marca.substring(0, 2) + String.valueOf(random.nextInt(1000));
        return codigo;
    }
}
