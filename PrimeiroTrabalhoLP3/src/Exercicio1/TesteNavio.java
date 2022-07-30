package Exercicio1;

import Exercicio1.Cargueiro;
import Exercicio1.Cruzeiro;
import Exercicio1.Navio;

public class TesteNavio {
    public static void main(String[] args){
        Navio[] embarcacoes = new Navio[3];

        embarcacoes[0] = new Navio("Mestre Gaivota","2003");
        embarcacoes[1] = new Cruzeiro("MSC","2015", 400);
        embarcacoes[2] = new Cargueiro("Maersk Line", "2010", 50000);

       for(int i = 0; i < 3; i++){
           System.out.println(embarcacoes[i]); //Percorre o vetor e printa os determinados atributos
       }

    }
}
