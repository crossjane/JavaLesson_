package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _10_HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
			
			for(int j = 0; j < i; j++) {
				if(intList2.get(i) == intList2.get(j)) {
					System.out.println("중복된 값입니다.");
					intList2.remove(i);
					i--;
				}
			}
		}
 		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
																							
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		
		//sumList = 합들의 값 (중복되어있을 수 있음)
		System.out.println(sumList);
		
		//중복된 값제거 해서 sumCnt에 중복된 갯수를 적어줌 ( 나중에 value값으로 출력)
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1; 
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						sumCnt++;
						
					}
				}
			}
			
		
			//if(!intMap.containsKey(String.valueOf(sumList.get(i))))
			intMap.put(String.valueOf(sumList.get(i)), sumCnt);
			
		
		}

		System.out.println(intMap);
		
		//프린트 해야할 것은 sumCnt가 2이상인것들을 제외한 값을 뽑아야함. 
		Set<Entry<String, Integer>> entrySet = intMap.entrySet();
		
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		int cnt = 0;
		
		System.out.print("합이 유일한 합의 값: ");
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			
			if(entry.getValue() ==1 ) {
				System.out.print(entry.getKey() + ", ");
				cnt++;
			}

			
		}

		System.out.println("유일한 합의 개수 : " + cnt);
		
		
		
		
		
		/*
		 * {
		 * 		"3": 1,
		 * 		"4": 2,
		 * 		"5": 2,		 
		 * 		"6": 2,		  		
		 * 		...
		 *      "11": 1
		 * 
		 * */
		
		sc.close();
	
	}

}