package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.idoso;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Funcionario> funcionarios = new ArrayList<>();
    private static final List<idoso> idosos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("=== Sistema de Gestão (simples) ===");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Adicionar idoso");
            System.out.println("4. Listar idosos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            String opcao = sc.nextLine().trim();

            switch (opcao) {
                case "1":
                    adicionarFuncionario();
                    break;
                case "2":
                    listarFuncionarios();
                    break;
                case "3":
                    adicionarIdoso();
                    break;
                case "4":
                    listarIdosos();
                    break;
                case "0":
                    System.out.println("Encerrando. Até mais!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarFuncionario() {
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();

        int idade = lerInt("Idade: ");

        System.out.print("CPF: ");
        String cpf = sc.nextLine().trim();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine().trim();

        System.out.print("Horario de entrada: ");
        String horarioE = sc.nextLine().trim();

        System.out.print("Horario de saída: ");
        String horarioS = sc.nextLine().trim();

        Funcionario f = new Funcionario(nome, idade, cpf, cargo, horarioE, horarioS);
        funcionarios.add(f);
        System.out.println("Funcionário adicionado com sucesso.");
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("--- Lista de Funcionários ---");
        for (Funcionario f : funcionarios) {
            // usa o método Exibir() que já existe na sua classe Funcionario
            f.Exibir();
            System.out.println("----------------------------");
        }
    }

    private static void adicionarIdoso() {
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();

        System.out.print("Remédio: ");
        String remedio = sc.nextLine().trim();

        int idade = lerInt("Idade: ");

        System.out.print("Doença: ");
        String doenca = sc.nextLine().trim();

        idoso i = new idoso(nome, remedio, idade, doenca);
        idosos.add(i);
        System.out.println("Idoso adicionado com sucesso.");
    }

    private static void listarIdosos() {
        if (idosos.isEmpty()) {
            System.out.println("Nenhum idoso cadastrado.");
            return;
        }
        System.out.println("--- Lista de Idosos ---");
        for (idoso i : idosos) {
            
            i.mostrarDados();
        }
    }

    private static int lerInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String linha = sc.nextLine().trim();
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Digite um valor inteiro.");
            }
        }
    }
}