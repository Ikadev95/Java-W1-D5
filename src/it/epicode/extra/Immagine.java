package it.epicode.extra;

public class Immagine extends ElementoMultimediale implements Iluminoso {

    private int luminosita = 5;

    public Immagine(String titolo) {
        super(titolo);
    }

    public void show(){
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi = asterischi + "*";
        }
            System.out.println(titolo  + asterischi);

    }

    @Override
    public void esegui() {
        super.esegui();
        this.show();
    }

    @Override
    public void aumentaLuminosita(int l) {
        if (luminosita + l <= 10) {
            this.luminosita = this.luminosita + l;
        } else {
            this.luminosita = 10;
            System.out.println("La luminosità è già al massimo");
        }
    }

    @Override
    public void diminuisciLuminosita(int l) {
        if (luminosita - l >= 0) {
            this.luminosita = this.luminosita - l;
        } else {
            this.luminosita = 0;
            System.out.println("La luminosità è già a 0");
        }
    }
}
