public class MainDiagram {
    public static void main(String[] args) {
        Person person = new Person("Zaidan S.S", 30);
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178);
        Tabungan tabungan = new Tabungan(5000);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());

        System.out.println("Saldo awal: " + tabungan.getSaldo());
        System.out.println("Menabung 3500");
        System.out.printf("Saldo sekarang: %d%n", tabungan.simpanUang(3500));
    }
}
