package func1lab_oo;

//Danils Grics 161VDB001

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PerfectNumber {
	
	public enum STATE {
		ABUNDANT, DEFICIENT, PERFECT;
	}
	
	public static Set<Integer> divisors(int n) {
		TreeSet<Integer> dalitai = new TreeSet<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				dalitai.add(i);
		}
		return dalitai;
	}

	
	public static STATE process(int n) {
		int suma = 0;
		Set<Integer> tempset = divisors(n);
		Iterator<Integer> temp = tempset.iterator();
		int current;
		
		while(temp.hasNext()) {
			current = (int)temp.next();
			if (current == n)
				break;
			suma += current;
		
		}
		
		if (suma == n)
			return STATE.PERFECT;
		else if (suma > n)
			return STATE.ABUNDANT;
		else
			return STATE.DEFICIENT;

	}

}
