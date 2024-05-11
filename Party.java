import java.util.*;
public class Party
{
    private Australian ausRick;
    private Australian ausTim;
    private French freFleur;
    private Italian itaGiani;

    public Party()
    {
        ausRick = new Australian("Rick", "English","Oranges", "White");
        ausTim = new Australian("Tim", "Indonesian", "Apples", "Black");
        freFleur = new French( 145569, "Fleur", "Durian", "Red", "");
        itaGiani = new Italian(288377, "Giani", "Melon", "Blue", "");   
        allDisplayLanguage();
        allDisplayFood();
        allDisplayColour();
        allDisplayBook();
    }

    public void allDisplayLanguage()
    {
        ausRick.displayLanguage();
        ausTim.displayLanguage();
        freFleur.displayLanguage();
        itaGiani.displayLanguage();
    }       

    public void allDisplayFood()
    {
        ausRick.displayFood();
        ausTim.displayFood();
        freFleur.displayFood();
        itaGiani.displayFood();
    }

    public void allDisplayColour()
    {
        ausRick.displayColour();
        ausTim.displayColour();
        freFleur.displayColour();
        itaGiani.displayColour();
    }

    public void allDisplayBook()
    {
        ausRick.displayBook("");
        ausTim.displayBook("");
        freFleur.displayBook("");
        itaGiani.displayBook("");
    }
}
