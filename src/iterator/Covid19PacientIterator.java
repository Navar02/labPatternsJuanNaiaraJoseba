package iterator;

import java.util.Iterator;
import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientIterator implements Iterator,InvertedIterator{
	List<Symptom> symptoms;
	int position=0;

	public Covid19PacientIterator(List<Symptom> s) {
		this.symptoms = s;
	}

	@Override
	public boolean hasNext() {
		return position<symptoms.size();
	}

	@Override
	public Object next() {
		Symptom symptom=symptoms.get(position);
		position++;
		return symptom;
	}

	@Override
	public Object previous() {
		position--;
		Symptom symptom=symptoms.get(position);
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position>0;
	}

	@Override
	public void goLast() {
		while(hasNext()) {
			next();
		}
		
	}

}
