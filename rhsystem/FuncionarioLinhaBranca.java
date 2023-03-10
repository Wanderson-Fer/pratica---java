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

    public FuncionarioLinhaBranca(Scanner in) {        
        super(in);

        System.out.println("Informe o valor das vendas do funcionário: ");
        this.valorVendas = in.nextDouble();

        this.calcComissao();
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

    // Output function
    @Override
    public String getFuncionario() {
        return super.getFuncionario() +
            "+ Valor de Vandas: " + this.getValorVendas() + "\n"+
            "+ Comissão: " + this.getComissao()+ "\n";
    }
}
