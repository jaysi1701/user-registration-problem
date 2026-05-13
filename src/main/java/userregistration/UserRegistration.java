package userregistration;

public class UserRegistration {

    public boolean validateFirstName(String firstName) throws UserRegistrationException {

        String regex = "^[A-Z][a-z]{2,}$";

        if (firstName.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid First Name");
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {

        String regex = "^[A-Z][a-z]{2,}$";

        if (lastName.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Last Name");
    }


    public boolean validateEmail(String email) throws UserRegistrationException {

        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";

        if (email.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Email");
    }


    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";

        if (mobileNumber.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Mobile Number");
    }


    public boolean validatePasswordRule1(String password) throws UserRegistrationException {

        String regex = "^.{8,}$";

        if (password.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Password Rule1");
    }

    public boolean validatePasswordRule2(String password) throws UserRegistrationException {

        String regex = "^(?=.*[A-Z]).{8,}$";

        if (password.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Password Rule2");
    }

    public boolean validatePasswordRule3(String password) throws UserRegistrationException {

        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

        if (password.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Password Rule3");
    }

    public boolean validatePasswordRule4(String password) throws UserRegistrationException {

        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$";

        if (password.matches(regex)) {
            return true;
        }

        throw new UserRegistrationException("Invalid Password");
    }

}