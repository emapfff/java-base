package org.example.HW2.Task3;

import java.util.Random;

public class DefaultConnectionManager implements ConnectionManager {
    private final Random random = new Random();

    @Override
    public Connection getConnection() {
        if (random.nextBoolean()) {
            return new StableConnection();
        } else {
            return new FaultyConnection();
        }
    }
}
