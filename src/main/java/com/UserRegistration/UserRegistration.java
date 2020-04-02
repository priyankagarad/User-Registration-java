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
        if(email.matches(Mail_Pattern))
        {
            System.out.println("valid email");
        }
        else
        {
            System.out.println("not valid email");
        }
    }

    //method created for checking mobile number
    public static void checkMobileNumberPattern(String number,String mobileNumberPattern)
    {
        if(number.matches(mobileNumberPattern))
        {
            System.out.println("valid mobile number");
        }
        else
        {
            System.out.println("not valid mobile number");
        }
    }

    //method created for checking password
    public static void checkPasswordPattern(String enterpassword,String pattern)
    {
        if(enterpassword.matches(pattern))
        {
            System.out.println("valid password");
        }
        else
        {
            System.out.println("not valid password");
        }
    }

    public static void main(String args[])
    {
        System.out.println("--Welcome to user registration --");

        //pattern
        String Last_NAME_PATTERN="^[A-Z][a-z]{2,}$";
        String EMAIL_PATTERN="^[a-zA-Z]{1,}([.]?[a-zA-Z]{1,})?[@]{1}[a-zA-Z]{1,}[.]{1}[a-z]{2}([.]?[a-z]{2})?$";
        String MOBILE_PATTERN="^[0-9]{1,3}[' '][0-9]{10}$";
        String PASSWORD_EIGHT_CHARACTER_="^[a-z]{8,}";
        String PASSWORD_AT_LIST_ONE_UPPERCASE_LETTER="^[a-zA-Z0-9]*(.*[A-Z].*{1}+)[a-zA-Z0-9]*{7,40}$";
        String ONE_NUMERIC_NUMBER="^[a-zA-Z0-9]*(.*[A-Z].*{1}+)(.*[0-9].*{1}+)[a-zA-Z0-9]*{7,40}$";

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
        checkMailPattern(email_id,EMAIL_PATTERN);

        //take input from user
        System.out.println("enter mobile number");
        String mobileNumber=sc.nextLine();
        //call method
        checkMobileNumberPattern(mobileNumber,MOBILE_PATTERN);

        //take input from user
        System.out.println("enter password");
        String password=sc.nextLine();
        //call method for checking password pattern
        checkPasswordPattern(password,PASSWORD_EIGHT_CHARACTER_);
        checkPasswordPattern(password,PASSWORD_AT_LIST_ONE_UPPERCASE_LETTER);
        checkPasswordPattern(password,ONE_NUMERIC_NUMBER);
    }
}
