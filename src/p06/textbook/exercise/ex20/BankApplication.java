package p06.textbook.exercise.ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static int size = 0;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
	
	private static Account findAccount(String ano) {
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		
		return null;
	}

	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		// 계좌번호
		System.out.print("계좌번호:");
		String ano = scanner.next();
		// 출금액
		System.out.print("출금액:");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		account.setBalance(account.getBalance() - money);
		
		System.out.println("결과: 출금이 성공되었습니다.");
		
	}

	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		// 계좌번호
		System.out.print("계좌번호:");
		String ano = scanner.next();
		// 예금액
		System.out.print("예금액:");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		account.setBalance(account.getBalance() + money);
		
		System.out.println("결과: 예금이 성공되었습니다.");
		
	}

	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for (int i = 0; i < size; i++) {
			System.out.print(accountArray[i].getAno() + "\t");
			System.out.print(accountArray[i].getOwner() + "\t");
			System.out.println(accountArray[i].getBalance());
		}
	}

	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		// 계좌번호 입력
		System.out.print("계좌번호:");
		String ano = scanner.next();
		// 계좌주 입력
		System.out.print("계좌주:");
		String owner = scanner.next();
		// 초기입금액 입력
		System.out.print("초기입금액:");
		int money = scanner.nextInt();
		
		// Account 객체 생성
		Account newAccount = new Account(ano, owner, money);
		// accountArray 배열에 할당
		accountArray[size++] = newAccount;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	
}






