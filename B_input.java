//2. WAP in Java to input your name,class,roll no. and display them

import java.lang.*;
import java.io.*;

class B_input {

    public static void main(String args[]) throws IOException {
        DataInputStream temp=new DataInputStream(System.in);
        
        String name;
        int cls,roll_no;

        System.out.print("Enter your name : ");
        name=temp.readLine();
        System.out.print("Enter your class : ");
        cls=Integer.parseInt(temp.readLine());
        System.out.print("Enter your roll no.. : ");
        roll_no=Integer.parseInt(temp.readLine());

        System.out.println("Hi !! "+name+" \n you read in class "+cls+"\n your roll no is "+roll_no);


    }
}