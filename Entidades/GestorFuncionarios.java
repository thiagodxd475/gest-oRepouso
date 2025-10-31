package Entidades;

import java.util.ArrayList;
import java.util.List;

public class GestorFuncionarios {

    private List<Funcionario> funcionarios;

    public GestorFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void colocarFuncionario(Funcionario f) {
        if (f == null) return;
                funcionarios.add(f);
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (Funcionario f : funcionarios) {
            f.Exibir();             
            System.out.println("--------------");
        }
    }

    public List<Funcionario> getFuncionarios() {
        return new ArrayList<>(this.funcionarios);
    }
}