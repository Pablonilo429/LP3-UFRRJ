public class Aula23062022teste {
    public static void main(String[] args) {
        Aula23062022 funcionario = new Aula23062022("Pablo de Oliveira", 10000.0, 10);

        double salario_total = funcionario.calcular_salario();
        System.out.printf("O salario total = %.2f", salario_total);
    }
}
