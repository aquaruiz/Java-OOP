package calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class InputInterpreter {
    private CalculationEngine engine;
    private Deque<Integer> memoryStack;
    
    public InputInterpreter(CalculationEngine engine){
        this.engine = engine;
        this.memoryStack = new ArrayDeque<>();
    }

    public boolean interpret(String input) {
    	// memory save
    	if (input.equals("ms")) {
			this.memoryStack.push(engine.getCurrentResult());
			return true;
		}
    	
    	if (input.equals("mr")) {
			engine.pushNumber(this.memoryStack.pop());
			return true;
		}
    	
        try {
            engine.pushNumber(Integer.parseInt(input));
        }catch (Exception ex){
            engine.pushOperation(this.getOperation(input));
        }
        
        return true;
    }
    
    public Operation getOperation(String operation) {
        if (operation.equals("*")) {
            return new MultiplicationOperation();
        } 
        
        if (operation.equals("/")) {
        	return new DevisionOperation();
        }
        
        return null;
    }
}