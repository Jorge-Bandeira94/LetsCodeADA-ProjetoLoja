package br.ada.aulas.loja;

import java.util.*;


public class Cadastramento {

    static List<Album> albuns = new ArrayList<>();
    static List<Filme> filmes = new ArrayList<>();
    static List<Brinquedo> brinquedos = new ArrayList<>();
    static List<Jogo> jogos = new ArrayList<>();
    static List<Livro> livros = new ArrayList<>();
    static boolean continuacao = true;
    static Random random = new Random();

    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //userLocale para o scanner double em preço aceitar nuemro com ponto ao invés de virgula.

    public static int fachada() {
        System.out.println("----- Menu do Administrador -----");
        System.out.println(" Bem vindo à loja, escolha o que deseja fazer: ");
        System.out.println(" 1 - Cadastrar item ");
        System.out.println(" 2 - Ver itens ");
        System.out.println(" 3 - Ver itens de categoria selecionada ");
        System.out.println(" 4 - Alterar item cadastrado ");
        System.out.println(" 5 - Remover item do sistema ");
        System.out.println(" 6 - Sair ");
        System.out.println("----- Menu do Cliente ----- ");
        System.out.println(" 7 - Comprar produtos ");
        System.out.println(" 6 - Sair ");


        int escolha = scanner.nextInt();
        return escolha;
    }

    public static void cadastro() {

        System.out.println("");
        System.out.println("");
        System.out.println(" Esta é a página de cadastro de itens, escolha a categoria qual deseja cadastrar: ");
        System.out.println(" 1 - Album musical ");
        System.out.println(" 2 - Filme ");
        System.out.println(" 3 - Brinquedo ");
        System.out.println(" 4 - Jogo ");
        System.out.println(" 5 - Livro ");
        System.out.println(" 6 - Sair ");
        int escolha = scanner.nextInt();


        String continuar1 = "s";
        while(continuar1.equals("s")) {
            switch (escolha) {
                case 1 -> {
                    Album albumMusical = new Album();
                    System.out.println("Você escolheu Album Musical, preencha os dados solicitados");
                    int id = random.nextInt(1, 100);

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

                    albumMusical.setId(id);
                    albumMusical.setNome(nome);
                    albumMusical.setPreco(preco);
                    albumMusical.setBanda(banda);
                    albumMusical.setGenero(genero);
                    albumMusical.setSelo(selo);

                    albuns.add(albumMusical);

                    System.out.println(" Deseja continua cadastrando Albuns? (s/n) ");
                    continuar1 = scanner.nextLine().toLowerCase();


                }
                case 2 -> {
                    Filme movie = new Filme();
                    System.out.println("Você escolheu Filme, preencha os dados solicitados");
                    int id = random.nextInt(101, 200);

                    System.out.println(" Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println(" Preço:  ");
                    double preco = scanner.nextDouble();
                    System.out.println(" Estúdio:  ");
                    scanner.nextLine();
                    String estudio = scanner.nextLine();
                    System.out.println(" Diretor:  ");

                    String diretor = scanner.nextLine();
                    System.out.println(" Gênero:  ");

                    String genero = scanner.nextLine();
                    System.out.println(" Produtor:  ");
                    String produtor = scanner.nextLine();

                    movie.setNome(nome);
                    movie.setPreco(preco);
                    movie.setId(id);
                    movie.setGenero(genero);
                    movie.setDiretor(diretor);
                    movie.setProdutor(produtor);
                    movie.setEstudio(estudio);

                    filmes.add(movie);

                    System.out.println(" Deseja continua cadastrando filmes? (s/n) ");
                    continuar1 = scanner.nextLine().toLowerCase();

                }
                case 3 -> {
                    Brinquedo brinquedo = new Brinquedo();
                    System.out.println("Você escolheu brinquedo, preencha os dados solicitados");
                    int id = random.nextInt(201, 300);
                    System.out.println(" Tipo: ");
                    scanner.nextLine();
                    String tipo = scanner.nextLine();
                    System.out.println(" Preço:  ");
                    double preco = scanner.nextDouble();

                    brinquedo.setTipo(tipo);
                    brinquedo.setPreco(preco);
                    brinquedo.setId(id);

                    brinquedos.add(brinquedo);

                    System.out.println(" Deseja continua cadastrando brinquedos? (s/n) ");
                    scanner.nextLine();
                    continuar1 = scanner.nextLine().toLowerCase();


                }
                case 4 -> {
                    Jogo jogo = new Jogo();
                    System.out.println("Você escolheu Jogo, preencha os dados solicitados");
                    int id = random.nextInt(301, 400);
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
                    System.out.println(" Estúdio:  ");
                    String estudio = scanner.nextLine();

                    jogo.setId(id);
                    jogo.setNome(nome);
                    jogo.setPreco(preco);
                    jogo.setEstudio(estudio);
                    jogo.setGenero(genero);
                    jogo.setDistribuidora(distribuidora);

                    jogos.add(jogo);

                    System.out.println(" Deseja continua cadastrando jogos? (s/n) ");
                    continuar1 = scanner.nextLine().toLowerCase();


                }
                case 5 -> {
                    Livro livro = new Livro();
                    System.out.println("Você escolheu Livro, preencha os dados solicitados");
                    int id = random.nextInt(401, 500);
                    System.out.println(" Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println(" Preço:  ");
                    double preco = scanner.nextDouble();
                    System.out.println(" Escrito:  ");
                    scanner.nextLine();
                    String escritor = scanner.nextLine();
                    System.out.println(" Gênero:  ");
                    String genero = scanner.nextLine();
                    System.out.println(" Editora:  ");
                    String editora = scanner.nextLine();

                    livro.setId(id);
                    livro.setNome(nome);
                    livro.setPreco(preco);
                    livro.setEditora(editora);
                    livro.setGenero(genero);
                    livro.setEscritor(escritor);

                    livros.add(livro);

                    System.out.println(" Deseja continua cadastrando livros? (s/n) ");
                    continuar1 = scanner.nextLine().toLowerCase();


                }
                case 6 -> {
                    continuar1 = "n";
                }
                default -> {
                    System.out.println("Opção inválida. Voltando ao início   ");
                    continuar1 = "n";
                }
            }
        }

    }



}
