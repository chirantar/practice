package org.example.lld.loggingframework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logging implements Logger, LogHandler{
    private static volatile Logging instance = null;
    private LogDestination logDestination;

    private LogLevel logLevel;
    private Logging(){}

    public static Logging getInstance() {
        if(instance == null){
            synchronized (Logging.class){
                if(instance == null){
                    instance = new Logging();
                }
            }
        }

        return instance;
    }

    @Override
    public void log(String message, LogLevel level) {
        handle(message, level);
    }

    @Override
    public void handle(String message, LogLevel level) {
        String finalMessage = message;
        logDestination.writeLog(finalMessage);
    }

    public void info(String message){
        if(LogLevel.INFO.ordinal() >= logLevel.ordinal()){
            log(message, LogLevel.INFO);
        }
    }

    public void debug(String message){
        if(LogLevel.DEBUG.ordinal() >= logLevel.ordinal()){
            log(message, LogLevel.DEBUG);
        }
    }

    public void error(String message){
        if(LogLevel.ERROR.ordinal() >= logLevel.ordinal()){
            log(message, LogLevel.ERROR);
        }
    }

    public void warn(String message){
        if(LogLevel.WARN.ordinal() >= logLevel.ordinal()){
            log(message, LogLevel.WARN);
        }
    }
}
