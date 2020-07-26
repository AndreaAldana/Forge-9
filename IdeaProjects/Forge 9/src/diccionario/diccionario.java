package diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class diccionario {
    public static void main(String[] args) {
        Map<String, Double> aa = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        aa.put("josé", 2.99);
        aa.put("Valentina", 3.68);
        aa.put("Andy", 2.44);

        System.out.println(aa);

        System.out.println(eliminarMayor(aa));


    }

    static Map<String, Double> eliminarMayor(Map<String, Double> dicc){
        double max = Double.MIN_VALUE;
        for(double v : dicc.values()){
            if(v<max){
                max = v;
            }
        }
        String llaveMax = null;
        for(String llave : dicc.keySet()){
            if (dicc.get(llave) == max) {
                llaveMax = llave;
                break;
            }
        }
        dicc.remove(llaveMax);
        return dicc;
    }
}
