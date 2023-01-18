package br.ada.aulas.loja;

public class Listas extends Cadastramento {
    public static void listarTodos() {
        System.out.println("--------------------Albuns musicais--------------------");
        for (Album albun : albuns) {
            System.out.println("Nome: " + albun.getNome());
            System.out.println("Gênero: " + albun.getGenero());
            System.out.println("Id: " + albun.getId());
            System.out.println("Preço: R$ " + albun.getPreco());
            System.out.println("Selo: " + albun.getSelo());
            System.out.println("Banda: " + albun.getBanda());
            System.out.println("--------------------");
        }
        System.out.println("--------------------Brinquedos--------------------");
        for (Brinquedo brinquedo : brinquedos) {
            System.out.println("Tipo: " + brinquedo.getTipo());
            System.out.println("Id: " + brinquedo.getId());
            System.out.println("Preço: R$ " + brinquedo.getPreco());
            System.out.println("--------------------");
        }
        System.out.println("--------------------Filmes--------------------");
        for (Filme filme : filmes) {
            System.out.println("Nome: " + filme.getNome());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Id: " + filme.getId());
            System.out.println("Preço: R$ " + filme.getPreco());
            System.out.println("Diretor: " + filme.getDiretor());
            System.out.println("Estúdio: " + filme.getEstudio());
            System.out.println("Produtor: " + filme.getProdutor());
            System.out.println("--------------------");
        }
        System.out.println("--------------------Jogos--------------------");
        for (Jogo jogo : jogos) {
            System.out.println("Nome: " + jogo.getNome());
            System.out.println("Gênero: " + jogo.getGenero());
            System.out.println("Id: " + jogo.getId());
            System.out.println("Preço: R$ " + jogo.getPreco());
            System.out.println("Distribuidora: " + jogo.getDistribuidora());
            System.out.println("Estúdio: " + jogo.getEstudio());
            System.out.println("--------------------");
        }
        System.out.println("--------------------Livros--------------------");
        for (Livro livro : livros) {
            System.out.println("Nome: " + livro.getNome());
            System.out.println("Gênero: " + livro.getGenero());
            System.out.println("Id: " + livro.getId());
            System.out.println("Preço: R$ " + livro.getPreco());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Escritor: " + livro.getEscritor());
            System.out.println("--------------------");
        }
    }

    public static void listarCategoria(int escolha) {
        System.out.println("");
        System.out.println("");
        switch (escolha) {
            case 1 -> {
                if(albuns.size() > 0){
                    System.out.println("Lista de Albuns ---------------");
                    for (Album albun : albuns) {
                        System.out.println("Nome: " + albun.getNome());
                        System.out.println("Gênero: " + albun.getGenero());
                        System.out.println("Id: " + albun.getId());
                        System.out.println("Preço: R$ " + albun.getPreco());
                        System.out.println("Selo: " + albun.getSelo());
                        System.out.println("Banda: " + albun.getBanda());
                        System.out.println("--------------------");
                    }}
                else{
                    System.out.println("Não há itens desta categoria no estoque");
                }
            }
            case 2 -> {
                if(brinquedos.size() > 0){
                    System.out.println("Lista de Brinquedos ---------------");
                    for (Brinquedo brinquedo : brinquedos) {
                        System.out.println("Tipo: " + brinquedo.getTipo());
                        System.out.println("Id: " + brinquedo.getId());
                        System.out.println("Preço: R$ " + brinquedo.getPreco());
                        System.out.println("--------------------");
                    }
                } else {
                    System.out.println("Não há itens desta categoria no estoque");
                }
            }
            case 3 -> {
                if(filmes.size() > 0){
                    System.out.println("Lista de Filmes ---------------");
                    for (Filme filme : filmes) {
                        System.out.println("Nome: " + filme.getNome());
                        System.out.println("Gênero: " + filme.getGenero());
                        System.out.println("Id: " + filme.getId());
                        System.out.println("Preço: R$ " + filme.getPreco());
                        System.out.println("Diretor: " + filme.getDiretor());
                        System.out.println("Estúdio: " + filme.getEstudio());
                        System.out.println("Produtor: " + filme.getProdutor());
                        System.out.println("--------------------");
                    }
                } else {
                    System.out.println("Não há itens desta categoria no estoque");
                }

            }
            case 4 -> {
                if(jogos.size() > 0){
                    System.out.println("Lista de Jogos ---------------");
                    for (Jogo jogo : jogos) {
                        System.out.println("Nome: " + jogo.getNome());
                        System.out.println("Gênero: " + jogo.getGenero());
                        System.out.println("Id: " + jogo.getId());
                        System.out.println("Preço: R$ " + jogo.getPreco());
                        System.out.println("Distribuidora: " + jogo.getDistribuidora());
                        System.out.println("Estúdio: " + jogo.getEstudio());
                        System.out.println("--------------------");
                    }
                } else {System.out.println("Não há itens desta categoria no estoque");}
            }
            case 5 -> {
                if(livros.size() > 0){
                    System.out.println("Lista de Livro ---------------");
                    for (Livro livro : livros) {
                        System.out.println("Nome: " + livro.getNome());
                        System.out.println("Gênero: " + livro.getGenero());
                        System.out.println("Id: " + livro.getId());
                        System.out.println("Preço: R$ " + livro.getPreco());
                        System.out.println("Editora: " + livro.getEditora());
                        System.out.println("Escritor: " + livro.getEscritor());
                        System.out.println("--------------------");
                    }
                } else {System.out.println("Não há itens desta categoria no estoque");}
            }
            case 6 -> {
                System.out.println("Saindo");
                break;
            }
            default -> {
                System.out.println("Opção inválida....Saindo");
                break;
            }
        }
    }


}
