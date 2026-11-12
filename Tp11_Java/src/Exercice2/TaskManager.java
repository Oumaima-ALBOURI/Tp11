package Exercice2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static void main(String[] args) {

        // 1. Création de la liste
        List<Task> tasks = new ArrayList<>();

        // 2. Ajout des tâches
        tasks.add(new Task("Apprendre Java Collections"));
        tasks.add(new Task("Faire les courses"));

        // 3. Marquer la première tâche comme terminée
        tasks.get(0).setCompleted(true);

        // 4. Afficher les tâches
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}
