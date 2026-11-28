public interface Validator {

    public void setNextValidator(Validator nextValidator);

    public void validate(UserRegistration data)throws Exception;
    // created an exceptiong . make sure to E capitalize FUTURE USE.

}
