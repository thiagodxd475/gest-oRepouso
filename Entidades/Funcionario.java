package Entidades;

public class Funcionario {

    private String nome;
    private int idade;
    private String cpf;
    private String cargo;
    private String horarioEntrada;
    private String horarioSaida;

    public Funcionario(String nome, int idade, String cpf, String cargo, String horarioEntrada, String horarioSaida) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cargo = cargo;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void exibir() {
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("CPF : " + this.cpf);
        System.out.println("Cargo : " + this.cargo);
        System.out.println("Horario de entrada : " + this.horarioEntrada);
        System.out.println("Horario de saida : " + this.horarioSaida);
    }

    public void Exibir() {
        exibir();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", horarioEntrada='" + horarioEntrada + '\'' +
                ", horarioSaida='" + horarioSaida + '\'' +
                '}';
    }
}