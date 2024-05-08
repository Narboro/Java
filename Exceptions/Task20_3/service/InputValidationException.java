package Task20_3.service;

public class InputValidationException extends Exception{
    private final int input;
    public InputValidationException(String message, int input){
        super(message);
        this.input = input;
    }
    public int getInput(){
        return input;
    }
}
