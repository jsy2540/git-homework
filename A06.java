import java.util.*;
class A06 { 
	public static void main (String[] args) {
	Scanner value=new Scanner(System.in);

	System.out.print("국어 점수를 입력하세요 ");
	int kor=value.nextInt();

	System.out.print("영어 점수를 입력하세요 ");
	int eng=value.nextInt();

	System.out.print("수학 점수를 입력하세요 ");
	int math=value.nextInt();

	double avg =( kor + eng + math )/3.0;
	System.out.println("평균은" + avg+ "입니다.");

	//이런 방법도 있습니다.String hak = "F" if(avg>=95) hak="A+";
	if(avg >= 95){
	System.out.println("학점은 A+ 입니다.");
	}
	
	if(avg >= 90 && avg < 95){
	System.out.println("학점은 A 입니다.");
	} 
	if(avg >= 85 && avg < 90){
	System.out.println("학점은 B+ 입니다.");
	} 
	if(avg >= 80 && avg < 85){
	System.out.println("학점은 B 입니다.");
	} 
	if(avg >= 75 && avg < 80){
	System.out.println("학점은 C+ 입니다.");
	} 
	if(avg >= 70 && avg <75){
	System.out.println("학점은 C 입니다.");
	} 
	if(avg < 70 ){
	System.out.println("학점은 F 입니다.");
	} 
 } 
}

