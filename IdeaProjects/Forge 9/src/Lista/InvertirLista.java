package Lista;

import java.util.ArrayList;
import java.util.List;

public class InvertirLista {
    List<Integer> numeros = new ArrayList<>();

    public InvertirLista(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> invertirLista(List<Integer> numeros){

        List<Integer> reverse;

            reverse = new ArrayList<>();

            for (int i = numeros.size()-1; i>=0; i--) {

                reverse.add(numeros.get(i));
            }

        return reverse;
    }

}
