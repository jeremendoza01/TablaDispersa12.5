import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int control;
        control = 1;
        String codigo;
        Scanner input = new Scanner(System.in);
        Tabla tabla = new Tabla();

        while (control != 0) {
            // try {
            System.out.println("Ingrese 1 para cargar una casa");
            System.out.println("Ingrese 2 para buscar una casa");
            System.out.println("Ingrese 3 para eliminar una casa");
            System.out.println("Ingrese 0 para salir");

            control = input.nextInt();
            input.nextLine();

            switch (control) {

                case 0: {
                    break;
                }

                case 1: {
                    CasaRural casarural = new CasaRural();
                    tabla.insertar(casarural);
                    break;

                }
                case 2: {
                    System.out.println("ingrese el codigo para buscar una casa: ");
                    codigo = input.nextLine();
                    tabla.buscar(codigo).muestra();
                    break;
                }
                case 3: {
                    System.out.println("ingrese el codigo para eliminar una casa:");
                    codigo = input.nextLine();
                    tabla.eliminar(codigo);
                    System.out.println("se ha eliminado la casa nro " + codigo);
                    break;
                }
            }

            // } catch (Exception e) {

            // }

        }
    }
}