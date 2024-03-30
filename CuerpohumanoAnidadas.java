class CuerpohumanoAnidadas{
    Corazon cor = new Corazon(0, null);
    Pulmon pul = new Pulmon(0, null);
    Higado hig = new Higado(null, 0);
    Apendice ape = new Apendice(null, 0);

    static class Corazon {
        private int ritmoCardiaco;
        private String tipo;

        public Corazon(int ritmoCardiaco, String tipo) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.tipo = tipo;
        }

        public void mostrarInformacion() {
            System.out.println("Corazon:");
            System.out.println("Ritmo cardiaco: " + ritmoCardiaco);
            System.out.println("Estado: " + tipo);
        }
    }

    static class Pulmon {
        private int capacidad;
        private String tipo;

        public Pulmon(int capacidad, String tipo) {
            this.capacidad = capacidad;
            this.tipo = tipo;
        }

        public void mostrarInformacion() {
            System.out.println("Pulmon:");
            System.out.println("Capacidad: " + capacidad + " ml");
            System.out.println("Estado: " + tipo);
        }
    }

    static class Higado {
        private String tipo;
        private double peso;

        public Higado(String tipo, double peso) {
            this.tipo = tipo;
            this.peso = peso;
        }

        public void mostrarInformacion() {
            System.out.println("Higado:");
            System.out.println("Estado: " + tipo);
            System.out.println("Peso: " + peso + " kg");
        }
    }

    static class Apendice {
        private String tipo;
        private double longitud;

        public Apendice(String tipo, double longitud) {
            this.tipo = tipo;
            this.longitud = longitud;
        }

        public void mostrarInformacion() {
            System.out.println("Apendice:");
            System.out.println("Estado: " + tipo);
            System.out.println("Longitud: " + longitud + " cm");
        }
    }

    public static void main(String args[]) {
        CuerpohumanoAnidadas cuerpoHumano = new CuerpohumanoAnidadas();

        cuerpoHumano.cor.ritmoCardiaco = 10;
        cuerpoHumano.cor.tipo = "Sano";

        cuerpoHumano.pul.capacidad = 5000;
        cuerpoHumano.pul.tipo = "Malo";

        cuerpoHumano.hig.tipo = "Sano";
        cuerpoHumano.hig.peso = 1.5;

        cuerpoHumano.ape.tipo = "Sano";
        cuerpoHumano.ape.longitud = 6.5;

        System.err.println("------------------------------");
        cuerpoHumano.cor.mostrarInformacion();
        System.err.println("------------------------------");
        cuerpoHumano.pul.mostrarInformacion();
        System.err.println("------------------------------");
        cuerpoHumano.hig.mostrarInformacion();
        System.err.println("------------------------------");
        cuerpoHumano.ape.mostrarInformacion();
        System.err.println("------------------------------");
    }
}


//Se movieron las clases Corazon, Pulmon, Higado y Apendice dentro de la clase CuerpoHumano2 para hacerlas clases anidadas.
