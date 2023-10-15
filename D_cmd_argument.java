import java.io.*;


class D_cmd_argument {

    public static void main(String args[]) throws IOException
    {
        DataInputStream temp = new DataInputStream(System.in);
        int sub=Integer.parseInt(args[0]);
        int sub2=Integer.parseInt(args[1]);
        int sub3=Integer.parseInt(args[2]);
        String grade;
        
        int total=sub+sub2+sub3;
        float average =(float) total/3;
        System.out.println("Enter your name : ");
        String name=temp.readLine();

        if(average>=90)
            grade="A+";
        else if(average>=80)
            grade="A";
        else if(average>=70)
            grade="B";
        else if(average>=60)
            grade="C";
        else if(average>=50)
            grade="D";
        else 
            grade="Poor";

            
        
        //output 

        System.out.println("Hi '_'  "+ name );
        System.out.println("\n\n *** Result ***");
        System.out.println("\n Total marks : "+total);
        System.out.println(" Percentage  : "+average);
        System.out.println(" Grade       : "+grade);
        ;
    }
}
 