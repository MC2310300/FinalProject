package DCApp;

public interface PrgmInterface {
	
	// set string array & progress equal to initial stage
	String[] stages = new String[] {"INTERVENTION", "FAMILIAR RETENTION", "UNFAMILIAR RETENTION", "MASTERY", "RETENTION"};

	void calc3DayAvg();

	void addData();

}

