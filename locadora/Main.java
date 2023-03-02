package locadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================== Testing ================");

        Scanner input = new Scanner(System.in);

        // Codigo, modelo, valor, marca, cilindradas
        
        Integer codigo = 1;

        System.out.print("Informe o modelo da moto: ");
        String modelo = input.next();

        System.out.print("Informe o código da marca da moto: ");
        String nomeMarca = input.next();
        Marca marcaEscolhida = new Marca(1, nomeMarca);

        System.out.print("Informe o valor da moto: ");
        Double valor = input.nextDouble();

        System.out.print("Informe a potencia em cilindradas da moto: ");
        Integer cilindradas = input.nextInt();

        Moto minhaMoto = new Moto(codigo, modelo, valor, marcaEscolhida, cilindradas);

        minhaMoto.paraString();

        input.close();
    }
}
