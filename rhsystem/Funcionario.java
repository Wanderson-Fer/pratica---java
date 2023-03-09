package rhsystem;

public class Funcionario {
    private final Integer matricula;
    private String nome;
    private String cpf;
    private Double salario;
    private Double imposto;

    public Bairro bairro;

    // Construct

    public Funcionario(Integer matricula, String nome, String cpf, Double salario, Bairro bairro) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.bairro = bairro;

        this.calcImposto();
    }

    // Getters

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    // Calculated attributes

    private void calcImposto() {
        if (this.salario <= 1320.0)
            this.imposto = this.salario * 0.05;
        else
            this.imposto = this.salario * 0.10;
    }

    public Double calcSalario() {
        return this.salario - this.imposto;
    }

    public Double calcSalario(Double bonus) {
        return this.salario - this.imposto + bonus;
    }
}
