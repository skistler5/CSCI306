// Authors: Sarah McCabe, Stephen Kistler
// Due: 2/2/18
// Description: Burner Settings

public enum Setting {	//enumerated type
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");	//four setting types
	private String status;	//string representation of current

	//constructor
	Setting(String status){
		this.status = status;
	}

	//getter for setting status
	public String getStatus(){
		return status;
	}

	//called by Burner display
	@Override
	public String toString(){		
		return ("[" + status + "]....." );
	}
}