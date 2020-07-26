package Lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();
        InvertirLista ayura = new InvertirLista(numeros);

        for (int i = 0; i<= 10; i++){
            numeros.add(i);
        }
        System.out.println(numeros);


        System.out.println(ayura.invertirLista(numeros));
    }


}
