package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in the form of (YYYY/MM/DD) : ");
		LocalDate date = LocalDate.of(2012, 8, 15);
		System.out.println("Date is " + date);
		LocalDate currDate = LocalDate.now();
		Period d = Period.between(date, currDate);
		System.out.println("years:" + d.getYears() + " month:" + d.getMonths() + " day :" + d.getDays());

	}

}
