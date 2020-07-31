import java.util.Scanner;

package DCApp;

public class Skill extends Program implements PrgmInterface {

// variables
	final double pgGoal = 0.8;
	double pgBase, 3DayAvg;
	ArrayList<double> trials = new ArrayList<double>();
	ArrayList<double> accurs = new ArrayList<double>();
	ArrayList<double> quot = new ArrayList<double>();

	progress = stages[0];

// this is a constructor that assigns values & calculates the target behavioral goal from the behavioral baseline frequency
	Skill(String t, double b) {
		type = t;
		pgBase = b;
	}

// this is logic to calculate the avg score of the programs over the last 3 sessions 
	void calc3DayAvg() {
		for (int i = 2; i < quot.length; i++) {
			3DayAvg = (quot.get(i) + quot.get((i - 1)) + quot.get((i - 2)))/3;

			// these if-else-if statements to upgrade the progress level once goal is met
			if (3DayAvg >= pgGoal && progress.equals(stages[0])) progress = stages[1];
			else if (3DayAvg >= pgGoal && progress.equals(stages[1])) progress = stages[2];
			else if (3DayAvg >= pgGoal && progress.equals(stages[2])) progress = stages[3];
		}
	}

// this method allows the user to input daily data 
	void addData() {
		calc3Day();

		// this prevents programs in mastery stage from accepting new data
		if (!progress.equals(stages[3])) {
			System.println(type + " in " + progress);
			System.print("Trials ran: ");
			trials.add(sc.nextDouble());
			System.print("Trials performed accurately: ");
			accurs.add(sc.nextDouble());
			quot.add(accurs.get((accurs.size() - 1)/trials.get(trials.size() - 1))*100);
		}
		else
			System.out.println("This skill is mastered.")	
	}
	
}