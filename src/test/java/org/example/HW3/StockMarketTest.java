package org.example.HW3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockMarketTest {
    private final StockMarketImpl stockMarket = new StockMarketImpl();
    Stock fish = new Stock("fish", 300);
    Stock bear = new Stock("bear", 100);
    Stock bread = new Stock("bread", 50);

    @Test
    void add() {
        stockMarket.add(fish);
        stockMarket.add(bread);
        stockMarket.add(fish);

        assertEquals(stockMarket.getListStocks().size(), 3);
    }

    @Test
    void remove() {
        stockMarket.add(fish);
        stockMarket.add(bread);
        stockMarket.add(bear);

        stockMarket.remove(fish);
        stockMarket.remove(bread);
        stockMarket.remove(bear);

        assertEquals(stockMarket.getListStocks().size(), 0);
    }

    @Test
    void mostValuableStock() {
        stockMarket.add(fish);
        stockMarket.add(bread);
        stockMarket.add(bear);
        stockMarket.add(new Stock("sth", 301));

        assertEquals(stockMarket.mostValuableStock().cost(), 301);
        assertEquals(stockMarket.mostValuableStock().nameProduct(), "sth");
    }
}