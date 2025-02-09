package Figuras;


public class Esfera extends FiguraGeometrica {
    private double Radio;
    
    public Esfera (double Radio){
        this.Radio = Radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen(){
        double Volumen = 1.333 * Math.PI *Math.pow(this.Radio, 3);
        return Volumen;
    }
    public double calcularSuperficie(){
        double Superficie = 4 * Math.PI *Math.pow(this.Radio, 2);
        return Superficie;
        
    }
    
}
