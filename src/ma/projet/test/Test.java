/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ma.projet.test;
import ma.projet.beans.Client;
import service.Service;

public class Test {
    public static void main(String[] args) {
        Service cs = new Service();
        
        // Création de 5 clients
        cs.create(new Client("Dupont", "Jean"));
        cs.create(new Client("Martin", "Sophie"));
        cs.create(new Client("Durand", "Pierre"));
        cs.create(new Client("Leroy", "Marie"));
        cs.create(new Client("Petit", "Luc"));
        
        // Afficher le client avec id=3
        System.out.println("Client id=3: " + cs.findById(3));
        
        // Supprimer le client avec id=3
        Client toDelete = cs.findById(3);
        if (toDelete != null) {
            cs.delete(toDelete);
            System.out.println("Client id=3 supprimé");
       
        }
        // Supprimer le client avec id=6


        // Modifier le client avec id=2
        Client toUpdate = cs.findById(2);
        if (toUpdate != null) {
            toUpdate.setNom("Martin Updated");
            toUpdate.setPrenom("Sophie Updated");
            cs.update(toUpdate);
            System.out.println("Client id=2 modifié");
        }
        
        // Afficher tous les clients
        cs.delete(cs.findById(6));
         System.out.println("\nListe aprés suppresion des clients:");
        System.out.println("\nListe des clients:");
        cs.findAll().forEach(System.out::println);
    }
}