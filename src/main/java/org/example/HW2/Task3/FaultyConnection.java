package org.example.HW2.Task3;


import java.util.Random;

public class FaultyConnection implements Connection {
    private final Random random = new Random();

    @Override
    public void execute(String command) {
        if (random.nextBoolean()) {
            throw new ConnectionException("Ошибка в проблемном соединении " + command);
        } else {
            System.out.println("Удачно подключено к проблемному соединении.");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Прекращение работы проблемной сети.");
    }
}
