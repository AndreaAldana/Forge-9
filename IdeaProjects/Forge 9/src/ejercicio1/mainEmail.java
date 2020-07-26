package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class mainEmail {
    public static void main(String[] args) {


        Email aa = new Email("Andrea@miempresa.cl", "José@j", "Tarea", "Hola envio tarea");
        Email ae = new Email("arthuro@ali.cl", "adasasjd@cl", "Hola", "Te mando saludos");
        Email ab = new Email("jose@miempresa.cl", "sebas@cl", "Denegado", "Su solicitud ha sido denegada");
        Email ac = new Email("josefa@gmail.com", "manuel@yahoo.cl", "Retiro", "Adiós");
        Email ad = new Email("Juan@miempresa.cl", "carlos@cl", "Fiesta", "Estás invitado");
        Email ar = new Email("Daniel@google.cl", "super@miempr.cl", "Despedida", "Hasta luego");
        Email af = new Email("olga@miempresa.cl", "fulano@cl", "Cesante", "Estás despedido");
        Email ag = new Email("joseito@sdasd.cl", "kaio@cl", "Asies", "Te mando bsos");
        Email ah = new Email("andry@miempresa.cl", "anea@cl", "Salir", "Acepto invitación");
        Email ai = new Email("kakao@ali.cl", "adam@cl", "Mal", "Estás reprobado");
        Email aj = new Email("arthuro@miempresa.cl", "pablo@cl", "Ascenso", "Tienes nuevo cargo");

        AntiSpam spamAssasin = new AntiSpam();
        spamAssasin.filtrar(aa);
        spamAssasin.filtrar(ae);
        spamAssasin.filtrar(ab);
        spamAssasin.filtrar(ac);
        spamAssasin.filtrar(ad);
        spamAssasin.filtrar(ad);
        spamAssasin.filtrar(ar);
        spamAssasin.filtrar(af);
        spamAssasin.filtrar(ag);
        spamAssasin.filtrar(ah);
        spamAssasin.filtrar(ai);
        spamAssasin.filtrar(aj);

        List<Email> emailAceptados = spamAssasin.getEmailAceptados();
        System.out.println("Los mail aceptados son:");
        for (Email e : emailAceptados) {
            System.out.println(e.toString());

        }

        List<Email> noAceptados = spamAssasin.getNoAceptados();

        System.out.println("Los email no aceptados son:");
        for (Email e : noAceptados) {
            System.out.println(e.toString());

        }









    }



}
