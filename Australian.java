import java.util.*;
public class Australian
{
    private int id;
    private String language;
    private String name;
    private String food;
    private String colour, book;

    public Australian(String theName, String theLanguage, String theFood, String theColour)
    {
        language = theLanguage;
        name = theName;
        food = theFood;
        colour = theColour;
    }
    public Australian(String theBook)
    {
        book = theBook;
    }

    public void displayLanguage()
    {
        System.out.println("An Australian speaks " + language);
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
