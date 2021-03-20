package de.dz2.exception;

public class WrongCompanyIdException extends RuntimeException{
    public WrongCompanyIdException(String message) {
        super(message);
    }
}
