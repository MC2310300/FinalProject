package DCApp;

interface ClientProfile {

// this is an outline for a client profile
// these are the variables needed
	String nameFirst, nameLast, nameCode, DOB;
	char[] nameCodeArray = new char[4];
	double hours;

// this method would add skills to the client profile
	public void AddSk();

// this method would add behaviors to the client profile
	public void AddBx();

// this is a method to display client demographics
	public void DisplayDetails();

// this is a method to display prgs/bxs & their data with different durations of time
	public void DisplayData(int t);