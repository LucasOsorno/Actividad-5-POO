package Figuras;


public class Piramide extends FiguraGeometrica {
    private double Base;
    private double Altura;
    private double Apotema;
    
    public Piramide(double Base, double Altura, double Apotema){
        this.Base = Base;
        this.Altura = Altura;
        this.Apotema = Apotema;
        
    }
    public double calcularVolumen(){
        double Volumen = (Math.pow(Base, 2) * Altura/3.0);
        return Volumen;
    }
    public double calcularSuperficie(){
        double AreaBase = Math.pow(Base, 2);
        double AreaLado = (2 * Base * Apotema);
        return (AreaBase + AreaLado);
    }
}
