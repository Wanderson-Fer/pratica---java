package alunos;

public class Aluno {
    private int matricula;
    private double notas[];

    private String nome;
    private String curso;
    private String telefone;

    public Aluno(int matricula, double notas[], String nome, String curso, String telefone) {
        this.matricula = matricula;
        this.notas = notas;
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double nota, int index) {
        try {
            this.notas[index] = nota;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("O indice " + index + " não existe");
            e.printStackTrace();
        }
    }
    public void addNota(double nota) {
        notas[notas.length] = nota;
    }

    public double media() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String status() {
        double media = this.media();
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4 && media < 6) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
