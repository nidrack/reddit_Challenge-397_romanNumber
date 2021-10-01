package application;

import java.util.Scanner;

import entities.Number;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insere ai e bora ver: ");
		String txt = sc.nextLine();
		int a = Number.numCalc(txt);
		txt = sc.nextLine();
		int b = Number.numCalc(txt);
		
		System.out.println(Number.numcompare(a, b));
		
		sc.close();
	}
}
