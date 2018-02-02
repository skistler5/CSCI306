// Authors: Sarah McCabe, Stephen Kistler
// Due: 2/2/18
// Description: Burner class - individual burner and it's status

public class Burner {
	public enum Temperature{BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2;

	//constructor - off settings
	public Burner(){
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
		timer = 0;
	}

	//raises setting one level up (i.e. warm -> hot)
	public void plusButton(){
		timer = TIME_DURATION;
		switch(mySetting.getStatus()){
		case "---":
			mySetting = Setting.LOW;
			break;
		case "--+":
			mySetting = Setting.MEDIUM;
			break;
		case "-++":
			mySetting = Setting.HIGH;
			break;
		default:
			break;
		}
	}

	//lowers the setting one level down (i.e. warm -> cold)
	public void minusButton(){
		timer = TIME_DURATION;
		switch(mySetting.getStatus()){
		case "+++":
			mySetting = Setting.MEDIUM;
			break;
		case "-++":
			mySetting = Setting.LOW;
			break;
		case "--+":
			mySetting = Setting.OFF;
			break;
		default:
			break;

		}
	}
	public void updateTemperature() {	//update timer and temperature
		if (timer > 1) {	//must be at time 0 to update
			timer --;
		}
		else {
			timer += TIME_DURATION;
			switch(mySetting.getStatus()){	//updates temperature to match burner setting
			case "+++":
				myTemperature = Temperature.BLAZING;
				break;
			case "-++":
				myTemperature = Temperature.HOT;
				break;
			case "--+":
				myTemperature = Temperature.WARM;
				break;
			case "---":
				myTemperature = Temperature.COLD;
				break;
			}
		}
	}

	//show burner status
	@Override
	public String toString() {
		String output = mySetting.toString();
		switch (myTemperature) {
		case BLAZING:
			output += "VERY HOT! DON'T TOUCH"; 
			break;
		case HOT:
			output += "CAREFUL"; 
			break;
		case WARM:
			output += "warm"; 
			break;
		case COLD:
			output += "coooool"; 
			break;
		}
		return output;
	}

	//getter for temperature 
	public Temperature getMyTemperature() {
		return myTemperature;
	}
}


