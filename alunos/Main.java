package alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a matricula do aluno: ");
        int matricula = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Inforne o curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.println("Informe o telefone do aluno: ");
        String telefone = scanner.nextLine();

        Aluno aluno = new Aluno(matricula, nome, curso, telefone);

        double nota = 0;
        do {
            System.out.println("Digite a nota do aluno\n" +
                "Digite 0 para sair");
            nota = Double.parseDouble(scanner.nextLine());

            if (nota > 10) {
                System.out.println("Nota inválida");
                continue;
            } else if (nota > 0) {
                aluno.addNota(nota);
                System.out.println("Nota adicionada");
            }

        } while (nota > 0);

        System.out.println(aluno.toString());
        System.out.println("=====================================");
        scanner.close();
    }
}