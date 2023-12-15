package HomeWork;

import java.util.Arrays;

public class ArrayComparer   {
    public <E, T> boolean compareArrays(E[] arrayFirst, T[] arraySecond) throws ArraysSizeException, ArraysTypeException {
        if (arrayFirst.length != arraySecond.length) throw new ArraysSizeException();
        if (arrayFirst.getClass() != arraySecond.getClass()) throw new ArraysTypeException();
        return Arrays.equals(arrayFirst, arraySecond);
    }
}

