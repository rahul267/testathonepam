package Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;


public class Log {

        //Initialize Log4j instance
       private static Logger Log = LoggerFactory.getLogger(Log.class) ;

    //Created to build custom log appender with rest assured
    /* public static PrintStream logStream = IoBuilder.forLogger(Log).buildPrintStream();

     public static PrintStream  getLogStream () { return IoBuilder.forLogger(Log).buildPrintStream();}
     //We can use it when starting tests*/
        public static void startLog (String testClassName){
            Log.info("test is Starting...");
        }

        //We can use it when ending tests
        public static void endLog (String testClassName){
            Log.info("test is Ending...");
        }

        //Info Level Logs
        public static void info (String message) {
            Log.info(message);
        }

        //Warn Level Logs
        public static void warn (String message) {
            Log.warn(message);
        }

        //Error Level Logs
        public static void error (String message) {
            Log.error(message);
        }

        //Fatal Level Logs
       /* public static void fatal (String message) {
            Log.fatal(message);
        }*/

        //Debug Level Logs
        public static void debug (String message) {
            Log.debug(message);
        }
    }

