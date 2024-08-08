package org.example.controller;

import org.example.model.Itens;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BancoDeDados {

    ArrayList<String> linhas;
    ArrayList<Itens> itens;

    public BancoDeDados() {
        this.linhas = new ArrayList<>();
        lerDados();
        itens = new ArrayList<>();
        transformarLinhasEmObjetos(linhas);
    }

    public void lerDados(){
        try {
            InputStream is = new FileInputStream("produtos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            while(linha != null){
                linhas .add(linha);
                System.out.println(linha);
                linha = br.readLine();
            }

            System.out.println("O arquivo de texto foi lido com sucesso!");

        }catch (Exception e){
            System.out.println("Erro ao ler dados do arquivo");
            System.err.println(e.getMessage());
        }

    }

    public void transformarLinhasEmObjetos(ArrayList<String> linhas){
        String[] itensTexto = new String[3];
        Itens item;
        String nome;
        double preco;
        int codigo;

        for(String linha : linhas){
            itensTexto = linha.split(",");
            nome = itensTexto[0];
            preco = Double.parseDouble(itensTexto[1]);
            codigo = Integer.parseInt(itensTexto[2]);
            item = new Itens(nome, preco, codigo);
            itens.add(item);
        }
    }

    public ArrayList<Itens> getItens(){
        return itens;
    }
}
