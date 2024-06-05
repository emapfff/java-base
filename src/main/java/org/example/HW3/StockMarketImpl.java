package org.example.HW3;

import java.util.List;
import java.util.PriorityQueue;

public class StockMarketImpl implements StockMarket{
    private final PriorityQueue<Stock> pq = new PriorityQueue<>(new StockComparator());

    @Override
    public void add(Stock stock) {
        this.pq.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        this.pq.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return this.pq.peek();
    }

    public List<Stock> getListStocks() {
        return pq.stream().toList();
    }
}
