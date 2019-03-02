package greedyTimes;

import java.util.LinkedHashMap;

public class Bag {
	long capacity;
	Gold totalGold;
	long totalGemsAmount;
	LinkedHashMap<String, Gem> gems;
	long totalCashAmount;
	LinkedHashMap<String, Cash> cashes;
	
    public Bag(long capacity) {
    	this.capacity = capacity;
    	totalGold = new Gold();
    	totalGemsAmount = 0l;
    	totalCashAmount = 0l;
    	gems = new LinkedHashMap<>();
    	cashes = new LinkedHashMap<>();
	}

    private boolean isThereSpace(long quantity) {
		return this.capacity >= quantity + totalCashAmount + totalGemsAmount + totalGold.getTotalAmount();
	}
    
    public void addGold(long quantity) {
    	if (isThereSpace(quantity)) {
    		totalGold.addmore(quantity);
		}
	}
    
    public void addGem(Gem gem) {
    	if (gem.getQuantity() + totalGemsAmount > totalGold.getTotalAmount()) {
			return;
		}
    	
    	if (isThereSpace(gem.getQuantity())) {
    		if (!gems.containsKey(gem.getName())) {
    			gems.put(gem.getName(), gem);
			} else {
				Gem newGem = new Gem(gem.getName(), gems.get(gem.getName()).getQuantity() + gem.getQuantity());
				gems.put(gem.getName(), newGem);
			}
    		
    		totalGemsAmount += gem.getQuantity();
		}
	}
    
    public void addCash(Cash cash) {
		if (cash.getQuantity() + totalCashAmount > totalGemsAmount) {
			return;
		}
		
		if (isThereSpace(cash.getQuantity())) {
			if (!cashes.containsKey(cash.getName())) {
    			cashes.put(cash.getName(), cash);
			} else {
				Cash newCash = new Cash(cash.getName(), cashes.get(cash.getName()).getQuantity() + cash.getQuantity());
				cashes.put(cash.getName(), newCash);
			}

			totalCashAmount += cash.getQuantity();
		}
	}
    
    private void sortBag() {
    	gems.entrySet().stream().sorted(
    			(f, s) -> {
    				int result = s.getValue().getName().compareTo(f.getValue().getName());
    				
    				if (result == 0) {
						result = f.getValue().getQuantity() > s.getValue().getQuantity() ? 1 : -1;
					}
    				
    				return result;
    			});
    	
    	
    	cashes.entrySet().stream().sorted(
    			(f, s) -> {
    				int result = s.getValue().getName().compareTo(f.getValue().getName());
    				
    				if (result == 0) {
						result = f.getValue().getQuantity() > s.getValue().getQuantity() ? 1 : -1;
					}
    				
    				return result;
    			});
	}
    
    @Override
    public String toString() {
    	sortBag();
    	StringBuilder sBuilder = new StringBuilder();
    	if (totalGold.isAdded) {
    		sBuilder.append("<Gold> $").append(totalGold.totalAmount).append(System.lineSeparator());
    		sBuilder.append("##Gold - ").append(totalGold.totalAmount).append(System.lineSeparator());
		}
    	
    	if (gems.size() > 0) {
    		sBuilder.append("<Gem> $").append(totalGemsAmount).append(System.lineSeparator());
    		
    		gems.entrySet().stream().sorted(
        			(f, s) -> {
        				int result = s.getValue().getName().compareTo(f.getValue().getName());
        				
        				if (result == 0) {
    						result = f.getValue().getQuantity() > s.getValue().getQuantity() ? 1 : -1;
    					}
        				
        				return result;
        			}).forEach(gem -> {
        				sBuilder.append("##").append(gem.getValue().getName()).append(" - ").append(gem.getValue().getQuantity()).append(System.lineSeparator());
        			});
		}

    	if (cashes.size() > 0) {
    		sBuilder.append("<Cash> $").append(totalCashAmount).append(System.lineSeparator());
    		
        	cashes.entrySet().stream().sorted(
        			(f, s) -> {
        				int result = s.getValue().getName().compareTo(f.getValue().getName());
        				
        				if (result == 0) {
    						result = f.getValue().getQuantity() > s.getValue().getQuantity() ? 1 : -1;
    					}
        				
        				return result;
        			}).forEach(cash -> {
        				sBuilder.append("##").append(cash.getValue().getName()).append(" - ").append(cash.getValue().getQuantity()).append(System.lineSeparator());
        			});;
		}
 
    	return sBuilder.toString();
    }
}
