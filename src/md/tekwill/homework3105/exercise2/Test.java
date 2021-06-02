package md.tekwill.homework3105.exercise2;

public class Test {
    public static void main(String[] args) {
        Author ion =new Author("Ion Creanga","ion.creanga@gmail.com",'m');
        Book adventure=new Book("Aminitiri din copilarie",ion, 10.00, 2 );
        System.out.println(adventure);
    }
}
