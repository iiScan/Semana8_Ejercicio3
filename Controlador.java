public class Controlador extends Dispositivo {
    private int numeroEntradas;

    public Controlador(String codigo, String nombre, boolean activo, int numeroEntradas) {
        super(codigo, nombre, activo);
        this.numeroEntradas = numeroEntradas;
    }

    @Override
    public String obtenerEstadoOperacion() {
        if (isActivo()) {
            return "Controlador procesando " + numeroEntradas + " entradas";
        }
        return "Controlador fuera de linea";
    }

    @Override
    public String mostrarInformacion() {
        return "[Controlador] " + super.mostrarInformacion()
                + " | Entradas: " + numeroEntradas
                + " | Estado: " + obtenerEstadoOperacion();
    }
}
