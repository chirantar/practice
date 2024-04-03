package org.example.lld.loggingframework;

public class Program {
    public static void main(String[] args) {
        Logging logger = Logging.getInstance();
        logger.setLogLevel(LogLevel.DEBUG);
        logger.setLogDestination(new ConsoleDestination());
    }
}
