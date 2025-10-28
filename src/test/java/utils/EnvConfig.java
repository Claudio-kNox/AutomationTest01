package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {
    private static final Dotenv dotenv = Dotenv.load();

    public static String get(String key) {
        String value = dotenv.get(key);
        if (value == null || value.isEmpty()) {
            throw new RuntimeException("La variable de entorno '" + key + "' no está definida en el archivo .env");
        }
        return value;
    }

    // Métodos específicos para variables comunes
    public static String getGmailPassword() {
        return get("GMAIL_PASSWORD");
    }

    public static String getGmailUser() {
        return get("GMAIL_USER");
    }

    // Puedes añadir más getters según lo necesites
}
