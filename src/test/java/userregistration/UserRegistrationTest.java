package userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.firstNameValidator.validate("John");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.firstNameValidator.validate("jo");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.lastNameValidator.validate("Smith");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.lastNameValidator.validate("sm");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.emailValidator.validate("abc@yahoo.com");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.emailValidator.validate("abc@.com");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobile_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.mobileValidator.validate("91 9919819801");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.mobileValidator.validate("919919819801");

        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {

        boolean result = userRegistration.passwordValidator.validate("Pass@123");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {

        boolean result = userRegistration.passwordValidator.validate("Pass@@123");

        Assertions.assertFalse(result);
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
    public void givenMultipleValidEmails_ShouldReturnTrue(String email) {

        boolean result = userRegistration.emailValidator.validate(email);

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
    public void givenMultipleInvalidEmails_ShouldReturnFalse(String email) {

        boolean result = userRegistration.emailValidator.validate(email);

        Assertions.assertFalse(result);
    }
}