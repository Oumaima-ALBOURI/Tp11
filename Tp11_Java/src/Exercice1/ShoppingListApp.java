package Exercice1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {

        // 1. Création de la liste
        List<String> shoppingList = new ArrayList<>();

        // 2. Ajout des articles
        shoppingList.add("Pommes");
        shoppingList.add("Lait");
        shoppingList.add("Pain");

        // 3. Suppression d'un article
        shoppingList.remove("Lait");

        // 4. Recherche d'un article
        boolean hasApples = shoppingList.contains("Pommes");
        System.out.println("Contient des pommes ? " + hasApples);

        // 5. Affichage de la taille
        System.out.println("Taille finale de la liste : "
                + shoppingList.size());
    }
}