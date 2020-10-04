package com.bridgelabz.userReg;

import org.junit.Test;
import org.junit.Assert;

public class UserLoginTest {

    @Test
    public void givenFirstname_whenValid_shouldReturnTrue() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "Rituparna";
            boolean validity_check= userLoginMain.firstname.validate(firstname);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenEmpty_shouldReturnFalse() {

        try
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "";
            boolean validity_check= userLoginMain.firstname.validate(firstname);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_EMPTY,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenNull_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = null;
            boolean validity_check= userLoginMain.firstname.validate(firstname);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_NULL,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenLessThan3Char_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname1 = "Ri";
            boolean validity_check1= userLoginMain.firstname.validate(firstname1);
            Assert.assertEquals(true, validity_check1);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenAllSmallChar_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="rituparna";
            boolean validity_check= userLoginMain.firstname.validate(firstname);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenNumberAdded_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "R1tu";
            boolean validity_check = userLoginMain.firstname.validate(firstname);
            Assert.assertEquals(true, validity_check);
        }

        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenSplCharAdded_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "R!tu";
            boolean validity_check = userLoginMain.firstname.validate(firstname);
            Assert.assertEquals(true, validity_check);
        }

        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME,e.ex);
        }

    }

    @Test
    public void givenFirstname_whenMiddleCharCaps_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "RiTu";
            boolean validity_check = userLoginMain.firstname.validate(firstname);
            Assert.assertEquals(true, validity_check);
        } catch (UserLoginMainException e) {
            System.out.println(e.ex + " " + e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_FIRST_NAME, e.ex);
        }
    }

    ////----------------------LASTNAME CHECKING-------------------------

    @Test
    public void givenLastname_whenValid_shouldReturnTrue()  {
        try
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "Biswas";
            boolean validity_check= userLoginMain.lastname.validate(firstname);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void  givenLastname_whenEmpty_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "";
            boolean validity_check= userLoginMain.lastname.validate(firstname);


        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_EMPTY,e.ex);
        }

    }

    @Test
    public void givenLastname_whenNull_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "Bi";
            boolean validity_check= userLoginMain.lastname.validate(firstname);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void givenLastname_whenLessThan3Char_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "Bi";
            boolean validity_check= userLoginMain.lastname.validate(firstname);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void givenLastname_whenAllSmallChar_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="biswas";
            boolean validity_check= userLoginMain.lastname.validate(firstname);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void givenLastname_whenNumberAdded_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="B1swas";
            boolean validity_check= userLoginMain.lastname.validate(firstname);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void givenLastname_whenSplCharAdded_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="B!swas";
            boolean validity_check= userLoginMain.lastname.validate(firstname);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    @Test
    public void givenLastname_whenMiddleCharCaps_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="BiSwas";
            boolean validity_check= userLoginMain.lastname.validate(firstname);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_LAST_NAME,e.ex);
        }

    }

    //-------------------PHONE NUMBER CHECKING------------------------

    @Test
    public void givenPhoneNumber_whenValid_shouldReturnTrue() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="91 9223322244";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenNull_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo = null;
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);


        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_NULL,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenEmpty_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo = "";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);


        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_EMPTY,e.ex);
        }
    }

    @Test
    public void givenPhoneNumber_whenNoCodeGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="9223322244";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenNoSpaceGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="919223322244";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenMoreSpaceGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="91  9223322244";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenLessThan10DigitsGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="91 92233222";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenMoreThan10DigitsGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="91 922332224455";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenAlphabetsGiven_whenInvalid_shouldReturnTrue() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="91 922AB22244";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    @Test
    public void givenPhoneNumber_whenAlphabetsGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String phoneNo ="91 922!@22244";
            boolean validity_check= userLoginMain.phonenumber.validate(phoneNo);
            Assert.assertEquals(true,validity_check);
        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_NUMBER,e.ex);
        }

    }

    //--------------------------PASSWORD CHECKING------------------------

    @Test
    public void givenPassword_whenValid_shouldReturnTrue() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="InDiA@123";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void  givenPassword_whenNull_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password = null;
            boolean validity_check= userLoginMain.password.validate(password);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_NULL,e.ex);
        }


    }

    @Test
    public void givenPassword_whenEmpty_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_EMPTY,e.ex);
        }

    }

    @Test
    public void givenPassword_whenLessThan8Length_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="InDi@1";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }
    }

    @Test
    public void givenPassword_whenNoCapsCharGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="india@123";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void givenPassword_whenNoSpecialCharGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="India123";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }


    }

    @Test
    public void givenPassword_whenMoreThan1SpecialCharGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="India@#123";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void givenPassword_whenNoNumberGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="India@home";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    @Test
    public void givenPassword_whenNoNumberAndCapsCharGiven_whenInvalid_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String password ="@jhkgkjhjgj";
            boolean validity_check= userLoginMain.password.validate(password);
            Assert.assertEquals(true,validity_check);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.INVALID_PASS,e.ex);
        }

    }

    //--------------------------EMAIL CHECKING------------------------

    @Test
    public void givenEmail_whenNull_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String email = null;
            boolean validity_check= userLoginMain.email.validate(email);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_NULL,e.ex);
        }


    }

    @Test
    public void givenEmail_whenEmpty_shouldReturnFalse() {
        try {
            UserLoginMain userLoginMain = new UserLoginMain();
            String email = "";
            boolean validity_check= userLoginMain.email.validate(email);

        }
        catch (UserLoginMainException e)
        {
            System.out.println(e.ex+" "+e.getMessage());
            Assert.assertEquals(UserLoginMainException.ExceptionType.ENTERED_EMPTY,e.ex);
        }


    }

}
