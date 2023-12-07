package org.lessons.java.list;

import java.util.HashSet;
import java.util.Scanner;

public class WishList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creo un ArrayList per la lista di reagli
        HashSet<String> presents = new HashSet<>();

        // Imposto una flag per uscire dal while
        boolean stop = false;


        while(!stop) {

            // Chiedo all'utente se vuole aggiungere un nuovo regalo
            System.out.print("Vuoi aggiungere un nuovo regalo? (si/no)");
            String answer = scanner.nextLine().toLowerCase();

            switch (answer) {
                case "si":
                    // Inserisco il nome del regalo
                    System.out.print("Che regalo vuoi?: ");
                    String present = scanner.nextLine();

                    // Stampo la dimensione dell'aray
                    System.out.println(presents.size());

                    boolean added = presents.add(present);
                    if(!added){
                        System.out.println("Regalo già presente nella lista");
                    }
                    break;
                case "no":
                    // Esco dal ciclo
                    System.out.println("Fine.");
                    stop = true;
                    break;
                default:
                    // Risposta non valida
                    System.out.println("Risposta non valida");
                    break;
            }
        }

        // Stampo la lista
        System.out.println("Ecco la tua lista. Buon Natale!");
        int i = 0;
        for (String element : presents) {
            i++;
            System.out.println(i + ")" + " " + element);
        }

        scanner.close();
    }
}
