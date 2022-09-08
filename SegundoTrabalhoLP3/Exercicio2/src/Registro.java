import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Registro {

    static HashMap<Integer, ArrayList<String>> alunos = new HashMap <Integer, ArrayList<String>>();

    public static void registrar() {

        Scanner input = new Scanner(System.in);

        int matricula = 0;

        do {
            System.out.printf("Digite a matricula: ");
            matricula = (int) input.nextLong();


            if (matricula != -1) {
                System.out.printf("Digite o codigo da disciplina: ");
                String CodMat = input.next();

                ArrayList<String> alternateList = alunos.get(matricula);


                if (alternateList == null) {
                    alternateList = new ArrayList<>();
                    alunos.put(matricula, alternateList);
                }

                alternateList.add(CodMat);
            }

        } while (matricula != -1);

        for(HashMap.Entry<Integer, ArrayList<String>> alternateEntry : alunos.entrySet()) {  //Imprime Arraylist com as disciplinas de cada aluno
            System.out.println(alternateEntry.getKey() + ": " +
                    alternateEntry.getValue().toString());
        }


    }
}
