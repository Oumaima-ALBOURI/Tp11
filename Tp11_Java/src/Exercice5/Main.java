package Exercice5;

public class Main {

    public static void main(String[] args) {

        // 1. Créer une bibliothèque
        Library lib = new Library();

        // 2. Créer des livres
        Book b1 = new Book(
                "978-2123456803",
                "Java Avancé",
                "Auteur A"
        );

        Book b2 = new Book(
                "978-2123456804",
                "Python",
                "Auteur B"
        );

        // 3. Ajouter les livres
        lib.addBookIndexed(b1);
        lib.addBookIndexed(b2);

        // 4. Ajouter des catégories
        lib.addCategory("Informatique");
        lib.addCategory("Programmation");

        // 5. Rechercher un livre par ISBN
        System.out.println("Livre trouvé par ISBN : "
                + lib.findByIsbn("978-2123456803"));

        // 6. Emprunter un livre
        System.out.println("Premier emprunt : "
                + lib.borrowBook(b1, "Alice"));

        // 7. Essayer de réemprunter le même livre
        System.out.println("Deuxième emprunt : "
                + lib.borrowBook(b1, "Bob"));

        // 8. Restituer le livre
        lib.returnBook(b1);
        System.out.println("Livre restitué.");

        // 9. Nouvel emprunt
        System.out.println("Nouvel emprunt : "
                + lib.borrowBook(b1, "Bob"));
    }
}