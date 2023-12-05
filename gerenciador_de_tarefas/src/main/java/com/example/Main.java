package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Tarefa novaTarefa = null;
        
        System.out.println("Digite seu primeiro nome: ");
        String username = scanner.next();

        System.out.println("Olá "+username+", o que deseja?");
        
        boolean sair = false;
        while(!sair) {
            System.out.println("# para cada ação:");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Ver Tarefas");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    novaTarefa = Tarefa.criarTarefa(scanner);
                    break;
                case 2:
                    System.out.println(novaTarefa.getNome());
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Tente novamente.");
                    break;
            }
        }
        System.out.println(username+" saiu.");
        scanner.close();
    }
}