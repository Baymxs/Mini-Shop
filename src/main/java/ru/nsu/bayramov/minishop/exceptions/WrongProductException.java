package main.java.ru.nsu.bayramov.minishop.exceptions;

public class WrongProductException extends RuntimeException {
    public WrongProductException(String message) {
        super(message);
    }
}
