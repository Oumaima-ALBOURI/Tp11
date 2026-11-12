package Execice3;

import java.util.*;

public class SetComparison {

    public static void main(String[] args) {

        // 1. HashSet
        Set<String> hashSet = new HashSet<>(
            Arrays.asList("Zèbre", "Ananas", "Banane")
        );

        // 2. LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>(
            Arrays.asList("Zèbre", "Ananas", "Banane")
        );

        // 3. TreeSet
        Set<String> treeSet = new TreeSet<>(
            Arrays.asList("Zèbre", "Ananas", "Banane")
        );

        // 4. Affichage
        System.out.println("HashSet (non ordonné) : " + hashSet);

        System.out.println("LinkedHashSet (ordre d'insertion) : "
                + linkedHashSet);

        System.out.println("TreeSet (trié alphabétiquement) : "
                + treeSet);
    }
}