// here we have class box
// box can hold mutilple data type values like Integer, Double

public class box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
