package nLayeredDemo.core;

import nLayeredDemo.jLogger.JloggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        JloggerManager jloggerManager = new JloggerManager();
        jloggerManager.log(message);
    }
}
