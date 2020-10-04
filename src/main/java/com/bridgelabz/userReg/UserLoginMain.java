package com.bridgelabz.userReg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface IValidatorFunction{
    boolean validate(String userInfo) throws UserLoginMainException;
}

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

    IValidatorFunction firstname = (userInfo) -> {
        checkForNullEmptyCase(userInfo);
        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(userInfo);

        if (!matcher.find()) {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,"Invalid First Name");

        }
        return true;
    };

    IValidatorFunction lastname = (userInfo) -> {
        checkForNullEmptyCase(userInfo);
        String y="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(userInfo);
        if (!matcher.find()) {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,"Invalid Last Name");

        }
        return true;

    };

    IValidatorFunction phonenumber = (userInfo) -> {
        checkForNullEmptyCase(userInfo);
        String y="^\\d{2}(\\s{1}\\d{10})$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(userInfo);
        if(!matcher.find())
        {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_NUMBER,"Invalid number");
        }
        return true;
    };

    IValidatorFunction password = (userInfo) -> {
       checkForNullEmptyCase(userInfo);

        String y="^(?=.*[A-Z])(?=.*\\d)(?=.*[^\\dA-Z]).{8,}$";
        String y1="^[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$";
        Pattern pattern = Pattern.compile(y);
        Pattern pattern1 = Pattern.compile(y1);
        Matcher matcher =  pattern.matcher(userInfo);
        Matcher matcher1 =  pattern1.matcher(userInfo);
        if(!(matcher.find()&&matcher1.find()))
        {
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_PASS,"Invalid passwd");
        }
        return true;

    };

    IValidatorFunction email = (userInfo) -> {
        checkForNullEmptyCase(userInfo);
        String y = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";
        Pattern pattern = Pattern.compile(y);
        Matcher matcher =  pattern.matcher(userInfo);


        if(!matcher.find()){
            throw new UserLoginMainException(UserLoginMainException.ExceptionType.INVALID_EMAIL,"Invalid email");
        }
        return true;
    };


}
