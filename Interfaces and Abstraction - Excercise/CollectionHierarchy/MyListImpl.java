import interfaces.MyList;
import models.Collection;

public class MyListImpl extends Collection implements MyList {
	@Override
	public int add(String item) {
		if (this.maxSize > this.items.size()) {
			this.items.add(0, item);
			return 0;
		}
		
		return this.items.size() - 1;
	}

	@Override
	public String remove() {
		String element = this.items.get(0);
		this.items.remove(0);
		return element;
	}

	@Override
	public int getUsed() {
		return this.items.size();
	}
}