package factory;

import domain.Covid19Factory;
import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Factory c=new Covid19Factory();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,c);
		new PacientSymptomGUI(p1);
		Medicament	m=new Medicament("Ibuprofeno",c);
		MedicalGUI	mgui=new MedicalGUI(m);

	}

}
