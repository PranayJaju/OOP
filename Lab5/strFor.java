import java.util.*;
class strFor
{
    public static void main(String args[])
    {
        String input="", output="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        input=sc.nextLine();
        int i=input.length();
        while(i-3>0)
        {
            if(i==input.length())
            output=input.substring(i-3, i);
            else
            output=input.substring(i-3, i)+","+output;
            i-=3;
        }
        if(i>0)
        {
            if(output=="")
            output=input;
            else
            output=input.substring(0, i)+","+output;
        }
        //output=input.substring(0, i)+","+output;
        System.out.println("Number is: "+output);
        sc.close();
    }
}