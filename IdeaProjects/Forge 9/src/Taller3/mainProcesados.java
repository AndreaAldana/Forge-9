package Taller3;

import ejercicio1.Email;

import java.util.ArrayList;
import java.util.List;

public class mainProcesados {
    public static void main(String[] args) {
        Paquete a1 = new Paquete("37.168.52.11.", "45.123.52.11.", "223");
        Paquete a2 = new Paquete("37.152.72.11.", "37.148.42.21.", "432");
        Paquete a3 = new Paquete("54.138.52.11.", "53.168.23.34.", "432 go");
        Paquete a4 = new Paquete("64.142.52.15.", "37.138.52.43.", "3423_a");
        Paquete a5 = new Paquete("53.123.63.11.", "47.138.56.11.", "3543_e");
        Paquete a6 = new Paquete("56.189.52.65.", "37.123.52.32", "34324_a");
        Paquete a7 = new Paquete("37.143.75.11.", "33.168.52.33.", "324_r");
        Paquete a8 = new Paquete("37.145.52.11.", "37.134.22.11.", "564_e");
        Paquete a9 = new Paquete("37.168.32.33.", "37.168.43.11.", "43423_ww");
        Paquete a10 = new Paquete("32.128.52.31.", "37.148.52.11.", "dsdfd-");


        Router x = new Router();
        x.recibir(a1);
        x.recibir(a2);
        x.recibir(a3);
        x.recibir(a4);
        x.recibir(a5);
        x.recibir(a6);
        x.recibir(a7);
        x.recibir(a8);
        x.recibir(a9);
        x.recibir(a10);


        System.out.println("Despachando paquetes. . .");
        x.despachados();

        System.out.println("No se han procesado: ");
        System.out.println(x.getNoProcesados());
        System.out.println("Todos los paquetes fueron procesados con éxito");



        }

}
