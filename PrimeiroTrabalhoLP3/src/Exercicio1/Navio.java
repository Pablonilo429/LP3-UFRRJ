package Exercicio1;

public class Navio {
    public String nome;    //Atributo relacionado ao nome do navio
    private String ano;     //Atributo relacionado ao ano de fabricacao do navio

    public Navio(String nome, String ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Nome do navio:"+ getNome()+"\n"+"Ano de fabricacao:"+getAno();
    }
}
