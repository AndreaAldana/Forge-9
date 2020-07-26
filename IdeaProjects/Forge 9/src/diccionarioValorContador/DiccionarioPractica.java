package diccionarioValorContador;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiccionarioPractica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counterUno = 0;
        int counterDos = 0;
        int counterTres = 0;
        int counterCuatro = 0;
        int counterCinco = 0;
        int counterSeis = 0;
        int counterSiete = 0;
        int counterOcho = 0;
        int counterNueve = 0;
        int counterDiez = 0;

        System.out.println("Ingrese números entre 1 y 10, -1 para salir");
        while(true){
            Map<Integer, Integer> numeros = new HashMap<>();
            numeros.put(1,counterUno);
            numeros.put(2,counterDos);
            numeros.put(3,counterTres);
            numeros.put(4,counterCuatro);
            numeros.put(5,counterCinco);
            numeros.put(6,counterSeis);
            numeros.put(7,counterSiete);
            numeros.put(8,counterOcho);
            numeros.put(9,counterNueve);
            numeros.put(10,counterDiez);
            int num = sc.nextInt();

            if(num == 1){
                counterUno++;
            }
            else if (num==2){
                counterDos++;
            }
            else if(num == 3){
                counterTres ++;
            }
            else if(num == 4){
                counterCuatro++;
            }
            else if(num==5){
                counterCinco++;
            }
            else if(num == 6){
                counterSeis ++;
            }
            else if (num == 7){
                counterSiete ++;
            }
            else if (num == 8){
                counterOcho ++;
            }
            else if (num == 9){
                counterNueve++;
            }
            else if(num==10){
                counterDiez++;
            }
            else if(num == -1){
                System.out.println(numeros);
                System.exit(-1);
            }


        }

    }
}
