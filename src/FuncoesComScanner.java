import java.util.Scanner;

public class FuncoesComScanner {

    static public String imprimeAprovacao (double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        if (media < 6) {
            return "Com média " + media + ", você foi reprovado";
        } else {
            return "Com média " + media + ", você foi aprovado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = scanner.nextDouble();

        scanner.close();

        imprimeAprovacao(nota1, nota2, nota3);

    }
}
