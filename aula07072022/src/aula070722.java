public class aula070722 {
    double Av1;
    double Av2;

    public aula070722(){
    }
    public aula070722(double Av1, double Av2){
        this.Av1 = Av1;
        this.Av2 = Av2;
    }

    public double getAv1() {
        return Av1;
    }

    public void setAv1(double av1) {
        Av1 = av1;
    }

    public double getAv2() {
        return Av2;
    }

    public void setAv2(double av2) {
        Av2 = av2;
    }

    public double calcularMedia(){
        return (Av1+Av2)/2;
    }

}
