package org.example.controle_funcionarios.back_end.dominio;

public class Funcionario {
    private int id;
    private static int idAtual = 0;
    private String nome;
    private double salario;
    private String cargo;
    {
        Funcionario.idAtual++;
    }
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.id = Funcionario.idAtual;
    }

    public Funcionario(String nome, double salario, String cargo) {
        this(nome, salario);
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
