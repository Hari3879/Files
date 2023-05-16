package com.ojas.dailytask;

public class shortestRouteInDeviceToConstructGivenString {

	private static void printPath(String str) {
		int x = 0, y = 0;

		for (char c : str.toCharArray()) {
			int X = (c - 'A') / 5;
			int Y = (c - 'A') % 5;

			while (x > X) {
				System.out.print("T");
				x--;
			}

			while (x < X) {
				System.out.print("B");
				x++;
			}

			while (y > Y) {
				System.out.print("L");
				y--;
			}

			while (y < Y) {
				System.out.print("R");
				y++;
			}

			System.out.print("M");
		}
	}

	public static void main(String[] args) {
		String str = "TECHIE";
		printPath(str);
	}
}