package userregistration;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return firstName.matches(regex);
    }
}