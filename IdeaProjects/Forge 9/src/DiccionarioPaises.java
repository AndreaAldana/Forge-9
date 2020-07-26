import Paises.paises;

import java.util.*;

public class DiccionarioPaises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<paises> vecinosArgentina = new ArrayList<>();
        List<paises> vecinosChile = new ArrayList<>();
        List<paises> vecinosBrasil = new ArrayList<>();

        paises argentina = new paises("ARGENTINA", "BUENOS AIRES", vecinosArgentina);
        paises chile = new paises("CHILE", "SANTIAGO DE CHILE", vecinosChile);
        paises brasil = new paises("BRASIL", "BRASILIA", vecinosBrasil);

        vecinosArgentina.add(chile);
        vecinosArgentina.add(brasil);

        vecinosBrasil.add(chile);
        vecinosBrasil.add(argentina);


        vecinosChile.add(argentina);
        vecinosChile.add(brasil);


        Map<String, paises> Paises = new HashMap<>();

        System.out.println("Ingrese un país");
        String pInicio = sc.nextLine().toUpperCase();

        if (pInicio.equals(argentina.getNombre())){
                viaje(argentina);
        }
        else if (pInicio.equals(chile.getNombre())) {
            viaje(chile);
        }
        else if (pInicio.equals(brasil.getNombre())) {
            viaje(brasil);
        }

    }



    static void viaje (paises inicio){

        int proximo = new Random().nextInt(2);
        System.out.println(inicio.getPaisesVecinos().get(proximo).getNombre());

            }


        }



