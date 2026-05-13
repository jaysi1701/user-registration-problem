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
}