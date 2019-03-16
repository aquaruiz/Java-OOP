package randomArrayList;

import java.util.ArrayList;

public class RandomArrayList<E> extends ArrayList<E>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public E getRandomElement() {
		double randomIndex = Math.random(); 
		int size = this.size();
		int index = (int) ((randomIndex * 100) % size);
		
		E element = get(index);
		remove(index);
		return element;
	}
}
