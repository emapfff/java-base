package org.example.HW2.Task3;

public class StableConnection implements Connection {
    @Override
    public void execute(String command) {
        System.out.println("Стабильное подключение: " + command);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Прекращение стабильного подключения!");
    }
}
