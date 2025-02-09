package Figuras;


public class Cilindro extends FiguraGeometrica {
    private double Radio;
    private double Altura;
    
    public Cilindro(double Radio, double Altura){
        this.Radio = Radio;
        this.Altura = Altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen(){
        double Volumen = Math.PI * Altura * Math.pow(Radio, 2);
        return Volumen;
    }
    public double calcularSuperficie(){
        double AreaLadoA = 2* Math.PI * Radio * Altura;
        double AreaLadoB = 2* Math.PI * Math.pow(Radio, 2);
        return (AreaLadoA + AreaLadoB);
    }
    
}
