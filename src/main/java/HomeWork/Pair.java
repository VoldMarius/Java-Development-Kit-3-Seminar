package HomeWork;

public class Pair<T, K> {
    private final T cat;
    private final K age;

    public Pair(T cat, K age) {
        this.cat = cat;
        this.age = age;
    }



    @Override
    public String toString() {

        return String.format("Кличка кота -> %s : Возраст кота -> %s", cat.toString(), age.toString());
    }
}