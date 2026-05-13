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

    public boolean validateEmail(String email) {

        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        return email.matches(regex);
    }

    public boolean validateMobileNumber(String mobileNumber) {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";

        return mobileNumber.matches(regex);
    }

}