package listas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItens;

    public CarrinhoCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            } listaItens.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public Double calcularValorTotal(){
        Double valorTotal = 0d;
        if (!listaItens.isEmpty()){
            for (Item i : listaItens){
                Double valorItem = i.getPreco()*i.getQuantidade();
                valorTotal+=valorItem;
            } return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if (!listaItens.isEmpty()){
            System.out.println(this.listaItens);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras compras = new CarrinhoCompras();
        compras.adicionarItem("Arroz", 5.99, 2);
        compras.exibirItens();

        System.out.println("Valor total da compra R$" + compras.calcularValorTotal());

        compras.removerItem("arroz");
        compras.exibirItens();

    }
}
