import java.util.Scanner;

public class FuncoesComScanner {

    static public void calculaMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        String mediaFormatada = String.format("%.2f", media);
        if (media < 6){
            System.out.println("O aluno foi reprovado");
        }

        System.out.printf("A média do aluno foi: " + mediaFormatada);
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

        calculaMedia(nota1, nota2, nota3);

    }
}
