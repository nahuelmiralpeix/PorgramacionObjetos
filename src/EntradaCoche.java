import carrera.Coche;

public class EntradaCoche {
    public static void main(String[] args) {
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("1234ASD", "Ford", 100);
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        System.out.println("CocheA acelerado");
        cocheA.setVelocidad((int) ((Math.random() * 20) + 10));
        cocheA.mostrarDatos();

        System.out.println("Modificado cocheB");
        cocheB.setCv(150);
        cocheB.setMatricula("5678QWE");
        cocheB.setModelo("Opel");
        cocheB.mostrarDatos();

        System.out.println("CocheB acelerado");
        cocheB.setVelocidad((int) ((Math.random() * 20) + 10));
        cocheB.mostrarDatos();

        //cocheA.setCv(130);

        cocheA.acelerar(10);
        cocheB.acelerar(12);
        cocheA.acelerar(5);
        cocheB.acelerar(10);

        System.out.println("Los coches son acelerados");
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        Coche cocheGanador = null;
        if (cocheA.getKm() > cocheB.getKm()) {
            cocheGanador = cocheA;
        } else if (cocheB.getKm() > cocheA.getKm()) {
            cocheGanador = cocheB;
        }

        if (cocheGanador != null) {
            String mensaje = "El ganador es %s %s %.2f";
            System.out.println(String.format(mensaje, cocheGanador.getMatricula(),
                    cocheGanador.getModelo(), cocheGanador.getKm()));
        } else {
            System.out.println("Empate");
        }

        System.out.println("Carrera automática");
        int kilometrosEtapa = 1000000;

        do {
            cocheA.acelerar((int) (Math.random() * 50));
            cocheB.acelerar((int) (Math.random() * 50));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("vuelta");
            cocheA.mostrarDatos();
            cocheB.mostrarDatos();
        } while (cocheA.getKm() <= kilometrosEtapa || cocheB.getKm() <= kilometrosEtapa);

        cocheGanador = null;
        if (cocheA.getKm() > cocheB.getKm()) {
            cocheGanador = cocheA;
        } else if (cocheB.getKm() > cocheA.getKm()) {
            cocheGanador = cocheB;
        }
        if (cocheGanador != null) {
            String mensaje = "El ganador es %s %s %.2f";
            System.out.println(String.format(mensaje, cocheGanador.getMatricula(),
                    cocheGanador.getModelo(), cocheGanador.getKm()));
        } else {
            System.out.println("Empate");
        }

    }
}
