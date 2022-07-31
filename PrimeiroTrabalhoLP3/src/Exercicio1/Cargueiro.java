package Exercicio1;

public class Cargueiro extends Navio {
    int capacidade; //Capacidade em toneladas

    public Cargueiro(String nome, String ano, int capacidade) {
        super(nome, ano);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String toString(){
        return "Nome do cargueiro: "+getNome()+"\n"+"Capaciadade do cargueiro: "+getCapacidade()+"t";
    }
}
