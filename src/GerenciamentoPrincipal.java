import java.time.LocalDate;
import java.util.Scanner;

public class GerenciamentoPrincipal {
    private static Funcionalidade funcionalidade = new Funcionalidade();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        executar();
    }

    public static void opcoes() {
        System.out.println("Sistema de gerenciamento de tarefas");
        System.out.println("1 - Adicionar tarefa.");
        System.out.println("2 - Remover tarefa.");
        System.out.println("3 - Editar tarefa.");
        System.out.println("4 - Listar tarefas.");
        System.out.println("5 - Listar tarefas concluídas.");
        System.out.println("6 - Listar tarefas por prioridade.");
        System.out.println("7 - Concluir tarefa.");
        System.out.println("8 - Sair.");
    }

    public static void executar() {
        int escolha = 0;
        while (escolha != 8) {
            opcoes();
            System.out.println("Escolha uma opção:");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    editarTarefa();
                    break;
                case 4:
                    Funcionalidade.listarTarefas();
                    break;
                case 5:
                    Funcionalidade.listarTarefasConcluidas();
                    break;
                case 6:
                    Funcionalidade.listarPrioridades();
                    break;
                case 7:
                    concluirTarefa();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    public static void adicionarTarefa() {
        System.out.println("Digite o título da tarefa:");
        String titulo = scanner.nextLine();
        System.out.println("Digite a descrição da tarefa:");
        String descricao = scanner.nextLine();
        System.out.println("Digite a prioridade da tarefa:");
        String prioridade = scanner.nextLine();
        System.out.println("Digite a categoria da tarefa:");
        String categoria = scanner.nextLine();
        LocalDate dataCriacao = LocalDate.now();
        Tarefa novaTarefa = new Tarefa(titulo, descricao, false, prioridade, categoria, dataCriacao);
        Funcionalidade.adicionarTarefa(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public static void removerTarefa() {
        System.out.println("Digite o título da tarefa que deseja remover:");
        String titulo = scanner.nextLine();
        Funcionalidade.removerTarefaPorTitulo(titulo);
    }

    public static void editarTarefa() {
        System.out.println("Digite o título da tarefa que deseja editar:");
        String titulo = scanner.nextLine();
        System.out.println("Digite a nova descrição:");
        String novaDescricao = scanner.nextLine();
        System.out.println("Digite a nova prioridade:");
        String novaPrioridade = scanner.nextLine();
        System.out.println("Digite a nova categoria:");
        String novaCategoria = scanner.nextLine();
        Funcionalidade.editarTarefa(titulo, novaDescricao, novaPrioridade, novaCategoria);
    }

    // Novo método para concluir tarefa
    public static void concluirTarefa() {
        System.out.println("Digite o título da tarefa que deseja marcar como concluída:");
        String titulo = scanner.nextLine();
        Funcionalidade.concluirTarefa(titulo);
    }
}
