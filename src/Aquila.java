class Aquila extends Animale implements InterfacciaVolare{

    @Override
    void mangia() {
        System.out.println("L'aquila mangia carne");
    }

    @Override
    void verso() {
        System.out.println("UHUUU!");
    }

    @Override
    public void vola(){
        System.out.println("Sono un aquila e sto volando...");
    };
}
