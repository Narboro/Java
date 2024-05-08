package Task20_4.Service;

import Task20_4.model.Animal;

public class UnknownAnimalException extends RuntimeException{
    public UnknownAnimalException(String message){
        super(message);
    }
}
