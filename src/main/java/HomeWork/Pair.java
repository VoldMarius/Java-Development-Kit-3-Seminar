package HomeWork;

public class Pair<T, K> {
    private T cat;
    private K age;

    public Pair(T cat, K age) {
        this.cat = cat;
        this.age = age;
    }

    public T getFirst() {
        return cat;
    }

    public K getSecond() {
        return age;
    }

    @Override
    public String toString() {

        return String.format("Кличка кота -> %s : Возраст кота -> %s", cat.toString(), age.toString());
    }
}