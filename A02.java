import java.util.Scanner;

public class A02 {
	public static void main(String[] args) {
   	Scanner sc = new Scanner(System.in);

	System.out.print("온도를 입력하세요: ");
	double inputdegree = sc.nextDouble();

	
	System.out.print("입력하신 온도가 섭씨온도이면 C를 화씨온도이면 F를 입력하세요.: " );
	String kind = sc.next();

	double outputdegree;
	switch(kind){
	case "C":
	System.out.println("변화된 온도는 " + (1.8 * inputdegree + 32) +" 입니다.");
	break;
	
	case "F":
	System.out.println("변화된 온도는 " + (inputdegree -32)/1.8 +" 입니다.");
	break;
	}
       }
       }
