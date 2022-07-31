package Exercicio1;


import java.util.ArrayList;

public class TesteNavio {
    public static void main(String[] args){
        Navio[] embarcacoes = new Navio[3];

        embarcacoes[0] = new Navio("Mestre Gaivota", "2003");
        embarcacoes[1] = new Cruzeiro("MSC","2015", 400);
        embarcacoes[2] = new Cargueiro("Maersk Line", "2010", 50000);

       for(int i = 0; i < 3; i++){
           System.out.println(embarcacoes[i]); //Percorre o vetor e printa os determinados atributos
       }

       //Duas formas para o mesmo problema

       ArrayList<Navio> lista = new ArrayList<>();
		
		//NAVIO
		
		Navio n1 = new Navio("Mestre Gaivota", "2003");
		lista.add(n1);
		
		//CRUZEIRO
		
		Cruzeiro c1 = new Cruzeiro("MSC","2015", 400);
		lista.add(c1);
		
		//CARGUEIRO
		
		Cargueiro CA1 = new Cargueiro("Maersk Line", "2010", 50000);
		lista.add(CA1);
		
		
		//IMPRIMINDO NA TELA...
		
		System.out.print("\n" + lista.toString()); //Sairá no formato de lista


    }
}
