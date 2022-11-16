package Logging;


import java.io.IOException;
import java.util.logging.*;

public class TestLogger {
    static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello ");
//        logger.log(Level.WARNING,"My First Log");


        LogManager.getLogManager().reset();
        logger.setLevel(Level.ALL);

        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        logger.addHandler(ch);


        FileHandler fh = new FileHandler("mylogger.log");
       // fh.setFormatter(new SimpleFormatter());
        fh.setLevel(Level.FINE);
        logger.info("my first log");

    /*
        SEVERE
        WARNING
        INFO
        CONFIG
        FINE
        FINER
        FINEST
    */



    }
}
