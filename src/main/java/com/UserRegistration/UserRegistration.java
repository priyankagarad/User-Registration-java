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

    //method created for checking mail_id valid or not
    public static void checkMailPattern(String email,String Mail_Pattern)
    {
        //check name pattern and input name matches
        if(email.matches(Mail_Pattern))
        {
            System.out.println("valid email");
        }
        else
        {
            System.out.println("not valid email");
        }
    }

    public static void main(String args[])
    {
        System.out.println("--Welcome to user registration --");

        //pattern
        String Last_NAME_PATTERN="^[A-Z][a-z]{2,}$";
        String EMail_Pattern="^[a-zA-Z]{1,}([.]?[a-zA-Z]{1,})?[@]{1}[a-zA-Z]{1,}[.]{1}[a-z]{2}([.]?[a-z]{2})?$";

        //create object of scanner
        Scanner sc=new Scanner(System.in);

        //take input from user
        System.out.println("enter string");
        String str=sc.nextLine();

        //call the method
        checkLastNamePattern(str,Last_NAME_PATTERN);

        //take input from user
        System.out.println("enter email id");
        String email_id=sc.nextLine();

        //call method
        checkMailPattern(email_id,EMail_Pattern);
    }
}
