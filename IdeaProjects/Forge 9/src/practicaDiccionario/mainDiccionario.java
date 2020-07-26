package practicaDiccionario;

import java.util.HashMap;
import java.util.Map;

public class mainDiccionario {
    public static void main(String[] args) {
        Map<String, String> mascotas = new HashMap<>();
        mascotas.put("Perro", "Dog");
        mascotas.put("Gato", "Cat");
        mascotas.put("Pajaro", "Bird");
        mascotas.put("Rana", "Frog");
        mascotas.put("Mono", "Monkey");

        System.out.println(mascotas);
        System.out.println(invertirOrden(mascotas));
    }



    static Map<String, String> invertirOrden(Map<String, String> mascotas) {
        Map<String, String> resultado = new HashMap<>();

        for (String keys : mascotas.keySet()) {
            resultado.put(mascotas.get(keys), keys);

        }   // Invertir llaves y datos entre sí
        return resultado;
    }
}
