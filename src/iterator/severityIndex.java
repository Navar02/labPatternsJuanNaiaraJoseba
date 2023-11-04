package iterator;

import java.util.Comparator;

import domain.Symptom;

public class severityIndex implements Comparator<Symptom> {

	@Override
	public int compare(Symptom o1, Symptom o2) {
		// TODO Auto-generated method stub
		return o1.getSeverityIndex()-o2.getSeverityIndex();
	}

}
