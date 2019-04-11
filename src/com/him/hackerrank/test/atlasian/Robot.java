package com.him.hackerrank.test.atlasian;

import java.util.Scanner;

public class Robot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		System.out.println(processCommand(input));

		scanner.close();
	}

	private static String processCommand(String instructions) {
		int[] positions = new int[10];
		int positionOfRobot = 0;
		for (int i = 0; i < instructions.length(); i++) {
			char command = instructions.charAt(i);
			switch (command) {
			case 'P':
				positionOfRobot = 0;
				break;
			case 'M':
				positionOfRobot++;
				break;
			case 'L':
				positions[positionOfRobot] = positions[positionOfRobot] + 1;
				break;

			default:
				break;
			}
		}
		String res = "";
		for (int i : positions) {
			res = res + i;
		}
		return res;
	}

}
