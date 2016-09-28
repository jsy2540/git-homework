import java.util.*;
class A01{
	 int age;
	 public static void main(String[] s) {
	 new A01().start();
	}
	 void start()
	 {
	 	Scanner s=new Scanner(System.in);
		System.out.print("테어난 년도를 입력하세여 :");
		int year = s.nextInt();
		this.age = 2016 - year + 1;
		print();	
		
	 }
	 void print()
	 {
	 
	 	if(this.age < 20)
			System.out.print("미성년자입니다.");
			
		else
			System.out.print("미성년자가 아닙니다.");
		}
		
	}

