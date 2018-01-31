
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
	}

	@Override
	public String toString(){
		switch(status){
		case HIGH:
			return set + ".....VERY HOT! DONT TOUCH!";
		case MEDIUM:
			return set + ".....CAREFUL";
		case LOW:
			return set + ".....warm";
		case OFF:
			return set + ".....coool";
		}
		return null;
	}
}
