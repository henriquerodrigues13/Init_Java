public class Cachorro extends Animal implements Domesticavel{

    public Cachorro(String especie) {
        setEspecie(especie);
    }

    @Override
    public void fazerSom(){
        System.out.println("Au fazendo som");
    }

    public boolean serAdestrador(){
        return true;
    }
}
