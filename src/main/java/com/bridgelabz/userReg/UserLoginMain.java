package com.bridgelabz.userReg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLoginMain {

    public static void checkForNullEmptyCase(String name) throws UserLoginMainException {

        try {
            if (name.length() == 0) {
                throw new UserLoginMainException(UserLoginMainException.ExceptionType.ENTERED_EMPTY, "Enter non-empty Data");
            }
        }
        catch(NullPointerException e)
        {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.ENTERED_NULL, "Enter proper Data");

        }
    }

    public static boolean FirstNameValidator(String name) throws UserLoginMainException {

        checkForNullEmptyCase(name);

        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);

        if (!matcher.find()) {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,"Invalid First Name");

        }
        return true;
    }

    public static boolean LastNameValidator(String name) throws UserLoginMainException {

        checkForNullEmptyCase(name);

        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(name);
        if (!matcher.find()) {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,"Invalid Last Name");

        }
        return true;

    }

    public static boolean PhoneNumberValidator(String number) throws UserLoginMainException {

        checkForNullEmptyCase(number);

        String y="^\\d{2}(\\s{1}\\d{10})$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(number);
        if(!matcher.find())
        {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_NUMBER,"Invalid number");
        }
        return true;

    }

    public static boolean PasswordValidator(String password) throws UserLoginMainException {

      checkForNullEmptyCase(password);

        String y="^(?=.*[A-Z])(?=.*\\d)(?=.*[^\\dA-Z]).{8,}$";
        String y1="^[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$";
        Pattern pattern = Pattern.compile(y);
        Pattern pattern1 = Pattern.compile(y1);
        Matcher matcher =  pattern.matcher(password);
        Matcher matcher1 =  pattern1.matcher(password);
        if(!(matcher.find()&&matcher1.find()))
        {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_PASS,"Invalid passwd");
        }
        return true;
    }

    public static boolean EmailValidator(String email) throws UserLoginMainException {

       checkForNullEmptyCase(email);

        String y = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(email);


        if(!matcher.find()){
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_EMAIL,"Invalid email");
        }
        return true;

    }

}
