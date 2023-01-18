package br.ada.aulas.loja;

import br.ada.aulas.sala.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Album extends Item{
    String banda;
    String selo;

    public List<Album> album = new ArrayList<>();

    public List<Album> getAlbum() {
        return album;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    @Override
    public void getAll(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Id: " + id);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Selo: " + selo);
        System.out.println("Banda: " + banda);
    }
}
