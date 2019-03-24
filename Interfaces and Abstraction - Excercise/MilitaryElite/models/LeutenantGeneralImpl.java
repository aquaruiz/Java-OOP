package models;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public abstract class LeutenantGeneralImpl extends PrivateImpl {
	private Set<PrivateImpl> privates;
	
	public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
		this.privates = new TreeSet<>(new Comparator<PrivateImpl>() {
			@Override
			public int compare(PrivateImpl o1, PrivateImpl o2) {
				return o2.getId() - o1.getId();
			}
		});
	}	
	
	public void addPrivate(PrivateImpl pr) {
		this.privates.add(pr);
	}
	
	public Set<PrivateImpl> getPrivates() {
		return privates;
	}
}
