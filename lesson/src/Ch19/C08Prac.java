package Ch19;

public class C08Prac {
	
	public static void ShowInfo(Employee emp) {
		// 다운캐스팅을 통해서 parttimer or regular을 선별해서
		// 모든 정보를 출력하는 기능을 사용함.
		emp.show();
	}
	
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);
	}

}
