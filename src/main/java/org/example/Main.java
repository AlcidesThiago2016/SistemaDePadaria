package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import org.example.controller.BancoDeDados;
import org.example.model.Itens;
import org.example.model.Venda;

import java.util.ArrayList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-*-*-*-*Sistema - Padaria DevFront-*-*-*-*");

        BancoDeDados bd = new BancoDeDados();
        ArrayList<Itens> itens = bd.getItens();

        Venda venda = new Venda();
        venda.adicionarItem(1, itens);
        venda.adicionarItem(3, itens);
        venda.adicionarItem(4, itens);

        venda.calcularTotal();

    }
}