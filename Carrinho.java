package br.ada.aulas.loja;
import java.util.Scanner;


public class Carrinho extends Listas {

    static Scanner scanner = new Scanner(System.in);

    static double valorTotal = 0;

    public static void compra() {

        String continuacao = "s";
        while(continuacao.equals("s")){
            System.out.println("Escolha a categoria de item que deseja comprar -----------------");
            System.out.println("1 - Album");
            System.out.println("2 - Brinquedo");
            System.out.println("3 - Filme");
            System.out.println("4 - Jogo");
            System.out.println("5 - Livro");
            System.out.println("6 - Sair");
            int escolha = scanner.nextInt();

            try{

                if(escolha == 6){
                    continuacao = "n";
                } else {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Escolha o item na lista abaixo ---------------------");
                    listarCategoria(escolha);
                    System.out.println("ID: ");

                    switch(escolha){
                        case 1-> {
                            int escolha2 = scanner.nextInt();
                            if(escolha2 >= 0){
                                int posicao = -1;
                                for(Album album: albuns){
                                    if(album.getId() == escolha2){
                                        posicao = albuns.indexOf(album);
                                        double preco = albuns.get(posicao).getPreco();
                                        valorTotal += preco;
                                        System.out.println("Deseja continuar? (s/n");
                                        scanner.nextLine();
                                        continuacao = scanner.nextLine().toLowerCase();
                                    }
                                }
                                if(posicao > -1){
                                    albuns.remove(posicao);
                                } else {
                                    System.out.println("Produto não encontrado");
                                }
                            } else {
                                System.out.println("Valor não Válido");
                            }

                        }
                        case 2-> {
                            int escolha2 = scanner.nextInt();
                            if(escolha2 >= 0){
                                int posicao = -1;
                                for(Brinquedo brinquedo: brinquedos){
                                    if(brinquedo.getId() == escolha2){
                                        posicao = brinquedos.indexOf(brinquedo);
                                        double preco = brinquedos.get(posicao).getPreco();
                                        valorTotal += preco;
                                        System.out.println("Deseja continuar? (s/n");
                                        scanner.nextLine();
                                        continuacao = scanner.nextLine().toLowerCase();
                                    }
                                }
                                if(posicao > -1){
                                    brinquedos.remove(posicao);
                                } else {
                                    System.out.println("Produto não encontrado");
                                }
                            } else {
                                System.out.println("Valor não Válido");
                            }
                        }
                        case 3-> {
                            int escolha2 = scanner.nextInt();
                            if(escolha2 >= 0){
                                int posicao = -1;
                                for(Filme filme: filmes){
                                    if(filme.getId() == escolha2){
                                        posicao = filmes.indexOf(filme);
                                        double preco = filmes.get(posicao).getPreco();
                                        valorTotal += preco;
                                        System.out.println("Deseja continuar? (s/n");
                                        scanner.nextLine();
                                        continuacao = scanner.nextLine().toLowerCase();
                                    }
                                }
                                if(posicao > -1){
                                    filmes.remove(posicao);
                                } else {
                                    System.out.println("Produto não encontrado");
                                }
                            } else {
                                System.out.println("Valor não Válido");
                            }

                        }
                        case 4-> {
                            int escolha2 = scanner.nextInt();
                            if(escolha2 >= 0){
                                int posicao = -1;
                                for(Jogo jogo: jogos){
                                    if(jogo.getId() == escolha2){
                                        posicao = jogos.indexOf(jogo);
                                        double preco = jogos.get(posicao).getPreco();
                                        valorTotal += preco;
                                        System.out.println("Deseja continuar? (s/n");
                                        scanner.nextLine();
                                        continuacao = scanner.nextLine().toLowerCase();
                                    }
                                }
                                if(posicao > -1){
                                    jogos.remove(posicao);
                                } else {
                                    System.out.println("Produto não encontrado");
                                }
                            } else {
                                System.out.println("Valor não Válido");
                            }

                        }
                        case 5-> {
                            int escolha2 = scanner.nextInt();
                            if(escolha2 >= 0){
                                int posicao = -1;
                                for(Livro livro: livros){
                                    if(livro.getId() == escolha2){
                                        posicao = livros.indexOf(livro);
                                        double preco = livros.get(posicao).getPreco();
                                        valorTotal += preco;
                                        System.out.println("Deseja continuar? (s/n");
                                        scanner.nextLine();
                                        continuacao = scanner.nextLine().toLowerCase();
                                    }
                                }
                                if(posicao > -1){
                                    livros.remove(posicao);
                                } else {
                                    System.out.println("Produto não encontrado");
                                }
                            } else {
                                System.out.println("Valor não Válido");
                            }

                        }
                        case 6-> {
                            System.out.println("Saindo...");
                            continuacao = "n";
                            break;
                        }

                        default -> {
                            System.out.println("Opção inválida");
                            continuacao = "n";
                            break;
                        }
                    }
                }


            } catch(IndexOutOfBoundsException ex){
                System.out.println("Id de produto inválido, tente novamente");
            }

        }




    }

    public static void transacao(){
        if(valorTotal > 0){
            boolean continuar = true;
            while(continuar) {
                System.out.println("");
                System.out.println("O valor tota dos itens que você comprou foi: ");
                System.out.println("R$: " + valorTotal);
                System.out.println("Digite o valor em dinheiro que pretende usar para pagar: ");
                System.out.println("R$: ");
                double pagamento = scanner.nextDouble();

                if (pagamento < valorTotal) {
                    System.out.println("Valor abaixo do esperado, digite novamente");
                } else {
                    continuar = false;
                    System.out.println("Seu troco é de: R$ " + (pagamento - valorTotal));
                    System.out.println("Dinheiro em caixa agora é: R$ " + (valorTotal));

                }
            }
            System.out.println("Obrigado Volte sempre ");
            System.out.println("");
            System.out.println("");
        } else {
            System.out.println("...");
            System.out.println("");
            System.out.println("");
        }


    }
}
