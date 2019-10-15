package main.java.ru.nsu.bayramov.minishop.exceptions;

public class WrongProductInfoException extends RuntimeException {
    public WrongProductInfoException(String message) {
        super(message);
    }
}
