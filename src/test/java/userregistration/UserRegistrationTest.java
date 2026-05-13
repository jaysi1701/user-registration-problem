package userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validateFirstName("John");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validateFirstName("jo");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validateLastName("Smith");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validateLastName("sm");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validateEmail("abc@.com");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validateMobileNumber("91 9919819801");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validateMobileNumber("919919819801");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validatePasswordRule1("Password");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validatePasswordRule1("Pass");

        Assertions.assertFalse(result);
    }

}