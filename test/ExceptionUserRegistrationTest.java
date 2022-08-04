package LambdaUserRegistration.test;

import LambdaUserRegistration.main.ExceptionUserRegistration;
import org.junit.Assert;
import org.junit.Test;


public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.firstName("Sushant");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("Sushant");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.firstName("Mane");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("Mane");
        Assert.assertEquals(false, actualResult);
    }

}
