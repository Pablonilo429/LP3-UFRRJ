import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.List;

public class Alunosteste {
	
    public static void main(String[] args){
    	ArrayList<String> CodDisc = new ArrayList<>();
    
        HashMap<Integer, ArrayList<String>> alunos = new HashMap <Integer, ArrayList<String>>();
        
        Scanner input = new Scanner(System.in);
        int matricula;
        matricula=0;
        
        do {
        	System.out.printf("Digite a matricula: ");
        	matricula = input.nextInt(); 
        	
        	if (matricula!= -1) {
	        	System.out.printf("Digite o codigo da disciplina: ");
	        	String CodMat = input.next(); 
	        	
	        	ArrayList<String> alternateList = alunos.get(matricula);    	
	      
	        	   
		            if(alternateList == null) {
		                alternateList = new ArrayList<>();
		                alunos.put(matricula, alternateList);
		            }
		        	
		         alternateList.add(CodMat);
	        	}
	        	        	        	
        }while(matricula!= -1);

        
        for(Entry<Integer, ArrayList<String>> alternateEntry : alunos.entrySet()) {
            System.out.println(alternateEntry.getKey() + ": " + 
                   alternateEntry.getValue().toString());
        }
        
        
        
}


}
