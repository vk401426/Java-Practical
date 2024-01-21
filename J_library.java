/*0. Library Book Catalog:
Create a program that models a library's book catalog. Define a Book class with attributes like title,
author, and ISBN. Implement constructors to initialize book details.
 */

class book {
    String title,author,ISBN;
    book(String t,String a,String i,int n)
    {
        title=t;
        author=a;
        ISBN=i;
        System.out.println(" Book initialised :  B"+n);
    }
    void view()
    {
        System.out.println("Title :"+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+ISBN);
        System.out.println("\n--------------------------------");
        
    }
}

class J_library{
    public static void main (String []args) 
    {
        book b1 =new book("let us c", "Yashwant Kanetkar", "KB91473",1);
        book b2 = new book("Mathematics ","R .S Agarwal","HG72382",2);
        book b3 = new book("Calculus ","R.D Sharma","JS5298382",3);
        book b4 = new book("Biology ","J K Hassan","US26382",4);

        System.out.println("\n\n**** Book Catelog ****");
        b1.view();
        b2.view();
        b3.view();
        b4.view();
    }
}