public class Function {
    private int _value;
    private Function _next;
    public Function(int value) {
        _value = value;
        _next = null;
    }
    public Function(int value, Function next) {
        _value = value;
        _next = next;
    }
    public int getValue() {
        return _value;
    }
    public void setValue(int v){
        _value = v;
    }
    public Function getNext() {
        return _next;
    }
    public void setNext(Function func) {
        _next = func;
    }
    public String toString() {
        return(_value + " -> "+_next);
    }
}

//// MAKE NEW FILE FOR TESTER
public class Tester {
	public static void main(String[] args) {
		Function fd1 = new Function(2);
		Function fd2 = new Function(3);
		Function fd3 = new Function(4);
		Function fd4 = new Function(5);
		Function fd5 = new Function(6);
		fd1.setNext(fd2);
		fd2.setNext(fd3);
		fd3.setNext(fd4);
		fd4.setNext(fd5);
		System.out.println(fd1);
	}
}
