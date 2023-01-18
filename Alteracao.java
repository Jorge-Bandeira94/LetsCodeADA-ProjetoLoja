package br.ada.aulas.loja;

import java.util.InputMismatchException;

import static br.ada.aulas.loja.Listas.listarCategoria;

public class Alteracao extends Cadastramento{
    public static void alterar() {
        System.out.println("");
        System.out.println("");
        boolean sair = false;
        while (sair == false) {
            System.out.println(" Escolha o número da categoria de item que deseja alterar ");
            System.out.println(" 1 - Album ");
            System.out.println(" 2 - Brinquedo ");
            System.out.println(" 3 - Filme ");
            System.out.println(" 4 - Jogo ");
            System.out.println(" 5 - livro ");
            System.out.println(" 6 - Sair ");
            System.out.println(" Valor: ");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1 -> {
                        System.out.println(" Escolha o id do item que deseja modificar entre os itens abaixo");
                        listarCategoria(1);
                        int idDoItem = scanner.nextInt();

                        int posicao = 0;
                        for(Album album: albuns){
                            if(album.getId() == idDoItem){
                                posicao = albuns.indexOf(album);
                                System.out.println(" Agora preencha com os dados necessários:  ");
                                System.out.println(" Nome: ");
                                scanner.nextLine();
                                String nome = scanner.nextLine();
                                System.out.println(" Preço:  ");
                                double preco = scanner.nextDouble();
                                System.out.println(" Banda / Músico:  ");
                                scanner.nextLine();
                                String banda = scanner.nextLine();
                                System.out.println(" Gênero:  ");
                                String genero = scanner.nextLine();
                                System.out.println(" Selo:  ");
                                String selo = scanner.nextLine();

                                albuns.get(posicao).nome = nome;
                                albuns.get(posicao).preco = preco;
                                albuns.get(posicao).banda = banda;
                                albuns.get(posicao).genero = genero;
                                albuns.get(posicao).selo = selo;
                                System.out.println(" Modificações aceitas.");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println(" Escolha o id do item que deseja modificar entre os itens abaixo");
                        listarCategoria(2);
                        int idDoItem = scanner.nextInt();

                        int posicao = 0;
                        for(Brinquedo brinquedo: brinquedos){
                            if(brinquedo.getId() == idDoItem) {

                                System.out.println(" Agora preencha com os dados necessários:  ");
                                System.out.println(" Tipo: ");
                                scanner.nextLine();
                                String tipo = scanner.nextLine();
                                System.out.println(" Preço:  ");
                                double preco = scanner.nextDouble();

                                brinquedos.get(posicao).tipo = tipo;
                                brinquedos.get(posicao).preco = preco;
                                System.out.println(" Modificações aceitas.");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println(" Escolha o id do item que deseja modificar entre os itens abaixo");
                        listarCategoria(3);
                        int idDoItem = scanner.nextInt();

                        int posicao = 0;
                        for(Filme filme: filmes){
                            if(filme.getId() == idDoItem){
                                System.out.println(" Agora preencha com os dados necessários:  ");
                                System.out.println(" Nome: ");
                                scanner.nextLine();
                                String nome = scanner.nextLine();
                                System.out.println(" Preço:  ");
                                double preco = scanner.nextDouble();
                                System.out.println(" Diretor:  ");
                                scanner.nextLine();
                                String diretor = scanner.nextLine();
                                System.out.println(" Gênero:  ");
                                String genero = scanner.nextLine();
                                System.out.println(" Produtor:  ");
                                String produtor = scanner.nextLine();
                                System.out.println(" Estudio:  ");
                                String estudio = scanner.nextLine();
                                filmes.get(idDoItem).nome = nome;
                                filmes.get(idDoItem).preco = preco;
                                filmes.get(idDoItem).diretor = diretor;
                                filmes.get(idDoItem).genero = genero;
                                filmes.get(idDoItem).produtor = produtor;
                                filmes.get(idDoItem).estudio = estudio;
                                System.out.println(" Modificações aceitas.");
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println(" Escolha o id do item que deseja modificar entre os itens abaixo");
                        listarCategoria(4);
                        int idDoItem = scanner.nextInt();

                        int posicao = 0;
                        for(Jogo jogo: jogos) {
                            if (jogo.getId() == idDoItem) {
                                System.out.println(" Agora preencha com os dados necessários:  ");
                                System.out.println(" Nome: ");
                                scanner.nextLine();
                                String nome = scanner.nextLine();
                                System.out.println(" Preço:  ");
                                double preco = scanner.nextDouble();
                                System.out.println(" Distribuidora:  ");
                                scanner.nextLine();
                                String distribuidora = scanner.nextLine();
                                System.out.println(" Gênero:  ");

                                String genero = scanner.nextLine();
                                System.out.println(" Estudio:  ");
                                scanner.nextLine();
                                String estudio = scanner.nextLine();
                                jogos.get(posicao).nome = nome;
                                jogos.get(posicao).preco = preco;
                                jogos.get(posicao).distribuidora = distribuidora;
                                jogos.get(posicao).genero = genero;
                                jogos.get(posicao).estudio = estudio;
                                System.out.println(" Modificações aceitas.");
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println(" Escolha o id do item que deseja modificar entre os itens abaixo");
                        listarCategoria(4);
                        int idDoItem = scanner.nextInt();

                        int posicao = 0;
                        for(Livro livro: livros) {
                            if (livro.getId() == idDoItem) {
                                System.out.println(" Agora preencha com os dados necessários:  ");
                                System.out.println(" Nome: ");
                                scanner.nextLine();
                                String nome = scanner.nextLine();
                                System.out.println(" Preço:  ");
                                double preco = scanner.nextDouble();
                                System.out.println(" Escritor:  ");
                                scanner.nextLine();
                                String escritor = scanner.nextLine();
                                System.out.println(" Gênero:  ");
                                String genero = scanner.nextLine();
                                System.out.println(" Editora:  ");
                                String editora = scanner.nextLine();
                                livros.get(posicao).nome = nome;
                                livros.get(posicao).preco = preco;
                                livros.get(posicao).escritor = escritor;
                                livros.get(posicao).genero = genero;
                                livros.get(posicao).editora = editora;
                                System.out.println(" Modificações aceitas.");
                            }
                        }
                    }
                    default -> {
                        sair = true;
                    }
                }
            } catch (IndexOutOfBoundsException ex){
                System.out.println("Id não encontrado");
                sair = true;
            } catch (InputMismatchException ex1){
                System.out.println("Id inválido");
                break;
            }
        }


    }

    public static void deletar() {
        System.out.println("");
        System.out.println("");
        boolean sair = false;
        while (sair == false) {
            System.out.println(" Escolha o número da categoria de item que deseja deletar ");
            System.out.println(" 1 - Album ");
            System.out.println(" 2 - Brinquedo ");
            System.out.println(" 3 - Filme ");
            System.out.println(" 4 - Jogo ");
            System.out.println(" 5 - livro ");
            System.out.println(" 6 - Sair ");
            System.out.println(" ID:  ");
            int escolha = scanner.nextInt();

            try{
                switch (escolha) {
                    case 1 -> {
                        System.out.println(" Escolha o id do item que deseja deletar");
                        listarCategoria(1);
                        int idDoItem = scanner.nextInt();
                        int posicao = 0;
                        for(Album album: albuns){
                            if(album.getId() == idDoItem){
                                posicao = albuns.indexOf(album);
                            }
                        }
                        albuns.remove(posicao);
                        System.out.println(" Item deletado.");
                    }
                    case 2 -> {
                        System.out.println(" Escolha o id do item que deseja deletar");
                        listarCategoria(2);
                        int idDoItem = scanner.nextInt();
                        int posicao = 0;
                        for(Brinquedo brinquedo: brinquedos){
                            if(brinquedo.getId() == idDoItem){
                                posicao = brinquedos.indexOf(brinquedo);
                            }
                        }
                        brinquedos.remove(posicao);
                        System.out.println(" Item deletado.");
                    }
                    case 3 -> {
                        System.out.println(" Escolha o id do item que deseja deletar");
                        listarCategoria(3);
                        int idDoItem = scanner.nextInt();

                        int posicao = 0;
                        for(Filme filme: filmes){
                            if(filme.getId() == idDoItem){
                                posicao = filmes.indexOf(filme);
                            }
                        }
                        filmes.remove(posicao);
                        System.out.println(" Item deletado.");
                    }
                    case 4 -> {
                        System.out.println(" Escolha o id do item que deseja deletar");
                        listarCategoria(4);
                        int idDoItem = scanner.nextInt();
                        int posicao = 0;
                        for(Jogo jogo: jogos){
                            if(jogo.getId() == idDoItem){
                                posicao = jogos.indexOf(jogo);
                            }
                        }
                        jogos.remove(posicao);
                        System.out.println(" Item deletado.");
                    }
                    case 5 -> {
                        System.out.println(" Escolha o id do item que deseja deletar");
                        listarCategoria(5);
                        int idDoItem = scanner.nextInt();
                        int posicao = 0;
                        for(Livro livro: livros){
                            if(livro.getId() == idDoItem){
                                posicao = livros.indexOf(livro);
                            }
                        }
                        livros.remove(posicao);
                        System.out.println(" Item deletado.");
                    }
                    case 6 -> {
                        System.out.println("Saindo");
                        sair = true;
                    }
                }
            } catch (IndexOutOfBoundsException ex){
                System.out.println("Id não encontrado");
            }

        }
    }
}
