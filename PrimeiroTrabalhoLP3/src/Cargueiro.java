public class Cargueiro extends Navio{
    int capacidade; //Capacidade em toneladas

    public Cargueiro(String nome, String ano, int capacidade) {
        super(nome, ano);
        this.capacidade = capacidade;
    }

    public String toString(){
        return "Nome do navio: "+this.nome+"\n"+"Capaciadade do Navio: "+this.capacidade+"t";
    }
}
