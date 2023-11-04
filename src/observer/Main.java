package observer;

import java.util.Observable;


public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor",	35);
		new	PacientObserverGUI	(pacient);
		new PacientThermometerGUI(pacient);
		new	PacientSymptomGUI	((Covid19Pacient)pacient);
		
		  Observable pacient1=new Covid19Pacient("marta", 27); new PacientObserverGUI
		  (pacient1); new PacientThermometerGUI(pacient1); new PacientSymptomGUI
		  ((Covid19Pacient)pacient1); Observable pacient2=new Covid19Pacient("roberto",
		  22); new PacientObserverGUI (pacient2); new PacientThermometerGUI(pacient2);
		  new PacientSymptomGUI ((Covid19Pacient)pacient2);
		 
	}


}
