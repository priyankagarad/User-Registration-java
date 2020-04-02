package com.UserRegistration;
import java.util.Scanner;
public class UserRegistration
{
    //method created for checking last name pattern
    public static void checkLastNamePattern(String LastName,String Pattern)
    {
        //check name pattern and input name matches
        if(LastName.matches(Pattern))
        {
            System.out.println("valid name");
        }
        else
        {
            System.out.println("not valid name");
        }
    }

    public static void main(String args[])
    {
        System.out.println("--Welcome to user registration --");

        //name pattern
        String Last_NAME_PATTERN="^[A-Z][a-z]{2,}$";

        //create object of scanner
        Scanner sc=new Scanner(System.in);

        //take input from user
        System.out.println("enter string");
        String str=sc.nextLine();

        //call the method
        checkLastNamePattern(str,Last_NAME_PATTERN);
    }
}
