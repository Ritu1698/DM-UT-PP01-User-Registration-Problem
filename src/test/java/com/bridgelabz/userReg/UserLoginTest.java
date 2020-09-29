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
            String firstname1 = "Rit";
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


}
