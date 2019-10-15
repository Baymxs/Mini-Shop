package main.java.ru.nsu.bayramov.minishop;

import main.java.ru.nsu.bayramov.minishop.exceptions.WrongProductInfoException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new MiniShopService().start();
        } catch (WrongProductInfoException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
