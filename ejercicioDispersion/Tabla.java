
public class Tabla {

    static final int TAMTABLA = 101;
    private int numElementos;
    private double factorCarga;
    private CasaRural[] tabla;

    // Inicializar la tabla
    public Tabla() {
        tabla = new CasaRural[TAMTABLA];

        for (int j = 0; j < TAMTABLA; j++)
            tabla[j] = null;

        numElementos = 0;
        factorCarga = 0.0;
    }

    // Obtener la direccion de la casa
    public int direccion(String clave) {
        int i = 0, p;
        long d;
        d = transformaCadena(clave);
        p = (int) (d % TAMTABLA);
        while (tabla[p] != null && !tabla[p].elCodigo().equals(clave)) {
            i++;
            p = p + i * i;
            p = p % TAMTABLA;
        }

        return p;
    }

    // transformacion de la cadena de texto
    long transformaCadena(String c) {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(10, c.length()); j++) {
            d = d * 27 + (int) c.charAt(j);
        }
        if (d < 0)
            d = -d;
        return d;
    }

    // Para insertar una nueva casa en la tabla.
    public void insertar(CasaRural r) {
        int posicion;
        posicion = direccion(r.elCodigo());
        tabla[posicion] = r;
        numElementos++;
        factorCarga = (double) (numElementos) / TAMTABLA;
        if (factorCarga > 0.5)
            System.out.println("\n!! Factor de carga supera el 50%.!!" + " Conviene aumentar el tamaño.");
    }

    // Para localizar una casa en la tabla
    public CasaRural buscar(String clave) {
        CasaRural conca;
        int posicion;
        posicion = direccion(clave);
        conca = tabla[posicion];
        if (conca != null)
            if (!conca.esAlta)
                conca = null;
        System.out.println("la casa no se encuentra xd");
        return conca;
    }

    // Para eliminar una casa
    public void eliminar(String clave) {
        int posicion;
        posicion = direccion(clave);
        if (tabla[posicion] != null) {
            tabla[posicion].esAlta = false;
        }

    }

}