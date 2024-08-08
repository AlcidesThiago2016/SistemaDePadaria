package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import org.example.model.Itens;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-*-*-*-*Sistema - Padaria DevFront-*-*-*-*");

        Itens paoFrances = new Itens("Pão Frances",10,1);
        Itens paoDoceDeCoco = new Itens("Pão Doce",5.20,2);
        Itens paoDoceComGoiaba = new Itens("Pão Doce com Goiabada",6.30,3);
        Itens paoCarteiro = new Itens("Pão Carteiro",4.20,4);
        Itens paoTatu = new Itens("Pão Doce Tatuzinho",4.10,5);

    }
}