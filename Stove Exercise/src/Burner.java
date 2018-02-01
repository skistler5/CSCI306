
public class Burner {
	public enum Temperature{BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer = 0;
	public final static int TIME_DURATION = 2;

	public Burner(){
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = new Setting("---");
	}

	public void plusButton(){	//needs to set timer
		switch(mySetting.getStatus()){
		case OFF:
			mySetting.setStatus("--+");
			timer = timer + TIME_DURATION;
			break;
		case LOW:
			mySetting.setStatus("-++");
			timer = timer + TIME_DURATION;
			break;
		case MEDIUM:
			mySetting.setStatus("+++");
			timer = timer + TIME_DURATION;
			break;
		default:
			break;
		}
	}

	public void minusButton(){	//needs to set timer
		switch(mySetting.getStatus()){
		case HIGH:
			mySetting.setStatus("-++");
			timer = timer + TIME_DURATION;
			break;
		case MEDIUM:
			mySetting.setStatus("--+");
			timer = timer + TIME_DURATION;
			break;
		case LOW:
			mySetting.setStatus("---");
			timer = timer + TIME_DURATION;
			break;
		default:
			break;
		}
	}

	public void updateTemperature() {	//update timer and temp
		if (timer > 0) {
			timer --;
		}
		else {
			switch(mySetting.getStatus()){
			case HIGH:
				myTemperature = Temperature.BLAZING;
				break;
			case MEDIUM:
				myTemperature = Temperature.HOT;
				break;
			case LOW:
				myTemperature = Temperature.WARM;
				break;
			case OFF:
				myTemperature = Temperature.COLD;
			}
		}
	}

	@Override
	public String toString() {
		return mySetting.toString();
	}

	public Temperature getMyTemperature() {
		return myTemperature;
	}

}
