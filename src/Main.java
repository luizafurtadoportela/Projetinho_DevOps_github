import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassTeste obj1 = new ClassTeste();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do crachá:");
        int numero = sc.nextInt();
        obj1.getLista().add("Id: " + numero);

        obj1.entrada();
        obj1.saida();
        System.out.println(obj1.getLista());


//        obj1.horasWork();


    }
}