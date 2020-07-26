package Taller3otraopcion;

import java.util.ArrayList;
import java.util.List;

public class router {

    List<paquete> procesados = new ArrayList<>();
    List<paquete> noProcesados = new ArrayList<>();

    public router() {
        }



    public void recibir(paquete a1) {
        noProcesados.add(a1);
    }
    public void procesar(paquete A) {
        for (paquete e : noProcesados) {
            procesados.add(e);
        }
        noProcesados.removeAll(procesados);

    }

    public void despachados() {

        for (paquete e : procesados) {
            System.out.println(e.toString());

        }
    }
    public List<paquete> getNoProcesados () {
        return noProcesados;
    }


}
