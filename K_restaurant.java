/*11. Restaurant Menu:
Create a program to represent a restaurant menu. Use a base class MenuItem and subclasses for
different types of items like Appetizer, MainCourse, and Dessert. Inherit attributes like name and price
and include methods to display item details.
 */

public class K_restaurant {
    public static void main(String[] args) {
        Appetizer ap1 = new Appetizer("Chilli paneer", 230.00f);
        Appetizer ap2 = new Appetizer("Paneer cutlet",260.00f);
        MainCourse mc1=new MainCourse("Kwab Paratha", 300.00f);
        MainCourse mc2=new MainCourse("chicken tikka masala", 330.00f);
        Dessert ds1 = new Dessert("Rasmalai", 45.00f);
        Dessert ds2 = new Dessert("Kheer", 91.50f);

        System.out.println("\t\t\t *** MenuItem ***\n\n");
        System.out.println("\t --- Appetizer ---");
        ap1.view();
        ap2.view();
        System.out.println("\t --- MainCource ---");
        mc1.view();
        mc2.view();
        System.out.println("\t --- Dessert ---");
        ds1.view();
        ds2.view();
        
    }
}

class MenuItem{
    float price;
    String item;
    MenuItem(String i,float rat)
    {
        item=i;
        price=rat;

    }

    void view()
    {
        System.out.println("Item : "+item);
        System.out.println("Price : "+price+"\n");
    }
}
class Appetizer extends MenuItem{
    Appetizer(String item,float price)
    {
        super(item,price);
    }
}

class MainCourse extends MenuItem{
    MainCourse(String item,float price)
    {
        super(item,price);
    }
}

class Dessert extends MenuItem{
    Dessert(String item,float price)
    {
        super(item,price);
    }
}