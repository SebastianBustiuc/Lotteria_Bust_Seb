/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 */
public class Estrazione extends Thread {
    // attributi
    private int[] numeriEstratti = new int[10];
    private int vincitori[];
    
    
    /**
     * 
     * Metodo costruttore
     */   
    public Estrazione() {
    // Simula l'estrazione di un numero casuale
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {    
    numero = rand.nextInt(5) + 1; // Estrae un numero tra 1 e 50
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
        if (numero == this.numero) {
            System.out.println("Giocatore: " + idGiocatore + " hai scelto il numero " + numero + " e hai vinto");
        } else {
            System.out.println("Hai perso! :( " );
        }
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
    System.out.println("INIZIO ESTRAZIONE!");
    
    // Stampa finale
    System.out.println("FINE ESTRAZIONE!");
    }
}