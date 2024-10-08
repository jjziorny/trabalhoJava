import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionalidade {
    private static List<Tarefa> ListaDeTarefas;
    private static Scanner scanner = new Scanner(System.in);

    public Funcionalidade() {
        ListaDeTarefas = new ArrayList<>();
    }

    public static void adicionarTarefa(Tarefa tarefa) {
        ListaDeTarefas.add(tarefa);
    }

    public static void removerTarefaPorTitulo(String titulo) {
        List<Tarefa> remover = new ArrayList<>();
        for (Tarefa tarefa : ListaDeTarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                remover.add(tarefa);
            }
        }
        ListaDeTarefas.removeAll(remover);
    }

    public static void editarTarefa(String titulo, String novaDescricao, String novaPrioridade, String novaCategoria) {
        for (Tarefa tarefa : ListaDeTarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                tarefa.setDescricao(novaDescricao);
                tarefa.setPrioridade(novaPrioridade);
                tarefa.setCategoria(novaCategoria);
                System.out.println("Tarefa " + titulo + " editada com sucesso.");
                return;
            }
        }
        System.out.println("Tarefa com título " + titulo + " não encontrada.");
    }


    public static void listarTarefas() {
        if (ListaDeTarefas.isEmpty()) {
            System.out.println("Sem tarefas.");
        } else {
            for (Tarefa tarefa : ListaDeTarefas) {
                System.out.println(tarefa);
            }
        }
    }


    public static void concluirTarefa(String titulo) {
        for (Tarefa tarefa : ListaDeTarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                if (!tarefa.isStatus()) { // Se o status for 'false', a tarefa não está concluída
                    tarefa.concluir(); // Método que define o status como 'true'
                    System.out.println("A tarefa '" + titulo + "' foi concluída com sucesso.");
                } else {
                    System.out.println("A tarefa '" + titulo + "' já está concluída.");
                }
                return;
            }
        }
        System.out.println("Tarefa com o título '" + titulo + "' não encontrada.");
    }

    public static void listarTarefasConcluidas() {
        System.out.println("Tarefas concluídas:");
        boolean encontrado = false;

        for (Tarefa tarefa : ListaDeTarefas) {
            if (tarefa.isStatus()) { // Se o status for 'true', a tarefa está concluída
                System.out.println(tarefa);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma tarefa concluída.");
        }
    }

    public static void listarPrioridades() {
        List<Tarefa> prioridade = new ArrayList<>();
        for (Tarefa tarefa : ListaDeTarefas) {
            if (tarefa.getPrioridade().equals(prioridade)) {
                prioridade.add(tarefa);
            }
        }
        if (prioridade.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada com essa prioridade.");

        } else {
            System.out.println("Prioridades:");
            for (Tarefa tarefa : prioridade) {
                System.out.println(tarefa);
            }
        }

    }



}

