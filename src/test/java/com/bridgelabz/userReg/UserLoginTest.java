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









}
