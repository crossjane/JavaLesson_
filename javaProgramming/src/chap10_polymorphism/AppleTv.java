package chap10_polymorphism;

import chap10_polymorphism.tv.Tv;

public class AppleTv extends Tv {

	@Override 
	public void powerOn() {
		System.out.println("AppleTv");
		super.powerOn();
	}
	
	@Override 
	public void powerOff() {
		System.out.println("AppleTv");
		super.powerOff();
	}
	
	
	//Tv와 AppleTv가 다른 패키지에 속해있기 때문에 
	//defualt 접근제어자로 선언된 operate메소드는 오버라이드할 수 없다. 
//	@Override
//	public void operate(int channel) {
//		
//	}
	
	public void testTv() {
		super.powerOn();
		
		super.powerOff();
		
		//super.operate(11);	default라서	 패키지 달라서 접근 불가 
		
		//super.channelUp();		private라서 접근불가
	}
	
}
