package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SymptomName implements Comparator<Symptom> {

	@Override
	public int compare(Symptom p1, Symptom p2) {
	
		return p1.getName().compareTo(p2.getName());
	}

}
