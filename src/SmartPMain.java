import java.util.*;
public class SmartPMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int nu = in.nextInt();
		
		ConSec a = new ConSec();
		SmartP b = new SmartP();
		
		if (nu <1 || nu>6) {
			System.out.println("메뉴의 숫자를 넣어주세요.");
		} else {
			switch(nu) {
			case 1:
				System.out.println("연락처를 등록하시오.");
				return;
			case 2:
				System.out.println("모든 연락처를 출력합니다.");
				return;
			case 3:
				System.out.println("연락처를 검색합니다.");
				return;
			case 4:
				System.out.println("연락처를 삭제합니다.");
				return;
			case 5:
				System.out.println("연락처를 수정합니다.");
				return;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	public static void printMenu() {	
		System.out.println("Contact-----------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("------------------------------");
	}
}