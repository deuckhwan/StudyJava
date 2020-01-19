package sec02.exam05;

public class CharOperatorExample {

	public static void main(String[] args) {
		
		System.out.println("*********** 타 입 의 산 술 연 산  ***************");
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		//char c3 = c2 + 1;  컴파일 에러 c2는 클래스 파일로 저장된 값은 정수 타입으로 대입해야됨
		int c3 = c2 + 1;
		
		System.out.println("\tc1 : " + c1);
		System.out.println("\tc2 : " + c2);
		System.out.println("\tc3 : " + c3);
		
		System.out.println("****************************************");
	}

}
