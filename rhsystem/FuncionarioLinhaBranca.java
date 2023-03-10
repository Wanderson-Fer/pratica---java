package rhsystem;

import java.util.Scanner;

public class FuncionarioLinhaBranca extends Funcionario {
    private Double valorVendas;
    private Double comissao;

    public FuncionarioLinhaBranca(Integer matricula, String nome, String cpf, Double salario, Bairro bairro, Double valorVendas) {
        super(matricula, nome, cpf, salario, bairro);

        this.valorVendas = valorVendas;

        this.calcComissao();
    }

    public FuncionarioLinhaBranca() {        
        super();

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor das vendas do funcionário: ");
        this.valorVendas = input.nextDouble();

        this.calcComissao();

        input.close();
    }

    // Getters

    public Double getValorVendas() {
        return valorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    // Setters

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    // Calculated attributes

    private void calcComissao() {
        if (this.valorVendas <= 5000.0) 
            this.comissao = this.valorVendas * 0.02;
        else if (this.valorVendas <= 10000.0)
            this.comissao = this.valorVendas * 0.03;
        else
            this.comissao = this.valorVendas * 0.05;
    }

    @Override
    public Double calcSalario() {
        return super.calcSalario() + this.comissao;
    }

    @Override
    public Double calcSalario(Double bonus) {
        return super.calcSalario(bonus) + this.comissao;
    }
}
