package Practico2.modelo;

import java.beans.PropertyChangeSupport;

public class Circulo {
    private int radio;
    private int x;
    private int y;
    private PropertyChangeSupport observado;

    public Circulo(int radio, int x, int y){
        this.radio = radio;
        this.x = x;
        this.y = y;
        this.observado = new PropertyChangeSupport(this);
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return String.valueOf(radio);
    }
}
