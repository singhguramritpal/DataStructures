package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
	
	public List<Integer> duplicatesHashMapMethod(List<Integer> list){
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(int num:list){
			if(map.get(num)!=null && map.get(num)){
				result.add(num);
				map.put(num, false);
			} else if(map.get(num) == null){
				map.put(num, true);
			}
		}
		return result;
	}
	
	public List<Integer> duplicatesBruteForceMethod(List<Integer> list){
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++){
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i) == list.get(j) && !result.contains(list.get(i))){
					result.add(list.get(i));
					break;
				}
			}
		}
		
		return result;
	}
	
	public List<Integer> duplicatesSortMethod(List<Integer> list){
		List<Integer> result = new ArrayList<Integer>();
		Collections.sort(list);
		int index=0;
		for(int i=0; i<list.size()-1; i++){
			if(list.get(i) == list.get(i+1)){
				if(result.size() >0 && result.get(index-1) == list.get(i)){
					continue;
				} else{
					result.add(index, list.get(i));
					index++;
				}
			}
		}
		return result;
	}
}