import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Gerente");
            System.out.println("2 - Adicionar Atendente");
            System.out.println("3 - Listar todos os funcionários");
            System.out.println("4 - Mostrar salário de funcionário (por CPF)");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Salário base: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data de nascimento: ");
                    String dataNasc = sc.nextLine();

                    funcionarios.add(new Gerente(nome, cpf, salario, dataNasc));
                    System.out.println("Gerente adicionado com sucesso!");
                }

                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Salário base: ");
                    double salario = sc.nextDouble();
                    System.out.print("Comissão: ");
                    double comissao = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data de nascimento: ");
                    String dataNasc = sc.nextLine();

                    funcionarios.add(new Atendente(nome, cpf, salario, dataNasc, comissao));
                    System.out.println("Atendente adicionado com sucesso!");
                }

                case 3 -> {
                    System.out.println("\n--- Lista de Funcionários ---");
                    for (Funcionario f : funcionarios) {
                        System.out.println(f);
                    }
                }

                case 4 -> {
                    System.out.print("Informe o CPF do funcionário: ");
                    String cpfBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : funcionarios) {
                        if (f.getCpf().equals(cpfBusca)) {
                            System.out.println("Salário de " + f.nome + ": R$ " + f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado!");
                    }
                }

                case 5 -> System.out.println("Encerrando o programa...");

                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}
