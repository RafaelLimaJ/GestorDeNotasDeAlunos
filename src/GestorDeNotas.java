import com.gestordenotasdealunos.entity.Aluno;
import java.util.Scanner;

public class GestorDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja cadastrar?");
        int quantidadeDeAlunos = scanner.nextInt();
        scanner.nextLine();

        Aluno[] vetorDeAlunos = new Aluno[quantidadeDeAlunos];

        for (int j = 0; j < quantidadeDeAlunos; j++) {
            System.out.println("\n--- Digite os dados do Aluno " + (j + 1) + " ---");

            String nome;
            int idade;
            int NumeroDeNotas;

            System.out.println("Digite o nome do Aluno");
            nome = scanner.nextLine();

            System.out.println("Digite a idade do Aluno");
            idade = scanner.nextInt();

            System.out.println("Digite o numero de notas que o aluno vai receber");
            NumeroDeNotas = scanner.nextInt();

            int[] NotasDigitadas = new int[NumeroDeNotas];

            for (int i = 0; i < NumeroDeNotas; i++) {
                System.out.println("Digite a nota do Aluno");
                NotasDigitadas[i] = scanner.nextInt();

                while (NotasDigitadas[i] < 0 || NotasDigitadas[i] > 10) {
                    System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
                    System.out.println("Digite a nota do Aluno novamente:");
                    NotasDigitadas[i] = scanner.nextInt();
                }
            }
            scanner.nextLine();

            vetorDeAlunos[j] = new Aluno(nome, idade, NotasDigitadas);
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        for (int j = 0; j < quantidadeDeAlunos; j++) {
            Aluno alunoAtual = vetorDeAlunos[j];

            int somaNotas = 0;
            for (int notasDigitada : alunoAtual.getNotas()) {
                somaNotas += notasDigitada;
            }

            double media = (double) somaNotas / alunoAtual.getNotas().length;

            System.out.println("Nome: " + alunoAtual.getNome() + " | Idade: " + alunoAtual.getIdade() + " | Media das notas: " + media);
        }

        scanner.close();
    }
}