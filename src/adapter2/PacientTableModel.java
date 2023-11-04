package adapter2;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class PacientTableModel extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] { "Symptom", "Weight" };
	  Vector<Symptom> symptoms= new Vector<Symptom>();
	  public PacientTableModel(Covid19Pacient p) {
	    this.pacient=p;
	    Iterator<Symptom> i =pacient.getSymptoms().iterator();
	    while(i.hasNext()){symptoms.add(i.next());}
	  }
	  
	  
	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return 1;
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  Symptom s=symptoms.get(row);
		  if(col==0){return s.getName();}
		  if(col==1){return pacient.getWeight(s);}
		  return null;
	  }
	}
