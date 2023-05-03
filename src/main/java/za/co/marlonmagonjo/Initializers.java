package za.co.marlonmagonjo;

import java.util.Properties;

/**
 *  Initializers -
 *      static initializer - runs per the class
 *      non-static initializer - runs once for each object creation
 */

class Sammple {

    // static initializer
    static {
        System.out.println("static initializer");
    }

    // non-static initializer
    {
        System.out.println("non-static initializer");
    }
}

// Use Case
class Config {
    static Properties properties;

    static {
        System.out.println("Loading the properties from configuration file");
        properties = new Properties();
    }
}

class DatabaseDriver {

    static {
        System.out.println("Register with DriverManager....");
    }
}

public class Initializers {
    public static void main(String[] args) {
        Sammple s1, s2, s3;
        s1 = new Sammple();
        s2 = new Sammple();
        s3 = new Sammple();
    }
}
