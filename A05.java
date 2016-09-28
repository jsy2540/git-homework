import java.util.*;
class A05 {
	public static void main (String[] args) {
	Scanner value=new Scanner(System.in);

	System.out.print("태어난 년도를 입력하세요 ");
	int birth_year=value.nextInt();

	int age = 2012 - birth_year + 1;

	if(age < 7){
	System.out.println("유아 입니다.");
	}
	if(7 < age && age < 13){
	System.out.println("어린이 입니다.");
 	}
	if(13 <= age && age < 20){
        System.out.println("청소년 입니다.");
	}
	if(20 <= age && age < 30){
        System.out.println("청년 입니다.");
	}

        if(30 <= age && age < 60){
        System.out.println("중년 입니다.");
	}

        if(60 <= age){
	System.out.println("노년 입니다.");				
	}								    
	   }
      }

