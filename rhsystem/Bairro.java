package rhsystem;

import java.util.Scanner;

public class Bairro {
    private final Integer codigo;
    private String name;

    public Bairro(Integer codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    public Bairro() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código do bairro: ");
        this.codigo = input.nextInt();
        
        System.out.println("Informe o nome do bairro: ");
        this.name = input.next();

        input.close();
    }

    // Getters

    public Integer getCodigo() {
        return codigo;
    }
    
    public String getName() {
        return name;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
}
