package Entidades;

public class idoso {

    private String nome;
    private String remedio;
    private int idade;
    private String doenca;

    public idoso(String nome, String remedio, int idade, String doenca) {
        this.nome = nome;
        this.remedio = remedio;
        this.idade = idade;
        this.doenca = doenca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRemedio() {
        return this.remedio;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getDoenca() {
        return this.doenca;
    }

    public void mostrarDados() {
        System.out.println("=== Dados do Idoso ===");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Doença: " + this.getDoenca());
        System.out.println("Remédio: " + this.getRemedio());
        System.out.println("======================");
    }

    @Override
    public String toString() {
        return "Idoso{" +
                "nome='" + nome + '\'' +
                ", remedio='" + remedio + '\'' +
                ", idade=" + idade +
                ", doenca='" + doenca + '\'' +
                '}';
    }
}