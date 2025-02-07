public class Main {
    
     // Metodo per far volare un animale
     public static void faiVolare(InterfacciaVolare animale) {
        animale.vola();
    }

    // Metodo per far nuotare un animale
    public static void faiNuotare(InterfacciaNuotare animale) {
        animale.nuota();
    }
    public static void main(String[] args) {
        
        Animale cane = new Cane();
        cane.dormi();
        cane.mangia();
        cane.verso();
    

        Animale passerotto = new Passerotto();
        passerotto.dormi();
        passerotto.mangia();
        passerotto.verso();
        if (passerotto instanceof InterfacciaVolare) {
            faiVolare((InterfacciaVolare) passerotto);
        }

        Animale aquila = new Aquila();
        aquila.dormi();
        aquila.mangia();
        aquila.verso();
        if (aquila instanceof InterfacciaVolare) {
            faiVolare((InterfacciaVolare) aquila);
        }

        Animale delfino = new Delfino();
        delfino.dormi();
        delfino.mangia();
        delfino.verso();
        if (delfino instanceof InterfacciaNuotare) {
            faiNuotare((InterfacciaNuotare) delfino);
        }
    }
}
