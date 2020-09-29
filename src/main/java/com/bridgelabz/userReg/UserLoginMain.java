package com.bridgelabz.userReg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLoginMain {
    public static boolean FirstNameValidator(String name)
    {
        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);
        if(matcher.find())
            return true;
        else
            return false;
    }
    public static boolean LastNameValidator(String name)
    {
        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);
        if(matcher.find())
            return true;
        else
            return false;
    }
    public static boolean PhoneNumberValidator(String number)
    {
        String y="^\\d{2}(\\s{1}\\d{10})$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(number);
        if(matcher.find())
            return true;
        else
            return false;
    }








}
