package com.objects.basics1;

public class GradeSystem {
	public static String getGrades(int... marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}

		int average = sum / marks.length;

		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else if (average >= 60) {
			return "D";
		} else if (average >= 50) {
			return "E";
		} else {
			return "Fail";
		}
	}
}
