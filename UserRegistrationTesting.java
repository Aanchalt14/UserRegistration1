package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest extends UserRegistration1 {

    @Test
    public void FirstName_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = firstName.check("Aanchal");
            ;
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }

    @Test
    public void NotProperFirstName_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = firstName.check("Aa");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }

    @Test
    public void LastName_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = lastName.check("Thakur");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper lastname", exception.getMessage());
        }
    }

    @Test
    public void NotProperLastName_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = lastName.check("Th");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper lastname", exception.getMessage());
        }
    }

    @Test
    public void Email_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = email.check("aanchalt14@gamil.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper email", exception.getMessage());
        }
    }

    @Test
    public void NotProperEmail_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = email.check("Aanc14.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper email", exception.getMessage());
        }
    }

    @Test
    public void ProperMobile_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = mobile.check("7089589481");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper mobile", exception.getMessage());
        }
    }

    @Test
    public void NotProperMobile_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = mobile.check("7089589481");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper mobile", exception.getMessage());
        }
    }

    @Test
    public void Password_Should_ReturnTrue() {
        try {
            boolean result = password.check("Aanchal1410");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper password", exception.getMessage());
        }
    }

    @Test
    public void NotProperPassword_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = password.check("Aanchal");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper password", exception.getMessage());
        }
    }