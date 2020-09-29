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
        public void givenFirstname_whenInvalid_shouldReturnFalse()
        {
            UserLoginMain userLoginMain = new UserLoginMain();
            String firstname1 = "rit";
            String firstname2 ="rituparna";
            boolean validity_check1= userLoginMain.FirstNameValidator(firstname1);
            Assert.assertEquals(false,validity_check1);
            boolean validity_check2= userLoginMain.FirstNameValidator(firstname2);
            Assert.assertEquals(false,validity_check2);

        }


}
