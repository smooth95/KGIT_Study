package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String name = "";
		int price = 0;

		while (true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println(">>");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.print("메뉴 입력 : ");
				name = sc.next();
				if (map.containsKey(name) == true) {
					System.out.println("존재하는 메뉴 입니다.");
					continue;
				} else {
					map.put(name, 0);
					System.out.print("가격 입력 : ");
					map.put(name , sc.nextInt());
					System.out.println("등록 되었습니다.");					
				}
			} else if (num == 2) {
				Iterator<String> it = map.keySet().iterator();
				while(true) {
					if (map.size() >=1 ) {
						System.out.println("전체 메뉴");
						for (; it.hasNext(); ) {
							String key = it.next();
							System.out.println(key + ":" + map.get(key));
						}						
					}
					it = map.keySet().iterator(); 
					System.out.println();

					System.out.println("1. 수정 2. 삭제 3. 나가기");
					System.out.println(">>");
					num = sc.nextInt();
					if (num == 1) {
						if (map.size() > 0 ) {
							System.out.println("수정할 메뉴 이름을 입력하세요");
							name = sc.next();
							if (map.containsKey(name) == true) {
								System.out.println("수정할 가격을 입력하세요");
								price = sc.nextInt();
								System.out.println(map.get(name) + " -> " + price);
								map.put(name, price);
								System.out.println("변경 됐습니다.!");
								System.out.println();

							} else {
								System.out.println("없는 메뉴입니다.");
							}							
						} else {
							System.out.println("메뉴가 아무것도 없습니다.");
						}
					} else if (num == 2) {
						if (map.size() > 0) {
							System.out.print("삭제하실 메뉴 이름을 입력하세요");
							name = sc.next();
							if (map.containsKey(name) == true) {
								map.remove(name);
								System.out.println("삭제되었습니다.");
							}							
						} else {
							System.out.println("메뉴가 아무것도 없습니다.");
						}
					} else if (num == 3) {
						System.out.println("수정을 종료합니다. \n");
						break;
					} else {
						System.out.println("잘못 눌렀습니다. 다시 입력하세요. \n");
					}

				}
			} else if (num == 3) {
				System.out.println("프로그램을 종료합니다. \n");
				break;
			} else {
				System.out.println("잘못 눌렀습니다. 다시 입력하세요 \n");
			}
		}
	}
}
