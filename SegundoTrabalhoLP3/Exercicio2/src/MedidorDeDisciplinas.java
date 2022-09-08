import java.util.ArrayList;
import java.util.HashMap;

public class MedidorDeDisciplinas implements Medidor {
    public double medir(Object umObjeto) {

        return  Registrar.alunos.get(umObjeto).size();
    }
}
