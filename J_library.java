/*0. Library Book Catalog:
Create a program that models a library's book catalog. Define a Book class with attributes like title,
author, and ISBN. Implement constructors to initialize book details.
 */

public class J_library {
    String title,author,ISBN;
    J_library()
    {
        System.out.println(" Enter book title,Author , ISBN  respectively \n");
        {
            
        }
    }
    void view()
    {
        System.out.println("Title :"+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+ISBN);
    }
}
