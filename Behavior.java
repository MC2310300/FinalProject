import java.util.Scanner;

package DCApp;

public class Behavior extends Client.Program implements PrgmInterface {

// variables
	int bxBase, bxMid, bxGoal, 3DayAvg;
	ArrayList<int> bxData = new ArrayList<int>();

	progress = stages[0];

// this is a constructor that assigns values & calculates the target behavioral goal from the behavioral baseline frequency
	Behavior(String t, int b, int g) {
		type = t;
		bxBase = b;
		bxGoal = g;

		bxMid = (b*4)/5;
	}


// this is logic to calculate the avg frequency of the bevahior over the last 3 sessions & to set new goal once met over three sessions
	void calc3DayAvg(){
		for (int i = 2; i < bxData.length; i++) {
			3DayAvg = (bxData.get(i) + bxData.get((i - 1)) + bxData.get((i - 2)))/3;

			if (3DayAvg <= bxMid && bxMid != bxGoal) bxMid = (bxMid*4)/5;

			else if (3DayAvg <= bxMid && bxMid == bxGoal) progress == stages[4];
 
			if (bxMid <= bxGoal) bxMid = bxGoal;			
		}
	}

// this method allows the user to input daily data 
	void addData(){
		calc3Day();

		System.println();
		System.println(type + " in " + progress);
		System.out.print("Frequency: ");
		data.add(sc.nextInt());

	}
}