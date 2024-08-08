package org.example.model;

import java.util.ArrayList;

public class Venda {
    ArrayList<Itens> paes;

    public Venda(){
        this.paes = new ArrayList<>();
    }

    public void adicionarItem(Itens item){
        paes.add(item);
    }

    public void adicionarItem(int codigo, ArrayList<Itens> itens){
        System.out.println(itens.get(codigo-1).getNome()+", foi adicionado com sucesso.");
        paes.add(itens.get(codigo-1));
    }

    public void removerItem(int codigo){
        String itemRemovido = "";
        for(int i=0; i<paes.size(); i++){
            if(paes.get(i).getCodigo() == codigo){
                itemRemovido = paes.get(i).getNome();
                paes.remove(i);
                i= paes.size();
            }
        }
        System.out.println("item " + itemRemovido + " removido com sucesso");
    }
    
    public void calcularTotal(){
        double total = 0;
        for(int i=0; i<paes.size(); i++){
            total += paes.get(i).getPreco();
        }
        System.out.println("Total a pagar R$: " + total);
    }
}
