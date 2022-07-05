package watr.kata.uniquearray;

import java.util.ArrayList;

public class DuplicateRemover {
	public Integer[] invoke(Integer[] input) {
		ArrayList<Integer> resArr = new ArrayList<>();
		
		for (Integer r : input) {
			if (!resArr.contains(r)){
				resArr.add(r);
			}
		}
		Integer[] arr = new Integer[resArr.size()];
		arr = resArr.toArray(arr);
		
		return arr;
	}
}
