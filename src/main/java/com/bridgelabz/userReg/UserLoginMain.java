package com.bridgelabz.userReg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLoginMain {
    public static boolean FirstNameValidator(String name)
    {
        String y="^[A-Z]{1}(?=.*[a-z]).{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid first Name");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid first name");

        }
        return found;

    }
}
