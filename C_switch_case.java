//3. WAP in Java to print the month name by entering month number (using switch case).

import java.lang.*;
import java.io.*;

public class C_switch_case {
    public static void main(String args[]) throws IOException 
    {
        DataInputStream temp = new DataInputStream(System.in);
        String month=" ";
        int month_no=0;
        boolean choice;

    do{
        System.out.println("Enter month number : ");
        month_no=Integer.parseInt(temp.readLine());
        switch (month_no) 
        {
            case 1:
                month = "January";
                break;

            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "may";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default :
                System.out.println("Entered wrong choice ");

        }  
        System.out.println(month);              
        System.out.println("Do you want to continue true/false");
        choice =Boolean.parseBoolean(temp.readLine());
    }while(choice ==true);
        
    
    }
}
