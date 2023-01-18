package br.ada.aulas.loja;

public class Brinquedo {
    int id;
    String tipo;
    double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void getAll(){
        System.out.println("id: " + id );
        System.out.println("Tipo: " + tipo );
        System.out.println("Preço: " + preco );
    }

}
