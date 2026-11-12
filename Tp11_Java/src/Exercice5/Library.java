package Exercice5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Library {

    // 1. List : Inventaire des livres
    private List<Book> books = new ArrayList<>();

    // 2. Set : Catégories uniques
    private Set<String> categories = new HashSet<>();

    // 3. Map : Indexation par ISBN
    private Map<String, Book> isbnIndex = new HashMap<>();

    // 4. Map : Gestion des emprunts
    private Map<Book, String> loans = new HashMap<>();

    // 5. Ajouter un livre
    public void addBook(Book book) {
        books.add(book);
    }

    // 6. Ajouter une catégorie
    public void addCategory(String category) {
        categories.add(category);
    }

    // 7. Récupérer les livres
    public List<Book> getBooks() {
        return books;
    }

    // 8. Ajouter un livre avec indexation ISBN
    public void addBookIndexed(Book book) {
        books.add(book);
        isbnIndex.put(book.getIsbn(), book);
    }

    // 9. Rechercher un livre par ISBN
    public Book findByIsbn(String isbn) {
        return isbnIndex.get(isbn);
    }

    // 10. Emprunter un livre
    public boolean borrowBook(Book book, String borrower) {

        if (!loans.containsKey(book)) {
            loans.put(book, borrower);
            return true;
        }

        return false;
    }

    // 11. Restituer un livre
    public void returnBook(Book book) {
        loans.remove(book);
    }
}
