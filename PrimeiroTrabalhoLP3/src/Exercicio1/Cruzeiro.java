package Exercicio1;

public class Cruzeiro extends Navio {
    private int maxpassageiros; //Atributo referente ao numero maximo de passageiros

    public Cruzeiro(String nome, String ano, int maxpassageiros){
        super(nome, ano);
        this.maxpassageiros = maxpassageiros;
    }


    public String toString() {
        return "Nome do navio: "+ this.nome+"\n"+"Maximo de passageiros: " + this.maxpassageiros;
    }
}