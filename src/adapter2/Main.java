package adapter2;

import iterator.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor",35);
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 3);
		pacient.addSymptomByName("diarrea", 1);
		ShowPacientTableGUI spt=new ShowPacientTableGUI(pacient);
	}

}
