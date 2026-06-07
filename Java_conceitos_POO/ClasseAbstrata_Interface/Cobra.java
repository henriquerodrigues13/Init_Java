public class Cobra extends Animal implements Domesticavel{

    public Cobra(String especie){
        setEspecie(especie);
    }

    @Override
    public void fazerSom(){
        System.out.println("shhhh shhhh");
    }

    public boolean serAdestrador(){
        return false;
    }
}
