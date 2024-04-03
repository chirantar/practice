package org.example.lld.loggingframework;

public class ConsoleDestination implements LogDestination{
    @Override
    public void writeLog(String message) {
        System.out.println(message);
    }
}
