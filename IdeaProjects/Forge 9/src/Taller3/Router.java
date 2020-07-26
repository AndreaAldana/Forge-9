package Taller3;

import java.util.ArrayList;
import java.util.List;

public class Router {
    List<Paquete> procesados = new ArrayList<>();
    List<Paquete> noProcesados = new ArrayList<>();

    public Router() {
        this.procesados = procesados;
        this.noProcesados = noProcesados;
    }

    public void recibir(Paquete A) {
        noProcesados.add(A);
        procesar(noProcesados);

    }

    public void procesar(List <Paquete> r) {
        procesados.addAll(r);
        noProcesados.removeAll(procesados);

    }

    public void despachados() {

        for (Paquete e : procesados) {
            System.out.println(e.toString());

        }
}


        public List<Paquete> getNoProcesados () {
            return noProcesados;
        }


    }



