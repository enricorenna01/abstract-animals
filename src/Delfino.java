class Delfino extends Animale implements InterfacciaNuotare{

    @Override
    void mangia() {
        System.out.println("Il delfino mangia pesce");
    }

    @Override
    void verso() {
        System.out.println("EE-EE!");
    }
    
    @Override
    public void nuota(){
        System.out.println("Sono un delfino e sto nuotando...");
    };
}
