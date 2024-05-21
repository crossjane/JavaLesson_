package chap23_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _05_UsefulMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
		}
		
		// 1. forEach: Stream 요소에 하나씩 접근하여 작성한 코드를 실행
		// Stream에 담겨있는 요소의 개수만큼 코드가 실행된다.
		// 최종단계 메소드이고 리턴 값이 없다.
		intList.stream()
			   .forEach(num -> System.out.println(num));
		
		System.out.println("--------------------------");
		intList.stream()
			   .forEach(num -> {
				   if(num % 2 == 0)
					   System.out.println(num);
			   });
		
	//2. filter: Stream의 요소중 특정 조건에 만족하는 요소들만 모아서 새로운 Stream을 생성
		
		//중간 단계 메소드, 람다식을 구성할때 구현부에 true나 false가 리턴되도록 비교식이나 
		//조건식을 사용한다.
				//5보다 큰 숫자만 모아서 Stream<Integer>형태로 리턴
		
		intList.stream()
				.filter(num -> num > 5)
				.forEach(num -> System.out.println(num));
		System.out.println("--------------------------");
		
		//int 배열 두개 선언해서 
		//첫번째 배열에서 두번째 배열에 있는 값 제거한 후 출력
		//set, filter, forEach사용
		
		
		int[] intArr1 = {1, 5, 6, 9, 8, 1, 10};
		int[] intArr2 = {5, 8, 8, 7, 9, 10, 10};
		
		//set 으로 intArr2에 중복값 제거 
		Set<Integer> intSet = new HashSet<>();
		
		//587910
		for(int num : intArr2) {
			intSet.add(num);
		}
		
		//intArr1 스트림 처리 
		Arrays.stream(intArr1)		
			//intSet에 포함되어 있지 않은 요소만 모아서 Stream<Integer>으로 구성
			.filter(num -> !intSet.contains(num))
			.forEach(num -> System.out.println(num));
		System.out.println("--------------------------");
		
		
		//3. map :실행 코드의 결과값들을 모아서 새로운 Stream을 리턴 
		//새로운 Stream에 담긴 요소들을 리턴해줘야되기 때문에 리턴구문이 필수적이다.
		intList.stream()
				//intList에 담긴 요소들의 제곱들로 구성된 새로운 Stream리턴
				.map(num -> num * num)
				.forEach(num -> System.out.println(num));
		System.out.println("--------------------------");
		
		//intList에 담긴 값 중 짝수는 제곱으로 변경하고 홀수는 값 그대로 리턴해서 새로운
		//스트림을 만들고 forEach로 출력 
		
		intList.stream()
		//소스 코드가 2줄 이상시, 무조건 {}로 람다식 이용해야함.
				.map(num -> {
					if(num % 2 == 0 ) {
						return num * num;
						}
					//map메소드는 무조건 return구문 필수. 
					return num;
					})
  
			   .forEach(num -> System.out.println(num));
		
	//4. reduce : 하나의 결과 값(누적)을 도출하기 위해 사용 
	//최종단계 메소드 
	//reduce(누적값의 초기값, (누적값이 될 변수, 요소를 하나씩 접근할 변수, 요소의 인덱스)  -> 누적값이 누적할 실행코드);
		 
	int sum = intList.stream()
					// 0+ num => acc / num + acc => acc ....10번반복(상단)
					.reduce(0, (acc, num) -> acc + num)
					.intValue(); 
		
		System.out.println(sum);
		
		//intList 요소들을 모두 곱한 값을 구하세요. 
		//stream , reduce메소드 사용 
		
	int mul = intList.stream()
					.reduce(1,(acc,num) -> acc * num)
					.intValue(); 

	System.out.println(mul);
	System.out.println("--------------------------");
	
	//intList에서 짝수는 /2 홀수는 /3한 값들을 모두 더한 값을 구하세요. (map, reduce사용)
	
	int sum2 = 	intList.stream()
				.map (num -> {
					if(num % 2 == 0)
						return num / 2 ; 
					return num / 3; 
				})
				.reduce(0, (ac, n)-> ac + n)
				//배열로 사용하는 방법
				//.reduce({}, (ac, n)-> ac + n)
				.intValue();

	System.out.println(sum2);
	
	
	
//intList.stream()
//			.map (num -> {
//				int result = 0;
//				if(num % 2 == 0) {
//					result = (num / 2); 
//				} else if(num % 2 != 0) {
//					result =  (num /3);
//				}
//				return result;
//			})
//			.reduce(0(ac, n)-> ac + n)
//			.intValue();
		
		
	}

}