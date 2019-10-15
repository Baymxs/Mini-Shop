package main.java.ru.nsu.bayramov.minishop;

import main.java.ru.nsu.bayramov.minishop.exceptions.WrongCommandException;

public class Product {
    private String name;
    private double price;
    private int numInStock;
    private int acquiredNum;

    public Product(String name, double price, int numInStock, int acquiredNum) {
        this.name = name;
        this.price = price;
        this.numInStock = numInStock;
        this.acquiredNum = 0;
    }

    public Product(String[] data) throws NumberFormatException {
        this.name = data[0];
        this.price = Double.parseDouble(data[1]);
        this.numInStock = Integer.parseInt(data[2]);
        this.acquiredNum = 0;
    }

    public String getName() {
        return name;
    }

    public int getAcquiredNum() {
        return acquiredNum;
    }

    public void setAcquiredNum(int acquiredNum) throws WrongCommandException {
        int tmp = this.numInStock - acquiredNum;

        if (tmp < 0) {
            throw new WrongCommandException("Not enough products in stock");
        } else {
            numInStock = tmp;
            this.acquiredNum += acquiredNum;
        }
    }

    public int getNumInStock() {
        return numInStock;
    }

    public double getPrice() {
        return price;
    }
}
