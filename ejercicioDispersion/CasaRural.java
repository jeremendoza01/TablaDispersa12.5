
// import java.io.*;
import java.util.Scanner;

public class CasaRural {
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numHabitacion = 0;
    private double precio = 0.0;
    boolean esAlta;

    public CasaRural() {
        esAlta = true;
        asigna();
    }

    // para asignar los valores de la casa
    public void asigna() {
        Scanner input = new Scanner(System.in);

        System.out.print("\n Codigo (10 caracteres): ");
        codigo = input.nextLine();
        System.out.print("\n Ciudad/Pueblo: ");
        poblacion = input.nextLine();
        System.out.print("\n Dirección: ");
        direccion = input.nextLine();
        System.out.print("\n Número de habitaciones: ");
        numHabitacion = Integer.parseInt(input.nextLine());
        System.out.print("\n Precio por día: ");
        precio = (new Double(input.nextLine())).doubleValue();
    }

    // retorna el codigo en string
    public String elCodigo() {
        return codigo;
    }

    // para mostrar las variables d la casa
    public void muestra() {
        System.out.println("\n Casa Rural " + codigo);
        System.out.println("Población: " + poblacion);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio por día: " + precio);
    }
}