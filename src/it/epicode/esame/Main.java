package it.epicode.esame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Che tipo di elemento multimediale vuoi inserire? 1 per audio, 2 per video, 3 per immagine");
            int el = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci un titolo");
            String titolo = scanner.nextLine();

            int durata = 0;
            if (el == 1 || el == 2) {
                System.out.println("Inserisci una durata");
                durata = scanner.nextInt();
                scanner.nextLine();
            }

            if (el == 1) {
                elementi[i] = new Audio(titolo, durata);
            } else if (el == 2) {
                elementi[i] = new Video(titolo, durata);
            } else if (el == 3) {
                elementi[i] = new Immagine(titolo);
            } else {
                System.out.println("Tipo non valido");
                i--;
            }
        }

        int elem;
        do {
            System.out.println("Quale elemento vuoi riprodurre? Inserisci un intero da 1 a 5 (per terminare inserisci 0):");
            elem = scanner.nextInt();

            if (elem >= 1 && elem <= 5) {
                elementi[elem - 1].esegui();
            } else if (elem == 0) {
                System.out.println("Terminato");
            } else {
                System.out.println("Non hai inserito un numero valido da 0 a 5");
            }
        } while (elem != 0);

        scanner.close();
    }
}
