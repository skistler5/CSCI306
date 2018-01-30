
public class Setting {
	public enum Status{OFF, LOW, MEDIUM, HIGH};
	private Status status;
	
	public Setting(String set){
		super();
		if(set.equals("---")){
			status = Status.OFF;
		}
		else if(set.equals("--+")){
			status = Status.LOW;
		}
		else if(set.equals("-++")){
			status = Status.MEDIUM;
		}
		else{
			status = Status.HIGH;
		}
		
	}
	
	public Status getStatus(){
		return status;
	}
	
	public void setStatus(String set){
		if(set.equals("---")){
			status = Status.OFF;
		}
		else if(set.equals("--+")){
			status = Status.LOW;
		}
		else if(set.equals("-++")){
			status = Status.MEDIUM;
		}
		else{
			status = Status.HIGH;
		}
	}
	
	@Override
	public String toString(){
		return "" + status;
	}
}
