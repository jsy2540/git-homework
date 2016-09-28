import java.util.*;
class A04 {
	public static void main (String[] args) {
	Scanner value=new Scanner(System.in);
	 
	 System.out.print("국어 점수를 입력하세요 ");
	 int kor=value.nextInt();

	 System.out.print("영어 점수를 입력하세요 ");
	 int eng=value.nextInt();

	 System.out.print("수학 점수를 입력하세요 ");
	 int math=value.nextInt();

	 int total = kor + eng + math;
	 int avg =( kor + eng + math )/3;

	 System.out.println("입력하신 점수의 총점은 " + total + "이고");
	 System.out.println("평균은 " +avg+ "입니다.");
	 
	 if(kor > 90){
	 System.out.println("국어 점수가 우수합니다.");
	}
	 if(eng > 90){
	 System.out.println("영어 점수가 우수합니다.");
	}
	 if(math > 90){
	 System.out.println("수학 점수가 우수합니다.");
	}
	 }
	}
		   
