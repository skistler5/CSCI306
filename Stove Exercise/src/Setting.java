
public class Setting {
	public enum Status{OFF, LOW, MEDIUM, HIGH};
	private Status status;
	private String set;

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
		this.set = set;
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
		this.set = set;
	}

	@Override
	public String toString(){
		String output = "[" + set + "].....";
		switch(status){
		case HIGH:
			output += "VERY HOT! DONT TOUCH!";
			break;
		case MEDIUM:
			output += "CAREFUL";
			break;
		case LOW:
			output += "warm";
			break;
		case OFF:
			output += "coool";
			break;
		}
		return output;
	}
}
