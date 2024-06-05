package org.example.HW3;

public interface StockMarket {
    void add(Stock stock);
    void remove(Stock stock);
    Stock mostValuableStock();
}
