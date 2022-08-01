package Exercicio4;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo[] retangulo = new Retangulo[2];
        Scanner input = new Scanner(System.in);

        //Opcao com mais linhas de codigo

        Retangulo retangulo1 = new Retangulo;
        Retangulo retangulo2 = new Retangulo;
        System.out.printf("Entre com o comprimento do retangulo 1\n");
        retangulo1.setComprimento(Double.parseDouble(input.nextLine()));
        System.out.printf("Entre com a largura do retangulo 1\n");
        retangulo1.setLargura(Double.parseDouble(input.nextLine()));
        System.out.printf("O perimetro do retangulo1: %.1f\n",retangulo1.perimetro());
        System.out.printf("A area do retangulo1: %.1f\n",retangulo1.area());
        System.out.printf("Entre com o comprimento do retangulo 2\n");
        retangulo2.setComprimento(Double.parseDouble(input.nextLine()));
        System.out.printf("Entre com a largura do retangulo 2\n");
        retangulo2.setLargura(Double.parseDouble(input.nextLine()));
        System.out.printf("O perimetro do retangulo1: %.1f\n",retangulo2.perimetro());
        System.out.printf("A area do retangulo1: %.1f\n",retangulo2.area());
        

        //Opcao com menos codigo

        for(int i = 0 ; i < 2;i++){
            retangulo[i] = new Retangulo();
            System.out.printf("Entre com o comprimento do retangulo %d \n",i+1);
            retangulo[i].setComprimento(Double.parseDouble(input.nextLine()));
            System.out.printf("Entre com a largura do retangulo %d \n",i+1);
            retangulo[i].setLargura(Double.parseDouble(input.nextLine()));
            System.out.printf("O perimetro do retangulo %d: %.1f\n",(i+1),retangulo[i].perimetro());
            System.out.printf("A area do retangulo %d: %.1f\n",(i+1),retangulo[i].area());
        }
        
        /*Outra opção setando os valores diretamente no codigo
        
        Retangulo R1 = new Retangulo();
		R1.setComprimento(5.3);
		R1.setLargura(2);
		
		Retangulo R2 = new Retangulo();
		R2.setComprimento(9.5);
		R2.setLargura(5.2);
		
		System.out.println("\nPerímetro do Retangulo 1: " + R1.Perimetro() + "\nÁrea do Retangulo 1: " + R1.Area());
		System.out.println("\nPerímetro do Retangulo 2: " + R2.Perimetro() + "\nÁrea do Retangulo 2: " + R2.Area());
        */
        
    }
}

