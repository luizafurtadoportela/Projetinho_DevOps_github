import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ClassTeste {
    private int numCracha;
    private Date dataEntrada;
    private Date dataSaida;
    private ArrayList<String> lista = new ArrayList<String>();

    public int getNumCracha() {
        return numCracha;
    }

    public String entrada() {
        Date data = new Date();
        if (dataEntrada == null) {
            dataEntrada = data;
            lista.add("Entrada: " + data);
            System.out.println("Bem-vindo, acesso liberado");
        } else {
            System.out.println("Obrigado pela visita");
        }
        return "a";
    }

    public String saida() {
        Date data = new Date();
        if (dataSaida == null) {
            dataSaida = data;
            lista.add("Saída: " + data);
        }
        return null;
    }

    public ArrayList<String> getLista() {
        return lista;
    }
}

//    public String horasWork(){
//        if (dataEntrada != dataSaida) {
//            return "Você trabalhou mais do que deveria!";
//        } else {
//            return "Só Sucesso!";
//        }
//    }

