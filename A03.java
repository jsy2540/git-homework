import java.util.*;

class A03 {

	public static void main (String[] args) {
        Scanner value=new Scanner(System.in);
	System.out.print("날수를 입력하세요.");
			       
	int days=value.nextInt();
	int seconds = days * 24 * 60 *60;
	int m_count = seconds/1000000;

	System.out.println("날수에 해당되는 기간은 모두 " + seconds + "초입니다");
	System.out.println("100만 초가 모두 " + m_count + "번이나 포합됩니다.");
        	}				
	}

