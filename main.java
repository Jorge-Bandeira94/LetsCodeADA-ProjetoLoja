package br.ada.aulas.loja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    static boolean continuacao = true;
    public static void main(String[] args) {

        Cadastramento cadastramento = new Cadastramento();
        Carrinho carrinho = new Carrinho();
        Listas listas = new Listas();

        while(continuacao){
            try{
                int escolhido = cadastramento.fachada();
                switch(escolhido) {
                    case 1-> {
                        cadastramento.cadastro();
                    }
                    case 2-> {
                        listas.listarTodos();
                    }
                    case 3-> {
                        Scanner scanner = new Scanner(System.in);
                        String ficarNestaAba = "s";
                        while(ficarNestaAba.equals("s")){
                            System.out.println("Esolha o número da categoria deseja: ");
                            System.out.println("1 - Album");
                            System.out.println("2 - Brinquedo");
                            System.out.println("3 - Filme");
                            System.out.println("4 - Jogo");
                            System.out.println("5 - Livro");
                            System.out.println("6 - Sair");
                            int escolha = scanner.nextInt();
                            listas.listarCategoria(escolha);
                            System.out.println("Deseja buscar outra categoria? (s/n)");
                            scanner.nextLine();
                            String escolha2 = scanner.nextLine().toLowerCase();
                            if(escolha2.equals("s")){
                                ficarNestaAba = "s";
                            } else {
                                ficarNestaAba = "n";
                            }
                        }


                    }
                    case 4-> {
                        Alteracao.alterar();
                    }
                    case 5 -> {
                        Alteracao.deletar();
                    }
                    case 6 -> {
                        System.out.println("Muito Obrigado. Volte Sempre");
                        continuacao = false;
                    }
                    case 7 -> {
                        carrinho.compra();
                        carrinho.transacao();
                        continuacao = false;

                    }
                    default -> {
                        System.out.println("Opção inválida, tente novamente.");
                    }

                }
            } catch (InputMismatchException ex){
                System.out.println("Opção inválida");
                System.out.println("");
                System.out.println("");
                break;
            }

        }

    }
}
