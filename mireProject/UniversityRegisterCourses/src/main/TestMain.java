package main;

import java.util.Scanner;

import controller.DBUtill;
import controller.SubjectRegisterManager;
import view.MENU_CHOICE;
import view.MenuViewer;
import view.SUBJECT_CHOICE;

public class TestMain {
	public static Scanner choice = new Scanner(System.in);

	// public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// 메뉴화면함수
		mainMenu();
		System.out.println("The end");
	}

	public static void mainMenu() {
		int choiceNum = 0;
		boolean flagExit = false;

		while (!flagExit) {
			MenuViewer.mainMenuView();
			choiceNum = Integer.parseInt(choice.nextLine());
			switch (choiceNum) {
			case MENU_CHOICE.SUBJECT: // 1. 학과 정보
				subjectMenu();
				// System.out.println("학과 정보 메뉴");
				break;
			case MENU_CHOICE.STUDENT: // 2. 학생 정보

				break;
			case MENU_CHOICE.LESSON: // 3. 과목

				break;
			case MENU_CHOICE.TRAINEE: // 4. 수강신청

				break;
			case MENU_CHOICE.EXIT:

				// 5. 종료
				flagExit = true;
				break;
			default:
				System.out.println("다시 선택해주세여");
			}

		} // end of while
	}

	private static void subjectMenu() {
		int choiceNum = 0;
		// 학과 정보 메뉴
		SubjectRegisterManager srm = new SubjectRegisterManager();
		{
			choiceNum = Integer.parseInt(choice.nextLine());
			switch (choiceNum) {
			case SUBJECT_CHOICE.LIST: // 학과 정보 리스트
				
				break;

			case SUBJECT_CHOICE.INSERT: // 학과 정보 입력

				break;
			case SUBJECT_CHOICE.DELETE: // 학과 정보 수정

				break;
			case SUBJECT_CHOICE.MAIN: // 메인메뉴로 가기
				return;
			default:
				System.out.println("학생정보만 입력하세요.");
			}
		}
	}
}
