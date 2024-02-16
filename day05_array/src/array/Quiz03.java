package array;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//4조 2번
//		int num[] = new int[] {-1, 5, 3, 9, -50};
//		int tmp = 0;
//		int arr[] = new int[5];
//		int result = 0;
//		
//		for (int i = 0; i < num.length; i++ ) {
//			for (int j = i+1; j < num.length; j++ ) {
//				if (num[i] > num[j]) {
//					result = num[i];
//					num[i] = num[j];
//					num[j] = result;
//				}
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
		
		
		
//2조 3번
//		int arr[] = new int [] {12,45,64,24};
//		int max = 0;
//		int sum = 0;
//		for (int i = 0; i < arr.length; i ++) {
//			sum = sum + arr[i];
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값은 : " + max);
//		System.out.println("값의 합은 : " + sum);
		
		
		
		
		
		
		
//2조 4번
//		int num[] = new int[10];
//		
//		for (int i = 0; i < 10; i ++) {
//			num[i] = sc.nextInt();
//		}
//		for (int i = 0; i < num.length;i ++ ) {
//			if (num[i] % 3 == 0) {
//				System.out.println("3의 배수는 " + num[i]);
//			}
//		}
		
		
		
//2조 1번		
//		System.out.println("횟수 입력 : ");
//		int num = sc.nextInt();
//		int arr[] = new int[15];
//		int sum[] = new int[num];
//		for (int j = 0; j < num; j++) {
//			System.out.println("수 입력 : ");
//			int count = sc.nextInt();				
//			for (int i = 1; i <= count; i ++) {
//				if (i == 1) {
//					arr[i] = 1;
//				} else if (i == 2) {
//					arr[i] = 2;
//				} else if (i == 3) {
//					arr[i] = 4;
//				} else {
//					arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
//				}
//				sum[j] = arr[i];
//			}
//		}
//		for (int i = 0; i < num; i++) {
//			System.out.println(sum[i]);
//		}
		
		
		
		
		
//5조 3번
//		int count = 0;
//		while(true) {
//			System.out.println("=====up&down=====");
//			System.out.println("1. 게임 시작");
//			System.out.println("2. 기록 확인");
//			System.out.println("3. 게임 종료");
//			System.out.println("번호를 선택하시오 : ");
//			int menu = sc.nextInt();
//			
//			
//			if (menu == 1) {
//				count = 0;
//				int rd = (int)(Math.random()*100+1);
//				while(true) {
//					System.out.println("정답 입력 : ");
//					int rd1 = sc.nextInt();
//					if (rd1 == rd) {
//						System.out.println("정답 !!!");
//						break;
//					} else if (rd1 > rd) {
//						System.out.println("Down");
//					} else  {
//						System.out.println("Up");
//					}
//					count ++;
//				}
//			} else if (menu == 2) {
//				System.out.println("이전 기록은 " + count + "회 입니다.");
//				continue;
//			} else {
//				System.out.println("게임 종료");
//				break;
//			}
//		}
		
		
		
		
		
//5조 2번
//		int a[] = new int[10];
//		int max = 0;
//		int min = 0;
//		for (int i = 0; i < a.length; i ++) {
//			a[i] = (int)(Math.random()*10)+1;
//			System.out.println(a[i]);
//			if (a[i] > max) {
//				max = a[i];
//				min = max;
//			} 
//		}
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] < min) {
//				min = a[i];
//			}
//		}
//		System.out.println("최대 값 : " + max);
//		System.out.println("최소 값 : " + min);
		
		
		
		
		
		
		
		
		
		
		
		
////5조 1번
//		int a[] = new int[] {60,70,20,50,80};
//		int max = 0;
//		int result = 0;
//		for (int i = 0; i < a.length; i ++) {
//			if (a[i] > max) {
//				max = a[i];
//			}
//		}
//		for (int i = 0; i < a.length; i ++ ) {
//			if (max == a[i]) {
//				result = i;
//			}
//		}
//		System.out.println("최대 값은 " + max);
//		System.out.println("인뎃스 값은 " + result);
		
		
		
		
		
		
		
		
		
//7조 3번
//		int [] a = new int[] {5,11,9,3,7,-1};
//		int tmp = 0;
//		int max = 0;
//		int min = 0;
//		for (int i = 0; i < a.length; i ++) {
//			if (a[i] > max) {
//				max = a[i];
//			}
//		}
//		min = max;
//		for (int i = 0; i < a.length; i ++) {
//			if (a[i] < min) {
//				min = a[i];
//			}
//		}
//		System.out.println("최대값 : " + max + "\n최소값 : " + min);
		
		
		
		
//7조 2번
//		int a[] = new int[] {10,100,1000,10000,100000};
//		int b[] = new int[] {90,900,9000,90000,900000};
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i] + b[i];
//		}
//		System.out.println(sum);
//		
		
		
		
//7조 1번
//		int sum = 0;
//		int hap = 0;
//		System.out.print("배열 인덱스 수를 입력하세요 : ");
//		int index = sc.nextInt();
//		System.out.println("짝수, 홀수 입력 : ");
//		String str = sc.next();
//		int [] arr = new int[index];
//		for (int i = 0; i < arr.length; i ++) {
//			System.out.println("배열의 arr[" + i + "] 번째 정수 입력 : ");
//			arr[i] = sc.nextInt();
//			sum = sum + arr[i];
//			
//			if (str.equals("짝수") && arr[i] % 2 == 0) {
//				hap = hap + arr[i];
//			} else if (str.equals("홀수") && arr[i] % 2 != 0){
//				hap = hap + arr[i];
//			}
//		}
//		System.out.println("배열의 전체 합 : " + sum);
//		System.out.println(str + "의 합 : " +hap);
		
		
		
//3조 3번
//		int num[] = new int[] {40,20,30,10,50,34,5,64,23};
//		int max = 0;
//		
//		for (int i = 0; i < num.length; i ++) {
//			if (num[i] > max) {
//				max = num[i];
//			}
//		}
//		System.out.println("가장 높은 수 = " + max);		
//		for (int i = 0; i < num.length; i ++) {
//			if (num[i] == max) {
//				System.out.println(i + "번째 ");
//			}
//		}
//		
		
		
		
//3조 2번
//		Random rd = new Random();
//		int can[] = new int[5];
//		int sum = 0;
//		
//		for (int i = 0; i < can.length; i ++ ) {
//			can[i] = rd.nextInt(9)+1;
//			System.out.println((i+1) + "번째 학생이 가져온 사탕 = " + can[i]);
//			sum = sum + can[i];
//		}
//		System.out.println("사탕의 총 갯수 = " + sum);
//		System.out.println("각 학생이 받을 사탕 = " + (sum/5));
		
		
		
		
		
		
//1조 3번
//		int num[] = new int[] {1,2,3,4,5,6,7,8,9,10};
//		int mun[] = new int[10];
//		
//		for (int i = 0; i < num.length; i ++) {
//			mun[i] = num[num.length-1-i];
//		}
//		for (int i : mun) {
//			System.out.println(i);
//		}
//		
		
//1조 2번
//		String name[] = new String[5];
//		int jumsu[][] = new int[5][3];
//
//		String sub[] = new String[] {"국어", "영어", "수학"};
//		while(true) {
//			System.out.println("1. 이름 입력");
//			System.out.println("2. 성적 입력");
//			System.out.println("3. 성적 출력");
//			System.out.println("4. 종료");
//			System.out.println("선택해주세요 : ");
//			
//			int menu = sc.nextInt();
//			
//			if (menu == 1) {
//				while(true) {
//					System.out.println("1. 모두 입력하시겠습니까?");
//					System.out.println("2. 이름을 수정하시겠습니까?");
//					System.out.println("3. 이 전 메뉴로 이동");
//					System.out.println("선택해주세요 : ");
//					menu = sc.nextInt();
//					if (menu == 1) {
//						System.out.println("이름을 입력해주세요");
//						for(int i = 0; i < name.length; i ++) {							
//							System.out.print((i+1) + " 번째 이름 : ");
//							name[i] = sc.next();
//						}
//					} else if (menu == 2) {
//						for (int i = 0; i < name.length; i ++ ) {
//							System.out.println((i+1) + ". " + name[i]);
//						} 
//						System.out.println("6. 이전 메뉴로 이동(수정 취소)");
//						menu = sc.nextInt();
//						while(true) {
//							if (menu > 0 && menu <= 5) {
//								System.out.println(menu + "번 학생을 수정합니다.");
//								name[menu-1] = sc.next();
//								System.out.println("변경 된 내용을 출력합니다. \n" + menu + "번 학생 : " + name[menu-1]);
//								System.out.println();
//								break;
//							} else if (menu == 6) {
//								System.out.println("이름 수정 취소. 이 전 메뉴로 돌아갑니다.");
//								break;
//							} else {
//								System.out.println("잘못된 입력입니다. 다시 입력해주세요");
//								continue;
//							}							
//						}
//					} else if (menu == 3) {
//						System.out.println("이 전 메뉴로 돌아갑니다.");
//						break;
//					}
//				}
//			} else if (menu == 2) {
//				System.out.println("1. 모든 학생의 성적을 입력하시겠습니까?");
//				System.out.println("2. 한 명의 학생 성적을 수정하시겠습니까?");
//				menu = sc.nextInt();
//				if (menu == 1) {
//					System.out.println("모든 학생의 성적을 입력합니다.");					
//					for(int i = 0; i < name.length; i ++ ) {
//						System.out.println((i+1) + "번째 학생 : " + name[i]);
//						for (int j = 0; j < jumsu[i].length; j++) {
//							System.out.print(sub[j] + " 점수를 입력해주세요 : ");
//							jumsu[i][j] = sc.nextInt();
//						}
//					}
//				} else if (menu == 2) {
//					System.out.println("한 명의 학생 성적을 수정합니다.");
//					for(int i = 0; i < name.length; i ++ ) {
//						System.out.println((i+1) + "번째 학생 : " + name[i]);
//					}
//					System.out.println("원하는 학생 번호를 입력하세요 : ");
//					menu = sc.nextInt();
//					if (menu > 0 && menu <=5) {
//						System.out.println(menu + "번째 학생 성적을 수정합니다.");
//						for(int i = 0; i < jumsu[i].length; i ++ ) {
//							System.out.println((i+1) + "번째 학생 : " + name[i] + "의 점수를 입력해주세요 : ");
//							jumsu[menu-1][i] = sc.nextInt();
//						}
//					}
//				}
//			} else if (menu == 3) {
//				System.out.println("성적을 출력합니다.");
//				for (int i = 0; i < name.length; i ++) {
//					System.out.println((i+1) + "번째 이름" + name[i]);
//					for (int j = 0; j < jumsu[j].length; j++) {
//						System.out.print(sub[j] + ":" + jumsu[i][j] + "/");
//					}
//					System.out.println();
//				}
//				System.out.println();
//			} else if (menu == 4) {
//				System.out.println("시스템을 종료 합니다.");
//				break;
//			}
//			
//		}
		
		
		
		
		
//1조 1번
//		String arr[] = new String[] {"a", "b", "c", "d", "e"};
//		String arr1[] = new String[5];
//		int a = 1;
//		for (int i = 0; i < arr.length; i++ ) {
//			arr1[i] = arr[arr.length-a];
//			a++;
//		}
//		for (String arr2 : arr1) {
//			System.out.println(arr2);
//		}
//		
		
		
		
		
		
		
//내 문제
		
//		System.out.print("입력 : ");
//		int [] big = new int[5];
//		
//		int [] a = new int[5];
//		for (int i = 0; i < a.length; i ++ ) {
//			a[i] = sc.nextInt();
//		}
//		// 1 2 3 4 5
//		int tmp;
//		for (int i = 0; i < a.length; i ++ ) {
//			for (int j = i + 1; j < a.length; j++ ) {
//				if (a[j] > a[i]) {
//					tmp = a[j];
//					a[j] = a[i];
//					a[i] = tmp;
//					
//				}
//			}
//			System.out.println(i+1 + "번째 : " + a[i]);
//		}
	}
}
