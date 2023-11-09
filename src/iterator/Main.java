package iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Sorting;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 1), 1);
			p.addSymptom(new Symptom("s2", 10, 3), 2);
			p.addSymptom(new Symptom("s3", 10, 5), 3);
			p.addSymptom(new Symptom("s4", 10, 2), 4);
			p.addSymptom(new Symptom("s5", 10, 8), 5);
			Sorting sort1= new Sorting();
			Iterator i=p.iterator(p.getSymptoms());
			((Covid19PacientIterator) i).goLast();
			System.out.println("Primera vuelta prueba de la clase:");
			while(((Covid19PacientIterator) i).hasPrevious()) {
				Symptom s=(Symptom) ((Covid19PacientIterator) i).previous();
				System.out.println("Name:"+s.getName()+",severity:"+s.getSeverityIndex());
			}
			System.out.println("--------------------------");
			while(i.hasNext()) {
				Symptom s=(Symptom) i.next();
				System.out.println("Name:"+s.getName()+",severity:"+s.getSeverityIndex());
			}
			
			Comparator com1=new SymptomName();
			Iterator i1= sort1.sortedIterator(i, com1);
			System.out.println(" ");
			System.out.println("Segunda vuelta orden por nombre:");
			while(i1.hasNext()) {
				Symptom s=(Symptom) i1.next();
				System.out.println("Name:"+s.getName()+",severity:"+s.getSeverityIndex());
			}
			
			Comparator com2=new severityIndex();
			Iterator i2= sort1.sortedIterator(i, com2);
			System.out.println(" ");
			System.out.println("Tercera vuelta orden por severidad:");
			while(i2.hasNext()) {
				Symptom s=(Symptom) i2.next();
				System.out.println("Name:"+s.getName()+",severity:"+s.getSeverityIndex());
			}
			

		}

	}

