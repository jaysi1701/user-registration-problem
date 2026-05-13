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

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validatePasswordRule2("Password");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validatePasswordRule2("password");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validatePasswordRule3("Password1");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validatePasswordRule3("Password");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.validatePasswordRule4("Pass@123");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.validatePasswordRule4("Pass@@123");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenValidEmails_ShouldReturnTrue() {

        Assertions.assertTrue(userRegistration.validateEmail("abc@yahoo.com"));

        Assertions.assertTrue(userRegistration.validateEmail("abc-100@yahoo.com"));

        Assertions.assertTrue(userRegistration.validateEmail("abc.100@yahoo.com"));

        Assertions.assertTrue(userRegistration.validateEmail("abc111@abc.com"));

        Assertions.assertTrue(userRegistration.validateEmail("abc-100@abc.net"));

        Assertions.assertTrue(userRegistration.validateEmail("abc.100@abc.com.au"));

        Assertions.assertTrue(userRegistration.validateEmail("abc@1.com"));

        Assertions.assertTrue(userRegistration.validateEmail("abc@gmail.com.com"));

        Assertions.assertTrue(userRegistration.validateEmail("abc+100@gmail.com"));
    }

    @Test
    public void givenInvalidEmails_ShouldReturnFalse() {

        Assertions.assertFalse(userRegistration.validateEmail("abc"));

        Assertions.assertFalse(userRegistration.validateEmail("abc@.com.my"));

        Assertions.assertFalse(userRegistration.validateEmail("abc123@gmail.a"));

        Assertions.assertFalse(userRegistration.validateEmail("abc123@.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc123@.com.com"));

        Assertions.assertFalse(userRegistration.validateEmail(".abc@abc.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc()*@gmail.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc@%*.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc..2002@gmail.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc.@gmail.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc@abc@gmail.com"));

        Assertions.assertFalse(userRegistration.validateEmail("abc@gmail.com.1a"));

        Assertions.assertFalse(userRegistration.validateEmail("abc@gmail.com.aa.au"));
    }

}