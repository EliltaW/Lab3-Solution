package prob3;

import java.util.Arrays;

public class MyStringList {
	private String[] strArray;
	int size;

	public MyStringList() {
		size = 0;
		strArray = new String[2];
	}

	public void add(String s) {
		if (size >= strArray.length)
			resize();
		strArray[size] = s;
		size++;
	}

	public String get(int i) {
		if (i >= strArray.length) {
			throw new ArrayIndexOutOfBoundsException(i);
		}

		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < strArray.length; i++) {
			if (s.equals(strArray[i])) {
				return true;
			}
		}
		return false;

	}

	public boolean remove(String s) {
		int index = -1;
		if (s == null)
			return false;
		for (int i = 0; i < strArray.length; i++) {
			if (s.equals(strArray[i])) {
				index = i;

			}
		}
		if (index == -1)
			return false;
		String[] copy = new String[strArray.length - 1];
		System.arraycopy(strArray, 0, copy, 0, index);
		System.arraycopy(strArray, index + 1, copy, index, strArray.length-index-1);
		strArray = copy;
		size--;
		return true;
	}

	public String toString() {
		StringBuilder s = new StringBuilder("[");
		for (int i = 0; i < size-1; i++) {
			s.append(strArray[i]);
			s.append(", ");
		}
		s.append(strArray[size-1]);
		s.append("]");
		return s.toString();
	}

	public int size() {
		return size;
	}

	private void resize() {
		System.out.println("Resizing....");
		String[]doublz = new String[2*size];
		System.arraycopy(strArray, 0, doublz, 0, size);
		strArray = doublz;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);

	}

}
