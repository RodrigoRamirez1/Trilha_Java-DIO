package listas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterdeacricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Comprar Arroz");
        listaTarefa.adicionarTarefa("Pagar conta de luz");
        listaTarefa.adicionarTarefa("Estudar");
        System.out.println("Total de Tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterdeacricoesTarefas();

        listaTarefa.removerTarefa("estudar");
        listaTarefa.obterdeacricoesTarefas();
    }
}
