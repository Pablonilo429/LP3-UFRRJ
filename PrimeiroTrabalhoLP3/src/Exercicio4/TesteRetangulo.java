package Exercicio4;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo[] retangulo = new Retangulo[2];
        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i < 2;i++){
            retangulo[i] = new Retangulo();
            System.out.printf("Entre com o comprimento do retangulo %d \n",i+1);
            retangulo[i].setComprimento(Double.parseDouble(input.nextLine()));
            System.out.printf("Entre com a largura do retangulo %d \n",i+1);
            retangulo[i].setLargura(Double.parseDouble(input.nextLine()));
            System.out.printf("O perimetro do retangulo %d: %.1f\n",(i+1),retangulo[i].perimetro());
            System.out.printf("A area do retangulo %d: %.1f\n",(i+1),retangulo[i].area());
        }
    }
}

