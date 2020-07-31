import java.util.Scanner;

package DCApp;

public class WorkAccount {

	String uAttempt, pAttempt, uCorrect, pCorrect;
	int c, t;
	Scanner sc = new Scanner(System.in);

  	Client MaLo = new Client("Marcus","Lopez", "Oct 26, 2012", 9);
  	Client TrTh = new Client("Tricia","Thomas", "Dec 7, 2014", 6);
 	Client WiSi = new Client("William","Singleton", "Aug 29, 2006", 6);
  	Client JaBr = new Client("Jacqueline","Bryant", "Jan 5, 2016", 15);

	WorkAccount(String u, String p) {
		uCorrect = u;
		pCorrect = p;

  		JaBr.addBx("Elopement", 16, 6);
    		JaBr.addBx("Tantrum", 5, 0);
   		JaBr.addBx("Stereotopy", 45, 20);
	}

       	public void ClientCatalog() { 

		String nameCode;

		// loop with validation
		do {
			// menu display
			System.out.println();
			System.out.println("Please enter one of the following client codes or LOGOUT.");
			System.out.println();
			System.out.println("Your Clients:");
			System.out.println("JaBr");
			System.out.println("MaLo");
			System.out.println("TrTh");
			System.out.println("WiSi");
			System.out.println();
			System.out.println("LOGOUT");
			System.out.println();

			// get choice
			nameCode = sc.nextLine();

			switch (nameCode) {
				case "JaBr":
					JaBr.displayDetails();
					ClientOptions(JaBr);
					break;
				case "MaLo":	
					MaLo.displayDetails();
					ClientOptions(MaLo);
					break;
				case "TrTh":
					TrTh.displayDetails();
					ClientOptions(TrTh);
					break;
				case "WiSi":
					WiSi.displayDetails();
					ClientOptions(WiSi);
					break;
				case "LOGOUT":
					System.out.println();			
					break;
				default:
					System.out.println("Invalid choice. Please enter one of the following client codes or LOGOUT.");
			}
		} while (!nameCode.equals("LOGOUT"));

		System.out.println("Thank you, goodbye.");
	}

	public void ClientOptions(Client nameCode) {
		do {
			System.out.println();
			System.out.println("Please enter the corresponding number from the following options:");
			System.out.println("1. Add New Data");
			System.out.println("2. View Previous Data");
			System.out.println("3. Return");
			System.out.println("");
			
			c = sc.nextInt();

			switch (c) {
				case 1:
					System.out.println();
					System.out.println("Add Data");
					
					break;
				case 2:
					System.out.println();
					System.out.println("How many days of previous data would you like to view? Min of 3 days. Max of 14 days.");
					t = sc.nextInt();
					while (t <= 2 || t >= 15) {
						System.out.println("Invaliid choice. Min of 3 days. Max of 14 days.");
						 t = sc.nextInt();
					}
					nameCode.displayData(t);
					break;
				case 3:
					System.out.println();
					break;
				default:
					System.out.println("Invalid choice. Please enter 1, 2 or 3.");
			}
		} while (c != 3);

	}


	public void Login() {
		do {
			System.out.print("Username: ");
			uAttempt = sc.nextLine();
			System.out.print("Password: ");
			pAttempt = sc.nextLine();

			if (!uAttempt.equals(uCorrect) || !pAttempt.equals(pCorrect)) {
				System.out.println("The username/password combination was incorrect. Try again.");
				System.out.println();
			}
		} while(!uAttempt.equals(uCorrect) || !pAttempt.equals(pCorrect));

	ClientCatalog();
	}
}