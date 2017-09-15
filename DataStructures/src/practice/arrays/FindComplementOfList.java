package practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindComplementOfList {
	
	public List<Integer> findComplement(List<Integer> list1, List<Integer> list2){
		List<Integer> result = new ArrayList<Integer>();
		
		result.addAll(getComplementaryIntegers(list1, list2));
		result.addAll(getComplementaryIntegers(list2, list1));
		
		return result;
	}
	
	public List<Integer> getComplementaryIntegers(List<Integer> list1, List<Integer> list2){
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		List<Integer> result = new ArrayList<Integer>();
		for(int num: list1){
			map.put(num, true);
		}
		for(int num:list2){
			if(map.get(num) == null){
				result.add(num);
			}
		}
		return result;
	} 
}
