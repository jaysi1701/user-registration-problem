package userregistration;

@FunctionalInterface
public interface UserValidation {

    boolean validate(String input);
}