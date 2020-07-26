package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AntiSpam {

    private List <Email> emailAceptados;
    private List <Email> noAceptados;

    public AntiSpam() {
        this.emailAceptados = new ArrayList<>();
        this.noAceptados = new ArrayList<>();

    }

    public void filtrar(Email e){
        boolean aceptar = true;
        if(e.getMessage().isEmpty()){
            aceptar = false;
        }
        else if (!e.getFrom().contains("@miempresa.cl")){
            aceptar = false;
        }

        if(aceptar){
            emailAceptados.add(e);
            System.out.println(e.toString());
        }else{
            noAceptados.add(e);
            System.out.println("El correo Gmail fue filtrado");
        }
    }

    public List<Email> getEmailAceptados() {
        return emailAceptados;
    }

    public List<Email> getNoAceptados() {
        return noAceptados;
    }
}
