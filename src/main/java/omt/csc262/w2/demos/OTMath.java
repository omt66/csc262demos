package omt.csc262.w2.demos;

/**
 * My simple yet (supposed to be) powerful math library!
 *
 * @author omt
 */
public class OTMath {

    /**
     * Do not allow anyone to instantiate this class! Because it provides nice
     * static methods (just like Math)
     */
    private OTMath() {
    }

    public static final double PI = 3.1415926535897932385;
    public static final double E = 2.7182818284590452354;

    static double abs(double x) {
        if (x < 0) {
            return -x;
        }

        return x;
    }

    // TODO: Add more here...
    static double max(double x, double y) {
        if (x > y) {
            return x;
        }

        return y;
    }

    static double max(double x, double y, double z) {
        double result = x;

        if (result < y) {
            result = y;
        }

        if (result < z) {
            result = z;
        }

        return result;
    }
    
    static double maxAlternative(double x, double y, double z) {
        return max(x, max(y, z));
    }
}
