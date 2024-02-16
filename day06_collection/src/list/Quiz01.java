package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//5조 2번
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.println(">>");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("연락처를 등록합니다.");
				System.out.println("이름 : ");
				name.add(sc.next());
				System.out.println("연락처 : ");
				num.add(sc.next());
			} else if (menu == 2) {
				System.out.println("확인을 원하는 이름 입력");
				String scname = sc.next();
				if (name.contains(scname) == true) {
					System.out.println("이름 : " + name.get(name.indexOf(scname)) + 
							"번호 : " + num.get(name.indexOf(scname)));
				} else {
					System.out.println("존재하지 않는 이름입니다.");
				}
			} else if (menu == 3) {
				System.out.println("삭제할 이름을 입력하세요");
				String scname = sc.next();
				if (name.contains(scname) == true) {
					name.remove(name.indexOf(scname));
				} else {
					System.out.println("존재하지 않는 이름입니다.");
				}
			} else if (menu == 4) {
				System.out.println("모든 연락처를 출력합니다.");
				for (int i = 0; i < name.size(); i++ ) {
					System.out.println("이름 : " + name.get(i) + ", "+ "연락처 : " + num.get(i));
				}
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}
		
		
//		for (int i = 0; i < name.size(); i++ ) {
//			System.out.println("이름 : " + name.get(i) + ","+"연락처 : " + num.get(i));
//			
//		}
		
		
		
		
//4조 3번
//		ArrayList <Integer> rd = new ArrayList<>();
//		
//		for (int i = 0; i <6; i ++) {
//			rd.add(i, (int)(Math.random()*45+1));
//			for (int j = 0; j < i; j++ ) {
//				if (rd.get(i) == rd.get(j)) {
//					i--;
//					rd.remove(j);
//				}
//			}
//		}
//		rd.sort(null);
//		System.out.println(rd);
		

//4조 2번
//		ArrayList<Integer> num = new ArrayList<>();
//		System.out.println("배열 사이즈 입력");
//		int size = sc.nextInt();
//		for (int i = 0; i < size; i++ ) {
//			num.add(i, (int)(Math.random()*100+1));
//		}
//		num.sort(null);
//		System.out.println(num);
//		System.out.println(num.get(num.size()/2));
		
		
		
		
		
		
//4조 1번
//		ArrayList<Integer> stu1 = new ArrayList<>();
//		ArrayList<Integer> stu2 = new ArrayList<>();
//		ArrayList<Integer> stu3 = new ArrayList<>();
//		ArrayList<Integer> result = new ArrayList<>();
//		
//		for (int i = 0; i < 3; i++ ) {
//			for (int j = 0; j < 3; j++ ) {
//				result.add(j, (int)(Math.random()*100+1));				
//			}
//			if (i == 0) {
//				stu1.addAll(result);
//				result.clear();
//			} else if (i == 1) {
//				stu2.addAll(result);
//				result.clear();
//			} else {
//				stu3.addAll(result);
//				result.clear();
//			}
//		}
//		System.out.println(stu1);
//		System.out.println(stu2);
//		System.out.println(stu3);
//		for (int i = 0; i < 3; i++ ) {
//			if (i == 0) {
//				if (stu1.get(i) > stu2.get(i) && stu1.get(i) > stu3.get(i)) {
//					System.out.println("국어 성적 1등은 첫번째 학생입니다.");
//				} else if (stu2.get(i) > stu1.get(i) && stu2.get(i) > stu3.get(i)) {
//					System.out.println("국어 성적 1등은 두번째 학생입니다.");
//				} else {
//					System.out.println("국어 성적 1등은 세번째 학생입니다.");
//				}
//			}
//			if (i == 1) {
//				if (stu1.get(i) > stu2.get(i) && stu1.get(i) > stu3.get(i)) {
//					System.out.println("영어 성적 1등은 첫번째 학생입니다.");
//				} else if (stu2.get(i) > stu1.get(i) && stu2.get(i) > stu3.get(i)) {
//					System.out.println("영어 성적 1등은 두번째 학생입니다.");
//				} else {
//					System.out.println("영어 성적 1등은 세번째 학생입니다.");
//				}
//			}if (i == 2) {
//				if (stu1.get(i) > stu2.get(i) && stu1.get(i) > stu3.get(i)) {
//					System.out.println("수학 성적 1등은 첫번째 학생입니다.");
//				} else if (stu2.get(i) > stu1.get(i) && stu2.get(i) > stu3.get(i)) {
//					System.out.println("수학 성적 1등은 두번째 학생입니다.");
//				} else {
//					System.out.println("수학 성적 1등은 세번째 학생입니다.");
//				}
//			}
//			
//		}
//		if (stu1.get(0)+stu1.get(1)+stu1.get(2) > (stu2.get(0)+stu2.get(1))+stu2.get(2)
//			&& stu1.get(0)+stu1.get(1)+stu1.get(2) > (stu3.get(0)+stu3.get(1))+stu3.get(2)) {
//			System.out.println("전체 1등은 첫번째 학생입니다.");
//		} else if ( stu2.get(0)+stu2.get(1)+stu2.get(2) > (stu1.get(0)+stu1.get(1))+stu1.get(2)
//			&& stu2.get(0)+stu2.get(1)+stu2.get(2) > (stu3.get(0)+stu3.get(1))+stu3.get(2) ) {
//			System.out.println("전체 1등은 두번째 학생입니다.");
//		} else {
//			System.out.println("전체 1등은 세번째 학생입니다.");
//		}
		
		
		
		
		
		
		
		
		
		
//2조 2번
//		ArrayList<Integer> random = new ArrayList<>();
//		
//		for (int i = 0; i < 20; i++ ) {
//			int rd = (int)(Math.random()*20+1);
//			random.add(i, rd);
//			for (int j = 0; j < i; j++ ) {
//				if (random.get(i) == random.get(j)) {
//					i --;
//					random.remove(j);
//				}
//			}
//		}
//		System.out.println(random);
		
		
		
//2조 1번
//		ArrayList<String> arr = new ArrayList<>();
//		
//		arr.add("김영호");
//		arr.add("박하나");
//		arr.add("김두산");
//		arr.add("이세갑");
//		arr.add("김네고");
//		String str = "";
//		int count = 0;
//		for (int i = 0; i < arr.size(); i ++ ) {
//			String name = arr.get(i);
//			if (name.startsWith("김")) {
//				System.out.println(arr.get(i));
//				count ++;
//			}
//		}
//		System.out.println("김씨는 총 : " + count + "명 입니다.");
		
		
		
		
		
		
		
		
//7조 3번
//		ArrayList<String> arr = new ArrayList<>();
//		while (true) {
//			System.out.println("1. 문자열 입력 : write ");
//			System.out.println("2. 프로그램 종료 : exit");
//			System.out.print("입력 : ");
//			String menu = sc.next();
//			if (menu.equals("write")) {
//				System.out.print("문자열 입력하세요 : ");
//				arr.add(sc.next());
//				System.out.println("저장 된 내용 : " + arr);				
//			} else if (menu.equals("exit")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			
//			
//		}
		
		
		
		
		
		
		
		
		
//7조 1번
//		ArrayList<String> arr = new ArrayList<>();
//		
//		for (int i = 0; i < 4; i++ ) {
//			arr.add(i, sc.next());
//		}
//		for (int i = 0; i < 4; i++ ) {
//			System.out.println(arr.get(i));
//		}
		
		
		
		
//1조 3번
//		ArrayList<String> arr = new ArrayList<>();
//		String search = "";
//		while(true) {
//			System.out.println("1. 유저 정보 입력");
//			System.out.println("2. 유저 정보 검색");
//			System.out.println("3. 유저 정보 수정");
//			System.out.println("4. 유저 정보 삭제");
//			System.out.println("5. 종료");
//			System.out.println("선택해주세요 : ");
//			
//			int menu = sc.nextInt();
//			
//			if (menu == 1) {
//				System.out.println("이름 입력 : ");
//				arr.add(sc.next());
//				System.out.println("아이디 입력 : ");
//				arr.add(sc.next());
//				System.out.println("패스워드 입력 : ");
//				arr.add(sc.next());
//				System.out.println("나이 입력 : ");
//				arr.add(sc.next());
//				System.out.println("주소 입력 : ");
//				arr.add(sc.next());
//				System.out.println("입력이 완료되었습니다.");
//			} else if (menu == 2) {
//				System.out.println("이름 검색 : ");
//				search = sc.next();
//				if (arr.contains(search)) {
//					System.out.println("이름 : " + arr.get(0));
//					System.out.println("아이디 : " + arr.get(1));
//					System.out.println("패스워드 : " + arr.get(2));
//					System.out.println("나이 : " + arr.get(3));
//					System.out.println("주소 : " + arr.get(4));
//				} else {
//					System.out.println("존재하지 않는 이름입니다.");
//				}
//			} else if (menu == 3) {
//				System.out.println("변경할 사용자의 이름 : ");
//				search = sc.next();
//				if (arr.contains(search)) {
//					System.out.println("이름 입력 : ");
//					arr.set(0, sc.next());
//					System.out.println("아이디 입력 : ");
//					arr.set(1, sc.next());
//					System.out.println("패스워드 입력 : ");
//					arr.set(2, sc.next());
//					System.out.println("나이 입력 : ");
//					arr.set(3, sc.next());
//					System.out.println("주소 입력 : ");
//					arr.set(4, sc.next());
//					System.out.println("입력이 완료되었습니다.");
//				} else {
//					System.out.println("존재하지 않는 사용자입니다.");
//				}
//			} else if (menu == 4) {
//				System.out.println("삭제할 사용자 이름 입력 : ");
//				search = sc.next();
//				if (arr.contains(search)) {
//					arr.clear();
//				} else {
//					System.out.println("존재하지 않는 사용자입니다.");
//				}
//			} else if (menu == 5) {
//				System.out.println("종료합니다.");
//				break;
//			} else {
//				System.out.println("잘못 눌렀습니다. 다시 입력하세요");
//			}
//			
//			
//		}

		
		
		
		
//1조 2번
//		ArrayList<String> arr = new ArrayList<>();
//		ArrayList<String> arr1 = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			System.out.print("수 입력 : ");
//			arr.add(i, sc.next());
//		}
//		String result = "";
//		for (int i = 0; i < 5; i++ ) {
//			result = result.concat(arr.get(i));
//		}
//		System.out.println(result);
		
		
		
//1조 1번
//		ArrayList<Integer> lotto = new ArrayList<>();
//		
//		
//		for (int i = 0; i < 6; i++ ) {
//			int rd = (int)(Math.random()*45+1);
//			lotto.add(i, rd);
//			for (int j = 0; j < i; j++) {
//				if (lotto.get(i) == lotto.get(j)) {
//					i--;
//					lotto.remove(j);
//				} 
//			}
//		}
//		lotto.sort(null);
//		System.out.println(lotto);
		
		
		
		
		
		
		
		
		
		
		
//3조 3번
//		ArrayList<Integer> arr = new ArrayList<>();
//		ArrayList<Integer> num1 = new ArrayList<>();
//		ArrayList<Integer> num2 = new ArrayList<>();
//		ArrayList<Integer> num3 = new ArrayList<>();
//		ArrayList<Integer> result = new ArrayList<>();
//		ArrayList<Integer> rd = new ArrayList<>();
//		ArrayList<Integer> rdresult = new ArrayList<>();
//		ArrayList<Integer> tmp = new ArrayList<>();
//		for (int i = 0; i < 3; i++ ) {
//			
//			if (i == 0) {
//				System.out.println("숫자 입력 : ");
//				for (int j = 0; j < 6; j++ ) {
//					num1.add(j, sc.nextInt());
//				}
//			} else if (i == 1) {
//				System.out.println("숫자 입력 : ");
//				for (int j = 0; j < 6; j++ ) {
//					num2.add(j, sc.nextInt());
//				}
//			} else if (i == 2){
//				System.out.println("숫자 입력 : ");
//				for (int j = 0; j < 6; j++ ) {
//					num3.add(j, sc.nextInt());
//				}
//			}
//		}
//		System.out.println("난수 발생 : ");
//		for (int i = 0; i < 6; i++ ) {
//			rd.add(i,(int)(Math.random()*10+1)); 
//			System.out.println("로또 번호 : " + rd.get(i));
//		}
//		int count = 0;
//		int n1count = 0;
//		int n2count = 0;
//		int n3count = 0;
//		for (int i = 0; i < 3; i++ ) {
//			rdresult.addAll(rd);
//			
//
//			if (i == 0) {
//				result = num1;
//			} else if (i == 1) {
//				result = num2;
//			} else {
//				result = num3;
//			}
//			System.out.println(rdresult);
//			System.out.println(rd);
//			
//			for (int j= 0; j < 6; j++ ) {
//				for (int k = 0; k < 6; k++ ) {
//					if (result.get(j) == rdresult.get(k)) {
//						rdresult.set(k, 0);
//						count ++;
//					}
//				}
//			}
//			rdresult.clear();
//			if (i == 0) {
//				n1count = count;
//			} else if (i == 1) {
//				n2count = count;
//			} else {
//				n3count = count;
//			}
//			count = 0;
//		}
//		System.out.println("1이 맞춘 갯수는 : " + n1count);
//		System.out.println("2이 맞춘 갯수는 : " + n2count);
//		System.out.println("3이 맞춘 갯수는 : " + n3count);
//		
//		if (n1count > n2count && n1count > n3count) 
//			System.out.println("가장 많이 맞춘 사람은 : 1번");
//		if (n2count > n1count && n2count > n3count) 
//			System.out.println("가장 많이 맞춘 사람은 : 2번");
//		if (n3count > n1count && n3count > n2count) 
//			System.out.println("가장 많이 맞춘 사람은 : 3번");
//		if (n1count == n2count && n1count > n3count)
//			System.out.println("가장 많이 맞춘 사람은 : 1번,2번");
//		if (n1count == n3count && n1count > n2count)
//			System.out.println("가장 많이 맞춘 사람은 : 1번,3번");
//		if (n2count == n3count && n2count > n1count) 
//			System.out.println("가장 많이 맞춘 사람은 : 2번,3번");
//		if (n2count == n3count && n1count == n3count)
//			System.out.println("가장 많이 맞춘 사람은 : 1번,2번,3번");
			
		
		
		
		
		
		
//3조 2번
//		arrstr.add("1등급");
//		
//		for (int i = 1; i < 4; i++) {
//			System.out.println("이름 입력 : ");
//			String name = sc.next();
//			arrstr.add(i,name);
//			System.out.println("점수 입력 : ");
//			String score = sc.next();
//			arrstr.set(i, arrstr.get(i)+score);
//		}
//		System.out.println(arrstr);
		
		
		
		
		
//3조 1번
//		System.out.println("갯수 입력 : ");
//		int count = sc.nextInt();
//		System.out.println("정수 입력 : ");
//		int num[] = new int[count];
//		int min = 0;
//		int max = 0;
//		for (int i = 0; i < count; i++) {
//			num[i] = sc.nextInt();
//		}
//		max = num[0];
//		for (int i = 0; i < num.length; i ++) {
//			if (num[i] > max) {
//				max = num[i];
//			}
//		}
//		min = max;
//		for (int i = 0; i < num.length; i ++) {
//			if (num[i] < min) {
//				min = num[i];
//			}
//		}
//		System.out.println("최소값 : " + min);
//		System.out.println("최대값 : " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//내문제
//		String str = "null";
//		System.out.print("랜덤 값의 범위 지정 : ");
//		int rd = sc.nextInt();
//		System.out.print("랜덤 값 발생 횟수 지정 : ");
//		int count = sc.nextInt();
//		for (int i = 0; i < count; i++) {
//			arr.add((int)(Math.random()*rd+1));
//			str = arr.get(i) +"";
//			if (i == count-1) {
//				System.out.println(str.charAt(0));
//				break;
//			}
//			System.out.print(str.charAt(0) + ", ");
//		}
//		System.out.println("발생된 랜덤 값 " + arr);
	}
}
