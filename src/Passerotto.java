class Passerotto extends Animale implements InterfacciaVolare{

    @Override
    void mangia() {
        System.out.println("Il passerotto mangia semi");
    }

    @Override
    void verso() {
        System.out.println("CIP CIP!");
    }

    @Override
    public void vola(){
        System.out.println("Sono un passerotto e sto volando...");
    };
}
