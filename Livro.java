package br.ada.aulas.loja;

public class Livro extends Item {

    String escritor;
    String editora;

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    @Override
    public void getAll(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Escritor: "+ escritor);
        System.out.println("Editora: "+ editora);
        System.out.println("Preço: R$ " + preco);
    }
}
