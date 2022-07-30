import javax.swing.JOptionPane;
import java.util.Scanner;
public class aula070722teste {
    public static void main(String[] args){
        aula070722[] medias = new aula070722[2];
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[2];
        int i = 0 ;
        String nota1String;
        String nota2String;
        double nota1;
        double nota2;


        for( i = 0; i < 2; i++){
            nomes[i] = JOptionPane.showInputDialog(null, "Escreva seu nome");
            nota1String = JOptionPane.showInputDialog(null, "Entre com a nota 1");
            nota1 = Double.parseDouble(nota1String);
            nota2String =  JOptionPane.showInputDialog(null, "Entre com a nota 2");
            nota2 = Double.parseDouble(nota2String);
            medias[i] = new aula070722(nota1,nota2);
            JOptionPane.showMessageDialog(null, "A nota de " + nomes[i] + "foi de: "+medias[i].calcularMedia());
        }
    }


}
