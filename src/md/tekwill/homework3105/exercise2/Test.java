package md.tekwill.homework3105.exercise2;

import java.util.ArrayList;
import java.util.function.Predicate;

public abstract class Test implements InterfaceBook, PriceIncreasing{
    public static void main(String[] args) {
        Author ion = new Author("Ion Creanga", "ion.creanga@gmail.com", 'm');
        Book adventure = new Book("Aminitiri din copilarie", ion, 10.00, 2);
        //System.out.println(adventure);
        Author author = new Author("Stephen King");


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("IT", author));
        books.add(new Book("The Shining", author));
        books.add(new Book("Programming", author));
        books.add(new Book("Harap Alb", ion));

        filter(books, ex ->!ex.equals(author));
        books.removeIf(ex->!ex.equals(author));

        System.out.println(books);

    }

    private static void filter(ArrayList<Book> books, Predicate<Book> validator) {
        for (Book book : books) {
            if (validator.test(book)) {
                System.out.println(book);
            }
        }
    }

    public void increase(ArrayList<Book> books, PriceIncreasing<Book> validator){
        Book book;
        for(int i=0;i<books.size();i++){
          validator.increase(books.get(i));
        }
    }

    @Override
    public boolean test(Book book, Author author) {
        return false;
    }
}