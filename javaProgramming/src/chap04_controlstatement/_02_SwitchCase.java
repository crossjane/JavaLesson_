package chap04_controlstatement;

public class _02_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B"; 
		
		switch(grade) {
			case "A" :
				System.out.println("90점 이상입니다.");
				break;			// 실행문이 실행되면 switch구문을 종료시킨다. switch는 항상 필요함.
			case "B" : 
				System.out.println("80점 이상입니다.");
				break;
			case "C" :
				System.out.println("70점 이상입니다.");
				break;
			case "D" :
				System.out.println("60점 이상입니다.");
				break;
			default : 
				System.out.println("60점 미만입니다.");  // default는 브레이크 필요없음.
		}
		
		System.out.println("----------------");
		
		int num = 129412; 
		
		// num 이 3의 배수이닞 아닌지 switch case 문으로 만들어보기 
		
		switch(num % 3) {
			case 0:
				System.out.println("3의 배수입니다.");
				break;
			default: 
				System.out.println("3의 배수가 아닙니다");
		}
	
		}
		
		
		
		
		
		

		

	}


