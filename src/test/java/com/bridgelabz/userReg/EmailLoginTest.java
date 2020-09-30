package com.bridgelabz.userReg;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)

public class EmailLoginTest {

    public String email;
    public boolean valid_checker;

    public  EmailLoginTest(String email, boolean valid_checker){
        this.email = email;
        this.valid_checker = valid_checker;

    }

    @Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com",true},{"abc.100@yahoo.com", true},
                {"abc-100@abc.net",true},{"abc111@abc.com",true},{"abc.100@abc.com.au",true},
                {"abc@1.com",true},{"abc-xyz@gmail.com.com",true},{"abc+100@gmail.com",true},
                {"abc",false},{"abc@.com.my",false},{"abc123@gmail.a",false},
                {"abc123@.com",false},{"abc.xyz@.com.com",false},{".abc@abc.com",false},
                {"abc$*@gmail.com",false},{"abc@%*.com",false},{"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},{"abc@abc@gmail.com",false},{"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}});
    }
    @Test
    public void givenEmail_whenValid_shouldReturnTrue() {
        UserLoginMain userLoginMain= new UserLoginMain();
        boolean validity_check= userLoginMain.EmailValidator(this.email);
        Assert.assertEquals(this.valid_checker,validity_check);
    }


}
