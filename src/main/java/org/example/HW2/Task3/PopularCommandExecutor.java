package org.example.HW2.Task3;

public final class PopularCommandExecutor {
    private ConnectionManager manager;
    private int maxAttempts;

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) {
        for (int i = 0; i < maxAttempts; i++) {
            try {
                Connection connection = manager.getConnection();
                connection.execute(command);
                connection.close();
                break;
            } catch (Exception e) {
                System.out.println("Поймали плохое соединение на " + (i + 1) + " попытке.");
                if (i + 1 == maxAttempts) {
                    throw new ConnectionException("Не удалось выполнить команду", e);
                }
            }
        }
    }
}
