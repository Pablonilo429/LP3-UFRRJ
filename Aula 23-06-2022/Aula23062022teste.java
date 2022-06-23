public class Aula23062022teste {
    public static void main(String[] args) {
        Aula23062022[] funcionario = new Aula23062022[5];

        funcionario[0] = new Aula23062022("Joyce", 8000.0, 3);
        funcionario[1] = new Aula23062022("Patrick", 9500.0, 4);
        funcionario[2] = new Aula23062022("Benvindo", 11000.0, 2);
        funcionario[3] = new Aula23062022("Abhner", 15000.0, 3);
        funcionario[4] = new Aula23062022("Nicoli", 12500.0, 5);

        String nome;
        double salario_total;
        int i;

        for(i = 0; i < 5; i++){
            nome = funcionario[i].getNome();
            salario_total = funcionario[i].calcular_salario();

            System.out.printf("Funcionario %s Salario: %.2f \n", nome, salario_total);
        }




    }
}
