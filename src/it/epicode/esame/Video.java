package it.epicode.esame;

public class Video extends ElementoMultimediale implements IRiproducibile, Iluminoso{

    private int volume = 5;
    private int durata;
    private int luminosita = 5;

    public Video(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void esegui() {
        super.esegui();
        this.play();
    }

    @Override
    public void play() {

        String punti = "";
        for (int i = 0; i < volume; i++) {
            punti = punti + "!";
        }

        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi = asterischi + "*";
        }

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + punti + asterischi);
        }
    }

    public void abbassaVolume(int v) {
        if (volume - v >= 0) {
            this.volume = this.volume - v;
        } else {
            this.volume = 0;
            System.out.println("Il volume è già al minimo");
        }
    }


    @Override
    public void alzaVolume(int v) {
        if (volume + v <= 10) {
            this.volume = this.volume + v;
        } else {
            this.volume = 10;
            System.out.println("Il volume è già al massimo");
        }
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
