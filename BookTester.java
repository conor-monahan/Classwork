
public class BookTester
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Hello", "Conor", 200);
        System.out.println(b1.getTitle());
        b1.setTitle("Hi");
        System.out.println(b1.getTitle());
}
