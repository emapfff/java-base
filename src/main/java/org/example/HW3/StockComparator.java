package org.example.HW3;

import java.util.Comparator;

public class StockComparator implements Comparator<Stock> {

    @Override
    public int compare(Stock o1, Stock o2) {
        if (o1.cost() < o2.cost()) return 1;
        else if (o1.cost() > o2.cost()) return -1;
        return 0;
    }
}
