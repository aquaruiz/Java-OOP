package models;

import java.util.LinkedList;
import java.util.List;

public abstract class Collection {
	protected int maxSize = 100;
	protected List<String> items;
	
	public Collection() {
		this.items = new LinkedList<>();
	}
}
