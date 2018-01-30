
public class Burner {
	public enum Temperature{BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2;
	
	public Burner(){
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = new Setting("---");
	}
	
	public void plusButton(){
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
		}
	}
}
