package com.javalec.base;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int korean = 0, english = 0 , math = 0; 
		String message1 = "";
		String message2 = "";
		String message3 = "";
		
		
		
		System.out.print("국어 점수를 입력하세요 : ");
		korean 	= scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		english = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math 	= scanner.nextInt();
		
		int average = (korean + english + math) / 3;
		
		System.out.println("평균점수 : " + average);
		
		if(average < korean) {
			message1 = "보다 높습니다.";
		}else if(average == korean) {
			message1 = "입니다.";
		}else {
			message1 = "보다 낮습니다.";
		}
		
		if(average < english) {
			message2 = "보다 높습니다.";
		}else if(average == english) {
			message2 = "입니다.";
		}else {
			message2 = "보다 낮습니다.";
		}
		
		if(average < math) {
			message3 = "보다 높습니다.";
		}else if(average == math) {
			message3 = "입니다.";
		}else {
			message3 = "보다 낮습니다.";
		}
		
		System.out.println("국어 점수는 평균" + message1);
		System.out.println("영어 점수는 평균" + message2);
		System.out.println("수학 점수는 평균" + message3);
	}

}
