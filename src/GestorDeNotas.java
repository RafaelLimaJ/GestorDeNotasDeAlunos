import com.gestordenotasdealunos.entity.Aluno;
import java.util.Scanner;

public class GestorDeNotas {
    public static void main(String[] args) {
        String nome;
        int idade;
        int NumeroDeNotas;

        Scanner scanner = new Scanner(System.in);
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
        }

        int nota = 0;
        for (int notasDigitada : NotasDigitadas) {
            nota += notasDigitada;
        }
        int media = nota / NumeroDeNotas;

        Aluno aluno = new Aluno(nome, idade, NotasDigitadas);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Media das notas:" + media);
    }
}