package gradle.cucumber;

public class CashSlot {
	
	
    Integer contents;
    
    public CashSlot() {
    	
    }
    
	public Integer contents() {
		return contents;
	}

	public void dispens(Integer amount) {
		 contents = amount;	
	}
}
