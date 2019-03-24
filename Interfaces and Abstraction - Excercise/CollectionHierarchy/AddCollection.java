import interfaces.Addable;
import models.Collection;

public class AddCollection extends Collection implements Addable{

	@Override
	public int add(String item) {
		if (this.maxSize > this.items.size()) {
			this.items.add(item);
			
			return this.items.size() - 1;
		}
		
		return 0;
	}

}
