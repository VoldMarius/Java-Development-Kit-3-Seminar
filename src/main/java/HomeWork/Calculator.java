package HomeWork;

public class Calculator {
    public static <A extends Number, B extends Number> double sum(A numFirst, B numSecond) {
        return numFirst.doubleValue() + numSecond.doubleValue();
    }

    public static <A extends Number, B extends Number> double multiply(A numFirst, B numSecond) {
        return numFirst.doubleValue() * numSecond.doubleValue();
    }

    public static <A extends Number, B extends Number> double divide(A numFirst, B numSecond) throws ArithmeticException{
        if (numSecond.equals(0) || numSecond.equals(0.0) || numSecond.equals(0.0f) || numSecond.equals(0L)) {
            throw new DivideByZeroException();
        } else return numFirst.doubleValue() / numSecond.doubleValue();
    }

    public static <A extends Number, B extends Number> double subtract(A numFirst, B numSecond) {
        return numFirst.doubleValue() - numSecond.doubleValue();
    }

}
