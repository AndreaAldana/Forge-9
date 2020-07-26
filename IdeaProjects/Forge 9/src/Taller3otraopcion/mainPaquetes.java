package Taller3otraopcion;

import Taller3.Paquete;

public class mainPaquetes {
    public static void main(String[] args) {
        paquete a1 = new paquete("37.168.52.11.", "45.123.52.11.", "223");
        paquete a2 = new paquete("37.152.72.11.", "37.148.42.21.", "432");
        paquete a3 = new paquete("54.138.52.11.", "53.168.23.34.", "432 go");
        paquete a4 = new paquete("64.142.52.15.", "37.138.52.43.", "3423_a");
        paquete a5 = new paquete("53.123.63.11.", "47.138.56.11.", "3543_e");
        paquete a6 = new paquete("56.189.52.65.", "37.123.52.32", "34324_a");
        paquete a7 = new paquete("37.143.75.11.", "33.168.52.33.", "324_r");
        paquete a8 = new paquete("37.145.52.11.", "37.134.22.11.", "564_e");
        paquete a9 = new paquete("37.168.32.33.", "37.168.43.11.", "43423_ww");
        paquete a10 = new paquete("32.128.52.31.", "37.148.52.11.", "dsdfd-");


                router Router = new router();
                Router.recibir(a1);
                Router.procesar(a1);
                Router.recibir(a2);
                Router.procesar(a2);
                Router.recibir(a3);
                Router.procesar(a3);
                Router.recibir(a4);
                Router.procesar(a4);
                Router.recibir(a5);
                Router.procesar(a5);
                Router.recibir(a6);
                Router.procesar(a6);
                Router.recibir(a7);
                Router.procesar(a7);
                Router.recibir(a8);
                Router.procesar(a8);
                Router.recibir(a9);
                Router.procesar(a9);
                Router.recibir(a10);



                System.out.println("No se han procesado: ");
                System.out.println(Router.getNoProcesados());
                System.out.println("Paquetes procesados y despachados: ");
                System.out.println(Router.procesados);
            }

        }
