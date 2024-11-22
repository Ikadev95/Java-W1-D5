package it.epicode.esame;

public class ElementoMultimediale {
    protected String titolo;

    public void esegui() {}

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getNome() {
        return titolo;
    }
}
