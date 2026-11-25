public class Sensor extends Dispositivo {
    private double lectura;
    private String unidad;

    public Sensor(String codigo, String nombre, boolean activo, double lectura, String unidad) {
        super(codigo, nombre, activo);
        this.lectura = lectura;
        this.unidad = unidad;
    }

    @Override
    public String obtenerEstadoOperacion() {
        if (isActivo()) {
            return "Sensor midiendo " + lectura + " " + unidad;
        }
        return "Sensor sin lectura";
    }

    @Override
    public String mostrarInformacion() {
        return "[Sensor] " + super.mostrarInformacion()
                + " | Lectura: " + lectura + " " + unidad
                + " | Estado: " + obtenerEstadoOperacion();
    }
}
