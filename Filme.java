package br.ada.aulas.loja;

public class Filme extends Item{
    String estudio;
    String produtor;
    String diretor;

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void getAll(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Diretor: "+ diretor);
        System.out.println("Produtor: "+ produtor);
        System.out.println("Estudio: "+ estudio);
        System.out.println("Preço: R$ " + preco);
    }
}
