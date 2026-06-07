public abstract class Animal {
    private  String especie;

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void getEspecie(){
        System.out.println(especie);
    }

    public String printEspecie(){
        return especie;
    }

    public void respirar(){
        System.out.println("O animal " + printEspecie() +" esta repirando" );
    }

    abstract void fazerSom();
}
