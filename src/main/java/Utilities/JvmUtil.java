package Utilities;

public class JvmUtil {
    public static String getJvmProperty(String prop) {
        return (System.getProperty(prop, System.getenv(prop)));
    }
}
