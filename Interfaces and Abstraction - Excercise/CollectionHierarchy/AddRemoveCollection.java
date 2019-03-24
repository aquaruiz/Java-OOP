import interfaces.AddRemovable;
import models.Collection;

public class AddRemoveCollection extends Collection implements AddRemovable{

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
		String element = this.items.get(this.items.size() - 1);
		this.items.remove(this.items.size() - 1);
		return element;
	}
}
