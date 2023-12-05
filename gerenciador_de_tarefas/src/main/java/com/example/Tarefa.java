package com.example;

import java.util.Scanner;

public class Tarefa {
    private String nome;
    private String descricao;
    private int prioridade;

    //CONSTRUTOR
    public Tarefa(String n, String desc, int prio) {
        this.nome = n;
        this.descricao = desc;
        this.prioridade = prio;
    }
    
    //NOME
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    //DESCRIÇÃO
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //PRIORIDADE
    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    //MÉTODO CRIAR TAREFA
    public static Tarefa criarTarefa(Scanner scanner) {

        System.out.println("Detalhes da tarefa:");
        System.out.println("Nome: ");
        String nome = scanner.next();

        scanner.nextLine();

        System.out.println("Descrição: ");
        String desc = scanner.next();

        scanner.nextLine();
        
        System.out.println("Prioridade: ");
        int prio = scanner.nextInt();

        return new Tarefa(nome, desc, prio);
    }

}
