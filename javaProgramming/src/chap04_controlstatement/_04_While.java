package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1~100까지의 합 
		int num = 1; 
		int sum = 0; 
		
		while(num <= 100) {
			sum += num++; 
		}
		System.out.println("1~100 까지의 합:"+ sum);
		
		//2. While문을 이용해서 1~10까지 거꾸로 출력하세요. 
		
		int num1 = 10;
		
		
		while(0 < num1 ) {				//** 나의 오답 : num1<=10
			System.out.println(num1);
			num1--;
			
		}
		
		for(int num2 =10; 0< num2;num2--) {
			System.out.println(num2);
		}
	
		

	}

}
