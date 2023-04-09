package pl.rmitula.authapp.exception;

public class BadRequestException extends RuntimeException {
   //BadRequestException 
    public BadRequestException(String message) {
        super(message);
    }
}
