import java.util.Scanner;
public class aula070722teste {
    public static void main(String[] args){
        aula070722[] medias = new aula070722[2];
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[2];
        int i = 0 ;

        medias[0] = new aula070722(6.23, 4.12);
        medias[1] = new aula070722(6.27,5.40);
        nomes[0] = "Maria";
        nomes[1] = "Marco";

        for( i = 0; i < 2; i++){

            System.out.printf("A media de %s, foi de %.2f\n",nomes[i], medias[i].calcularMedia());
        }
    }


}
