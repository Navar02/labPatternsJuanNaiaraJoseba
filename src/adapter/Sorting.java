package adapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import domain.Symptom;
import iterator.Covid19PacientIterator;


public class Sorting {
	public static Iterator<Object> sortedIterator(Iterator i, Comparator<Object> comparator) {
	      List<Object> list = new ArrayList<>();
	      ((Covid19PacientIterator) i).goLast();
	      while (((Covid19PacientIterator) i).hasPrevious()) {
	    	  Symptom s= (Symptom)((Covid19PacientIterator) i).previous();
	          list.add(s);
	      }

	      Collections.sort(list, comparator);
	      return list.iterator();
	  }

}
