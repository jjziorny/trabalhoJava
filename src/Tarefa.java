import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean status;
    private String prioridade;
    private String categoria;
    private LocalDate dataCriacao;

    public Tarefa(String titulo, String descricao, boolean status, String prioridade, String categoria, LocalDate dataCriacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", prioridade='" + prioridade + '\'' +
                ", categora='" + categoria + '\'' +
                ", dataCriacao=" + dataCriacao +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void concluir() {
        this.status = true;
        System.out.println("Tarefa '" + this.titulo + "' foi concluída.");
    }
}
