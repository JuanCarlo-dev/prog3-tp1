package Practico2.modelo;

public class Circulo {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return String.valueOf(radio);
    }
}
