public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Sensor("S01", "Temp", true, 24.5, "°C");
        Dispositivo d2 = new Actuador("A01", "Valvula", true, 50, 2.5);
        Dispositivo d3 = new Sensor("S02", "Presion", false, 1.8, "bar");
        Dispositivo d4 = new Actuador("A02", "Motor", false, 0, 5.0);
        Dispositivo d5 = new Controlador("C01", "PLC", true, 16);

        EstacionControl estacion = new EstacionControl();
        estacion.agregarDispositivo(d1);
        estacion.agregarDispositivo(d2);
        estacion.agregarDispositivo(d3);
        estacion.agregarDispositivo(d4);

        System.out.println("=== Dispositivos ===");
        System.out.println(estacion.mostrarDispositivos());

        System.out.println("Activos: " + estacion.contarActivos());

        System.out.println("\n=== Busqueda ===");
        Dispositivo encontrado = estacion.buscarDispositivo("A01");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInformacion());
        }
        if (estacion.buscarDispositivo("X99") == null) {
            System.out.println("Dispositivo X99 no encontrado");
        }

        System.out.println("\n=== Desafio: Controlador ===");
        estacion.agregarDispositivo(d5);
        System.out.println(estacion.mostrarDispositivos());
        System.out.println("Activos: " + estacion.contarActivos());
    }
}
