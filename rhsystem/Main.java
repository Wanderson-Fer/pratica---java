package rhsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=================== Welcome ===================\n");

        Scanner input = new Scanner(System.in);
        
        Integer resp = 1;
        
        do {
            System.out.println("================== RH System =================");

            System.out.println("Que tipo de cadastro deseja realizar?");
            System.out.println("1 - Funcionário padrão");
            System.out.println("2 - Funcionário Linha Branca");
            System.out.println("3 - Funcionário de Eletrônicos");
            System.out.println("0 - Sair");
            resp = input.nextInt();
            
            switch(resp) {
                case 1:
                    Funcionario func = new Funcionario(input);
                    System.out.println("Funcionario " + func.getNome() + " registrado!");

                    System.out.println(func.getFuncionario() + "\n\n");
                    break;
                case 2:
                    FuncionarioLinhaBranca funcLB = new FuncionarioLinhaBranca(input);
                    System.out.println("Funcionario " + funcLB.getNome() + " registrado!");

                    System.out.println(funcLB.getFuncionario() + "\n\n");
                    break;
                case 3:
                    FuncionarioEletronico funcEle = new FuncionarioEletronico(input);
                    System.out.println("Funcionario " + funcEle.getNome() + " registrado!");

                    System.out.println(funcEle.getFuncionario() + "\n\n");
                    break;
                case 0:
                    System.out.println("Obrigado por usar o RH System...");
                default:
                    System.out.println("\nOpção Invalida!\n");
            }
            
        } while (resp != 0);
        
        input.close();
    }
}
