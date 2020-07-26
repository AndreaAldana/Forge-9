package Paises;

import java.util.List;

public class paises {
    public String nombre = "";
    public String capital = "";
    public int poblacion;
    List<paises> paisesVecinos;


    public paises(String nombre, String capital, List<paises> vecinosArgentina) {
        this.nombre = nombre;
        this.capital = capital;



    }

    @Override
    public String toString() {
        return "paises{" +
                "paisesVecinos=" + paisesVecinos +
                '}';
    }

    public List<paises> getPaisesVecinos() {
        return paisesVecinos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}

