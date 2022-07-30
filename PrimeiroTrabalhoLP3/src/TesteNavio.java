public class TesteNavio {
    public static void main(String[] args){
        Navio[] embarcacoes = new Navio[3];

        embarcacoes[0] = new Navio("Mestre Gaivota","2003");
        embarcacoes[1] = new Cruzeiro("MSC","2015", 400);
        embarcacoes[2] = new Cargueiro("Maersk Line", "2010", 50000);

       for(int i = 0; i < 3; i++){
           System.out.println(embarcacoes[i]);
       }

    }
}
