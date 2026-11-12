package Exercice4;

import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {

    public static void main(String[] args) {

        // 1. Création du dictionnaire
        Map<String, String> dictionary = new HashMap<>();

        // 2. Ajouter les traductions
        dictionary.put("cat", "chat");
        dictionary.put("dog", "chien");
        dictionary.put("bird", "oiseau");

        // 3. Rechercher une traduction
        System.out.println("Traduction de 'dog' : "
                + dictionary.get("dog"));

        // 4. Parcourir toutes les entrées
        System.out.println("--- Dictionnaire complet ---");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> "
                    + entry.getValue());
        }
    }
}