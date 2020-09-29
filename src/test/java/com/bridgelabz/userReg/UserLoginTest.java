package com.bridgelabz.userReg;

import org.junit.Test;
import org.junit.Assert;

public class UserLoginTest {

        @Test
        public void givenFirstname_whenValid_shouldReturnTrue()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname = "Rituparna";
            boolean validity_check= userLoginMain.FirstNameValidator(firstname);
            Assert.assertEquals(true,validity_check);

        }

        @Test
        public void givenFirstname_whenlessThan3Char_whenInvalid_shouldReturnFalse()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname1 = "Ri";
            boolean validity_check1= userLoginMain.FirstNameValidator(firstname1);
            Assert.assertEquals(false,validity_check1);
        }

        @Test
        public void givenFirstname_whenAllSmallChar_whenInvalid_shouldReturnFalse()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="rituparna";
            boolean validity_check= userLoginMain.FirstNameValidator(firstname);
            Assert.assertEquals(false,validity_check);
        }

        @Test
        public void givenFirstname_whenNumberAdded_whenInvalid_shouldReturnFalse()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="R1tu";
            boolean validity_check= userLoginMain.FirstNameValidator(firstname);
            Assert.assertEquals(false,validity_check);

        }
        @Test
        public void givenFirstname_whenSplCharAdded_whenInvalid_shouldReturnFalse()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="R!tu";
            boolean validity_check= userLoginMain.FirstNameValidator(firstname);
            Assert.assertEquals(false,validity_check);
        }
        @Test
        public void givenFirstname_whenMiddleCharCaps_whenInvalid_shouldReturnFalse()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname ="RiTu";
            boolean validity_check= userLoginMain.FirstNameValidator(firstname);
            Assert.assertEquals(false,validity_check);
        }
    ////----------------------LASTNAME CHECKING-------------------------

    @Test
    public void givenLastname_whenValid_shouldReturnTrue()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname = "Biswas";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(true,validity_check);
    }

    @Test
    public void givenLastname_whenlessThan3Char_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname = "Bi";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenLastname_whenAllSmallChar_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="biswas";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenLastname_whenNumberAdded_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="B1swas";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);

    }
    @Test
    public void givenLastname_whenSplCharAdded_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="B!swas";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenLastname_whenMiddleCharCaps_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="BiSwas";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    //-------------------PHONENUMBER CHECKING------------------------
    @Test
    public void givenPhoneNumber_whenValid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="91 9223322244";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(true,validity_check);
    }
    @Test
    public void givenPhoneNumber_whenNoCodeGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="9223322244";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenPhoneNumber_whenNoSpaceGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="919223322244";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenPhoneNumber_whenMoreSpaceGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="91  9223322244";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenPhoneNumber_whenLessThan10DigitsGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="91 92233222";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPhoneNumber_whenMoreThan10DigitsGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="91 922332224455";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenPhoneNumber_whenAlphabetsGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="91 922AB22244";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPhoneNumber_whenSplCharGiven_whenInvalid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String phoneNo ="91 922!@22244";
        boolean validity_check= userLoginMain.PhoneNumberValidator(phoneNo);
        Assert.assertEquals(false,validity_check);
    }
    //--------------------------PASSWORD CHECKING------------------------
    @Test
    public void givenPassword_whenValid_shouldReturnTrue(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="InDiA@123";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(true,validity_check);
    }
    @Test
    public void givenPassword_whenLessThan8Length_whenInvalid_shouldReturnFalse(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="InDiA@";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPassword_whenNoCapsCharGiven_whenInvalid_shouldReturnFalse(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="india@123";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPassword_whenNoSpecialCharGiven_whenInvalid_shouldReturnFalse(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="India123";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPassword_whenMoreThan1SpecialCharGiven_whenInvalid_shouldReturnFalse(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="India@#123";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPassword_whenNoNumberGiven_whenInvalid_shouldReturnFalse(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="India@home";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenPassword_whenNoNumberAndCapsCharGiven_whenInvalid_shouldReturnFalse(){
        UserLoginMain userLoginMain = new UserLoginMain();
        String password ="@jhkgkjhjgj";
        boolean validity_check= userLoginMain.PasswordValidator(password);
        Assert.assertEquals(false,validity_check);
    }














}
