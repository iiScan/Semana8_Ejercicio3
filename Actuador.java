public class Actuador extends Dispositivo {
    private double posicion;
    private double potencia;

    public Actuador(String codigo, String nombre, boolean activo, double posicion, double potencia) {
        super(codigo, nombre, activo);
        this.posicion = posicion;
        this.potencia = potencia;
    }

    @Override
    public String obtenerEstadoOperacion() {
        if (isActivo()) {
            return "Actuador operando al " + posicion + "%";
        }
        return "Actuador detenido";
    }

    @Override
    public String mostrarInformacion() {
        return "[Actuador] " + super.mostrarInformacion()
                + " | Posicion: " + posicion + "%"
                + " | Potencia: " + potencia + " kW"
                + " | Estado: " + obtenerEstadoOperacion();
    }
}
