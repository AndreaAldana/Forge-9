package Taller3otraopcion;

public class paquete {

    String origen;
    String destino;
    String datos;
    long timestamp;

    public paquete(String origen, String destino, String datos) {
        this.origen = origen;
        this.destino = destino;
        this.datos = datos;
        this.timestamp = System.currentTimeMillis();
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDatos() {
        return datos;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", datos='" + datos + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

