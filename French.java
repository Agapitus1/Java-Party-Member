import java.util.*;
public class French
{
    private int id;
    private final String LANGUAGE = "French";
    private String name, food, colour, book;

    public French(int theId, String theName, String theFood, String theColour, String theBook)
    {
        id = theId;
        name = theName;
        food = theFood;
        colour = theColour;
        book = theBook;
    }            

    public void displayLanguage()
    {
        System.out.println("In France most people speak " + LANGUAGE);
    }

    public void displayFood()
    {
        System.out.println("My name is " + name + " and I like to eat " + food);
    }

    public void displayColour()
    {
       System.out.println(name + " favourite colour is " + colour);
    }
    
    public void displayBook(String book)
    {
        System.out.println("Please enter book title ..");
        
        Scanner in = new Scanner (System.in);
        book = in.next();
        
        System.out.println(name + " favourite book is " + book);
    }
    
}
