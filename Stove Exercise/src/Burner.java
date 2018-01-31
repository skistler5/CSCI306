
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
			break;
		case LOW:
			mySetting.setStatus("-++");
			break;
		case MEDIUM:
			mySetting.setStatus("+++");
			break;
		default:
			break;
		}
	}

	public void minusButton(){	//needs to set timer
		switch(mySetting.getStatus()){
		case HIGH:
			mySetting.setStatus("-++");
			break;
		case MEDIUM:
			mySetting.setStatus("--+");
			break;
		case LOW:
			mySetting.setStatus("---");
			break;
		default:
			break;
		}
	}

	public void updateTempterature() {	//update timer and temp
		
	}

	@Override
	public String toString() {
		return mySetting.toString();
	}

	public Temperature getMyTemperature() {
		return myTemperature;
	}



}
