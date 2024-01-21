/* 9. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
value of roll_no as '2' and that of name as "John" by creating an object of the class Student */ 

import java.io.*;
class I_student {
        String name;
        int roll_no;

        void details(String name,int roll_no)
        {
            System.out.println("Name : "+name);
            System.out.println("Roll No : "+roll_no);

        }

        public static void main(String args[]) 
        {
            I_student stud = new I_student();
            stud.details("John",2);
        }
}
