package factory;

import domain.Covid19Factory;
import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,new Covid19Factory());
		new PacientSymptomGUI(p1);
		Medicament	m=new Medicament("Ibuprofeno",new Covid19Factory());
		MedicalGUI	mgui=new MedicalGUI(m);

	}

}
