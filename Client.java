import java.util.*;

package DCApp;


public class Client implements ClientProfile() {

  // these are the variables needed
	String nameFirst, nameLast, nameCode, DOB;
	char[] nameCodeArray = new char[4];
	double hours;
	ArrayList<Behavior> bxPrograms = new ArrayList<Behavior>();

  // this is a constructor that assigns values and creates the client code from the clients names
  Client(String f, String l, String d,double h) {
    nameFirst = f;
    nameLast = l;
    DOB = d;
    hours = h;

    nameCodeArray[0] = f.charAt(0);
    nameCodeArray[1] = f.charAt(1);
  
    nameCodeArray[2] = l.charAt(0);
    nameCodeArray[3] = l.charAt(1);

    nameCode = new String(nameCodeArray);
	} 

	public void addBx(String t, int b, int g) { 
    bxPrograms.add(new Behavior(t, b, g));
  }

  // this is a method to display client demographics
	public void displayDetails() {
		System.out.println();
		System.out.println(nameFirst + " " + nameLast);
		System.out.println(DOB);
		System.out.println(hours + " hours/week");
		System.out.println();
	}

	public void displayData(int t) {

		
		System.out.print("Program (Progress):\t");
		for (int i = 0; i <= (t-1); i++) {
			System.out.print(t-i + "\t");
		}
		System.out.println();

		for (int j = 0; j < SkillPrograms.length(); j++) {
			Skill sk = SkillPrograms.get(j);
			System.out.print(sk.type + " (" + sk.progress + "): ");
			for (int k = 0; i < t; k++) {
				System.out.print("\t" + sk.data.get(k));
			}
			System.out.println();
		}
}