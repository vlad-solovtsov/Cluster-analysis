package dip;

public class MyPair <K, V> {
    private K first;
    private V second;


    public MyPair(K key, V value) {
        first = key;
        second = value;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getFirst() {

        return first;
    }

    public V getSecond() {
        return second;
    }
}
