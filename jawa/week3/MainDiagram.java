public class MainDiagram {
    public static void main(String[] args) {
        // Create an object of class Person
        Person person = new Person("John Doe", 30);
        // Create an object of class Book
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178);

        Tabungan tabungan = new Tabungan(5000);
        // Print the name and age of the person
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        // Print the title, author, and number of pages of the book
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());

        System.out.println("Saldo awal: " + tabungan.getSaldo());
        System.out.println("Menabung 3500");
        System.out.println("Saldo sekarang: " + tabungan.menabung(3500));
    }
}
