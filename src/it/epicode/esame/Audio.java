package it.epicode.esame;

public class Audio extends ElementoMultimediale implements IRiproducibile{

    private int volume = 5;
    private int durata;

    public Audio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }

    @Override
    public void play() {
        String punti = "";
        for (int i = 0; i < volume; i++) {
            punti = punti + "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + punti);
        }
    }

    @Override
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
    public void esegui() {
        super.esegui();
        this.play();
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }
}
