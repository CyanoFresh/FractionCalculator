package cyanofresh.calculator;

class Controller {
    static int[] sum(Model m) {
        int result[] = new int[2];

        int denominator = m.xDenominator;
        int xNumerator = m.xNumerator;
        int yNumerator = m.yNumerator;

        if (m.xDenominator != m.yDenominator) {
            denominator = m.xDenominator * m.yDenominator;

            xNumerator *= m.yDenominator;
            yNumerator *= m.xDenominator;
        }

        int numerator = yNumerator + xNumerator;

        result[0] = numerator;
        result[1] = denominator;

        return result;
    }

    static int[] subtract(Model m) {
        int result[] = new int[2];

        int denominator = m.xDenominator;
        int xNumerator = m.xNumerator;
        int yNumerator = m.yNumerator;

        if (m.xDenominator != m.yDenominator) {
            denominator = m.xDenominator * m.yDenominator;

            xNumerator *= m.yDenominator;
            yNumerator *= m.xDenominator;
        }

        int numerator = yNumerator - xNumerator;

        result[0] = numerator;
        result[1] = denominator;

        return result;
    }

    static int[] multiply(Model m) {
        int result[] = new int[2];

        int numerator = m.xNumerator * m.yNumerator;
        int denominator = m.xDenominator * m.yDenominator;

        result[0] = numerator;
        result[1] = denominator;

        return result;
    }

    static int[] divide(Model m) {
        int yNumerator = m.yNumerator;

        m.yNumerator = m.yDenominator;
        m.yDenominator = yNumerator;

        return multiply(m);
    }
}
