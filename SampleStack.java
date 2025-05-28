package gnc;

public class SampleStack<T> {

	private T item;
	
	public void push(T item) {
		this.item = item;
	}
	
	public T pop() {
		return item;
	}
	
}
