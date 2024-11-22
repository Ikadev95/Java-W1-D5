package it.epicode.extra;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ElementoMultimediale> elementi= new ArrayList<ElementoMultimediale>();

        String el;
        do {
            System.out.println("Che tipo di elemento vuoi inserire? (AUDIO, VIDEO, IMMAGINE, TERMINA):");
            el = scanner.nextLine().toUpperCase();

            Tipo tipo = Tipo.valueOf(el);

            if (tipo == Tipo.TERMINA) {
                break;
            }

            System.out.println("Inserisci un titolo");
            String titolo = scanner.nextLine();

            int durata = 0;


            if (tipo == Tipo.VIDEO || tipo == Tipo.AUDIO) {
                System.out.println("Inserisci una durata");
                durata = scanner.nextInt();
                scanner.nextLine();
            }

            switch (tipo) {
                case AUDIO -> elementi.add(new Audio(titolo, durata));
                case VIDEO -> elementi.add(new Video(titolo, durata));
                case IMMAGINE -> elementi.add(new Immagine(titolo));
                default -> System.out.println("Tipo non valido");
            }

        } while(true);

        int elem;
        do {
            System.out.println("Quale elemento vuoi riprodurre? Inserisci un intero da 1 a "+ elementi.size() +" (per terminare inserisci 0):");
            elem = scanner.nextInt();

            if (elem >= 1 && elem <= elementi.size()) {
                elementi.get(elem - 1).esegui();
            } else if (elem == 0) {
                System.out.println("Terminato");
            } else {
                System.out.println("Non hai inserito un numero valido da 0 a" + elementi.size());
            }
        } while (elem != 0);

        scanner.close();
    }
}
