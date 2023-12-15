package HomeWork;

public class ArraysSizeException   extends RuntimeException {

    public  ArraysSizeException() {
        super("The lengths of the arrays are not equal");
    }
}