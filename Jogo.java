package br.ada.aulas.loja;

public class Jogo extends Item {
    String distribuidora;
    String estudio;

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public void getAll(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Distribuidora: "+ distribuidora);
        System.out.println("Estudio: "+ estudio);
        System.out.println("Preço: R$ " + preco);
    }
}
