import java.util.*;

class InvalidDayException extends Exception
{
	InvalidDayException()
    {super();}

    public String toString()
    {return "InvalidDayException";}
}

class InvalidMonthException extends Exception
{
	InvalidMonthException()
    {super();}

    public String toString()
    {return "InvalidMonthException";}
}

class CurrentDate
{
    int day, month, year;

    void createDate()throws InvalidDayException, InvalidMonthException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day.");
        day=sc.nextInt();
        System.out.println("Enter month.");
        month=sc.nextInt();
        System.out.println("Enter year.");
        year=sc.nextInt();
        
        if(day<1 || day>31)
        throw new InvalidDayException();
        else if(month<1 || month>12)
        throw new InvalidMonthException();
        else
        System.out.println("Current Date: "+day+"/"+month+"/"+year);
    }
}

class DateDemo
{
    public static void main(String[] args) {
        CurrentDate cd=new CurrentDate();
        try{
            cd.createDate();
        }
        catch(InvalidDayException | InvalidMonthException ex){
        System.out.println(ex);
        }
    }
}