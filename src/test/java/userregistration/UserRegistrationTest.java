package userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validateFirstName("John");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validateFirstName("jo")
        );

        Assertions.assertEquals("Invalid First Name", exception.getMessage());
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validateLastName("Smith");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validateLastName("sm")
        );

        Assertions.assertEquals("Invalid Last Name", exception.getMessage());
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validateEmail("abc@yahoo.com");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validateEmail("abc@.com")
        );

        Assertions.assertEquals("Invalid Email", exception.getMessage());
    }

    @Test
    public void givenMobile_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validateMobileNumber("91 9919819801");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validateMobileNumber("919919819801")
        );

        Assertions.assertEquals("Invalid Mobile Number", exception.getMessage());
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validatePasswordRule1("Password");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validatePasswordRule1("Pass")
        );

        Assertions.assertEquals("Invalid Password Rule1", exception.getMessage());
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validatePasswordRule2("Password");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validatePasswordRule2("password")
        );

        Assertions.assertEquals("Invalid Password Rule2", exception.getMessage());
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validatePasswordRule3("Password1");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validatePasswordRule3("Password")
        );

        Assertions.assertEquals("Invalid Password Rule3", exception.getMessage());
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

        boolean result = userRegistration.validatePasswordRule4("Pass@123");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInvalid_ShouldThrowException() {

        Exception exception = Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validatePasswordRule4("Pass@@123")
        );

        Assertions.assertEquals("Invalid Password", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void givenMultipleValidEmails_ShouldReturnTrue(String email) throws UserRegistrationException {

        boolean result = userRegistration.validateEmail(email);

        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com"
    })
    public void givenMultipleInvalidEmails_ShouldThrowException(String email) {

        Assertions.assertThrows(
                UserRegistrationException.class,
                () -> userRegistration.validateEmail(email)
        );
    }
}