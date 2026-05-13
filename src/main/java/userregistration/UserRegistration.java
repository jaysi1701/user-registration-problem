package userregistration;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return firstName.matches(regex);
    }

    public boolean validateLastName(String lastName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return lastName.matches(regex);
    }

}