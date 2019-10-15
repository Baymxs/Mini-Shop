package main.java.ru.nsu.bayramov.minishop.exceptions;

public class WrongCommandException extends RuntimeException {
    public WrongCommandException(String message) {
        super(message);
    }
}
