public class Aula23062022 {
    private String nome;
    private double salario; //20 horas semanais
    private int horas_extras; //valor da hora extra = 1,5 hora normal



    public Aula23062022(String nome, double salario, int horas_extras) {
        this.nome = nome;
        this.salario = salario;
        this.horas_extras = horas_extras;
    }

    public void setNome(String nome) { this.nome = nome;}

    public String getNome(){return nome; }

    public double getSalario(double v) {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoras_extras(int i) {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }

    public double calcular_salario(){
        double salario_total;
        salario_total = salario + horas_extras * 1.5 * (salario/80);

        return salario_total;
    }

}
