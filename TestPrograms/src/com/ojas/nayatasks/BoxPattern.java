package com.ojas.nayatasks;

public class BoxPattern {
	
	public static String createBoxPattern(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			return "-1"; 
		} else if (rows == 0 || columns == 0) {
			return "-2"; 
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (i == 1 || i == rows || j == 1 || j == columns) {
					sb.append("* ");
				} else {
					sb.append("  ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int rows = 4;
		int columns = 5;
		String boxPattern = createBoxPattern(rows, columns);
		System.out.println(boxPattern);

	}

}
