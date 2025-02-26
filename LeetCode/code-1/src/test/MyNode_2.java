package test;

public class MyNode_2<T> {
    private T data;
    private MyNode_2<T> next;

    public MyNode_2(T data, MyNode_2<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode_2<T> getNext() {
        return next;
    }

    public void setNext(MyNode_2<T> next) {
        this.next = next;
    }
}
