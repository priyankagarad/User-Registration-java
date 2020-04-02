package com.UserRegistration;
import java.util.Scanner;
public class UserRegistration
{
    public static void main(String args[])
    {
        System.out.println("--Welcome to user registration --");
        //name pattern
        String NAME_PATTERN="^[A-Z][a-z]{2,}$";
        //create object of scanner
        Scanner sc=new Scanner(System.in);
        //take input from user
        System.out.println("enter string");
        String str=sc.nextLine();
        //check name pattern and input name matches
        if(str.matches(NAME_PATTERN))
        {
            System.out.println("valid name");
        }
        else
        {
            System.out.println("not valid name");
        }

    }
}
