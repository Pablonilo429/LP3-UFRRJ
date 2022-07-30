package Exercicio4;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {

    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double perimetro(){
        return (largura*comprimento)*2;
    }

    public double area(){
        return (largura*comprimento);
    }
}
