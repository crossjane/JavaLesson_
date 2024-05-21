package chap24_dataio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _13_FilesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String data = "이름 : 홍길동\n전화번호: 010-1111-1111";
			
			//1. Files클래스의 메소드는 static으로 선언되어있어서 객체 생성 없이 사용가능하지만
			//매개변수로 Path객체 먼저 생성해야한다.
			
			Path path = Paths.get("D:","lecture_jane","java","javaProgramming","src","chap24_dataio", "FilesClass.txt");
			
			//2. 파일 생성 및 데이터 저장 
			Files.writeString(path, data, Charset.forName("UTF-8"));
			
			//3. 파일 타입 출력 
			//.txt = > text/plain
			//.jpg , .jpeg => image/jpeg
			//.gif => image/gif
			//probeContentType(Path객체 ) : 전달받은 Path 객체가 어떤 타입의 파일인지 String 으로 리턴
			System.out.println(Files.probeContentType(path));
			
			//4. size(Path객체) : Path객체의 파일 바이트 단위의 크기를 리턴 
			System.out.println(Files.size(path));
			
			//5. 파일읽기 
			// readString(Path 객체, CharSet): 파일을 지정된 CharSet의 String 으로 리턴
			String content = Files.readString(path, Charset.forName("UTF-8"));
			
			System.out.println(content);
			
			

			
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
			
		}

	}

}