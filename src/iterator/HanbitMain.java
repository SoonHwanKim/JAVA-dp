package iterator;

import java.util.Scanner;

public class HanbitMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HanbitENI hb = new HanbitENI(10); // 총 정원수 10명
		hb.add(new Student("빅테이터", "길동"));
		hb.add(new Student("빅테이터", "유신"));
		hb.add(new Student("빅테이터", "순신"));
		hb.add(new Student("자바", "순환"));
		hb.add(new Student("자바", "준규"));
		hb.add(new Student("자바", "성한"));
		hb.add(new Student("자바", "혜숙"));
		hb.add(new Student("빅테이터", "길동"));
		MyIterator it;
		System.out.println("빅테이터반은 3명이며, 길동, 유신, 순신 학생이 있고..");
		while (true) {
			System.out.println("1.학생추가 2.학생조회(유일한 값이름), 3.학생조회(과목), 4.총학생수, 5. 종료");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("과목명과 학생이름을 입력해주세요.");
			hb.add(new Student(scanner.next(), scanner.next()));
			break;
		case 2:
			
		case 3:
			System.out.println("조회할 과목을 입력하세요");
		case 4:
			
		case 5:
			System.out.println("종료 합니다.");
		default:
			break;
		}
		
		/**
		 * 1. HanbitENI 배열버전
		 * 2. HanbitENI ArrayList 버전
		 * 3. HanbitENI HashMap 버전
		 */
	}
}
}
