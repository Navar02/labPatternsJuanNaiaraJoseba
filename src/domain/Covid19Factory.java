package domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Covid19Factory {
	private Map<String, Symptom> symptomMap;
	public Covid19Factory() {
		symptomMap= new HashMap<>();
	}

	public Symptom createSymptom(String symptomName) {
		if(symptomMap.containsKey(symptomName)) {
			System.out.println("Symptoma YA creado, devolviendo:"+symptomName);
			return symptomMap.get(symptomName);
		}
		List<String> impact5 = Arrays.asList("fiebre", "tos seca", "astenia", "expectoracion");
		List<Double> index5 = Arrays.asList(87.9, 67.7, 38.1, 33.4);
		List<String> impact3 = Arrays.asList("disnea", "dolor de garganta", "cefalea", "mialgia", "escalofrios");
		List<Double> index3 = Arrays.asList(18.6, 13.9, 13.6, 14.8, 11.4);
		List<String> impact1 = Arrays.asList("nauseas", "vómitos", "diarrea", "congestión nasal", "hemoptisis",
				"congestion conjuntival","mareos");
		List<Double> index1 = Arrays.asList(5.0, 4.8, 3.7, 0.9, 0.8, 0.5, 0.6);
		int impact = 0;
		double index = 0;
		if (impact5.contains(symptomName)) {
			impact = 5;
			index = index5.get(impact5.indexOf(symptomName));
		} else if (impact3.contains(symptomName)) {
			impact = 3;
			index = index3.get(impact3.indexOf(symptomName));
		} else if (impact1.contains(symptomName)) {
			impact = 1;
			index = index1.get(impact1.indexOf(symptomName));
		}
		if (impact != 0) {
			System.out.println("Symptoma NO creado, se añade:"+symptomName);
			symptomMap.put(symptomName, new Symptom(symptomName, (int) index, impact));
			return symptomMap.get(symptomName);
		}else {
			return null;
		}
	}

}
