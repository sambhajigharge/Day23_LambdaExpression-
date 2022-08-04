package LambdaUserRegistration.test;


import LambdaUserRegistration.main.ExceptionUserRegistration;
import LambdaUserRegistration.main.InputInvalidException;
import org.junit.Assert;
import org.junit.Test;


public class ExceptionUserRegistrationTest {

    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void firstName() throws InputInvalidException {
        String firstName = "Sushant";
        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
    }

    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Mane";
        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
    }

    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "maneprakash2025@gmail.com";
        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
    }

    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 8329881467";
        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
    }

    @Test
    public void password() throws InputInvalidException {
        String password = "qw98hRL@&dl";
        Assert.assertTrue(exceptionUserRegistration.testPassword(password));
    }
}