package com.uccases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
  private String email2Test;
    private boolean expectedResult;

    public ValidEmailTest(String email2Test, boolean expectedResult) {
        this.email2Test = email2Test;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection input(){
        return  Arrays.asList(new Object[][]{{"aanchalt14@gmail.com", true},
                {"ria56", false},
                {"abc-100@gmail.com", true},
                {"abc.100@yahoo.com", true},
                {"abc+100@gmail.com", true}});
    }


    @Test
    public void EmailasVar_shouldReturnAsPerCase()  {
        UserRegistration1 userRegistration=new UserRegistration1();
        boolean result = false;
        try {
            result = userRegistration.email(this.email2Test);
            Assert.assertEquals(this.expectedResult,result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper email",exception.getMessage());
        }
    }
