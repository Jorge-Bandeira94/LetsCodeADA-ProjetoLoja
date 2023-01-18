package br.ada.aulas.loja;

public abstract class Item {
    String nome;
    int id;
    double preco;
    String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void getAll(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Id: " + id);
        System.out.println("Preço: R$ " + preco);
    }
}
