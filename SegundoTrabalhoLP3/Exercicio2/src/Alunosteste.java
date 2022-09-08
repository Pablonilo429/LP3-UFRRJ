

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.List;

public class Alunosteste {

    public static void main(String[] args){
    	Medidor medidordisc = new MedidorDeDisciplinas();
		Registrar.registrar();
		double media = Entidade.calcularMedia(Registrar.alunos.keySet().toArray(), medidordisc);
		System.out.printf("Media de disciplinas por aluno: %.2f", media);
        
	}


}
