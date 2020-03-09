package pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Мастер и Маргарита", 440);
        Book two = new Book("Война и мир", 1225);
        Book three = new Book("Clean code", 464);
        Book four = new Book("Изучаем Java", 720);

        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;

        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            System.out.println(bo.getNameBook() + " has " + bo.getNumberOfPages() + " pages");
        }

        books[0] = four;
        books[3] = one;

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            System.out.println(bo.getNameBook() + " has " + bo.getNumberOfPages() + " pages");
        }

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            if (books[i].getNameBook().equals("Clean code")){
                System.out.println(bo.getNameBook() + " has " + bo.getNumberOfPages() + " pages");
            }
        }

    }
}
