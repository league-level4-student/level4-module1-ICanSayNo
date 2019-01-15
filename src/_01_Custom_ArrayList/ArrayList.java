package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	private T[] list;
	
	
	public ArrayList() {
		list = (T[]) new Object [0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		System.out.println(list);
		return list[loc];
	}
	
	public void add(T val) {
		T[] newList = (T[]) new Object [list.length+1];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		newList[newList.length-1] = val;
		for (int i = 0; i < newList.length; i++) {
			System.out.println(newList[i]);
		}
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object [list.length+1];
		boolean inserted = false;
		for (int i = 0; i < list.length; i++) {
			if (i == loc) {
				newList[loc] = val;
				inserted = true;
			}
			if (!inserted) {
				newList[i] = list[i];
			}
			if (inserted) {
				newList[i+1] = list[i];
			}
		}
		list = newList;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object [list.length-1];
		boolean removed = false;
		for (int i = 0; i < list.length-1; i++) {
			if (i == loc) {;
				removed = true;
			}
			if (!removed) {
				newList[i] = list[i];
			}
			if (removed) {
				newList[i] = list[i+1];
			}
		}
		list = newList;

	}
	
	public boolean contains(T val) {
		boolean contains = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i]==val){
				contains = true;
			}
		}
		return contains;
	}

	public int size() {
		
		return list.length;
	}
}