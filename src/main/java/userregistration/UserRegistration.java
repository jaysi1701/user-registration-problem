package userregistration;

public class UserRegistration {

    UserValidation firstNameValidator = firstName ->
            firstName.matches("^[A-Z][a-z]{2,}$");

    UserValidation lastNameValidator = lastName ->
            lastName.matches("^[A-Z][a-z]{2,}$");

    UserValidation emailValidator = email ->
            email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");

    UserValidation mobileValidator = mobile ->
            mobile.matches("^[0-9]{2}\\s[0-9]{10}$");

    UserValidation passwordValidator = password ->
            password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$");
}