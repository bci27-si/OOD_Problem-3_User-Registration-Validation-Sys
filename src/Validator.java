public interface Validator {

    public void setNextValidator(Validator nextValidator);

    public void validate(UserRegistration data);

}
