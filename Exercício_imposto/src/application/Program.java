package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ioc = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (ioc == 'i') {
				
				System.out.print("Health expenditures: ");
				double expends = sc.nextDouble();
				list.add(new Individual(name, income, expends));
				
			} else {
				
				System.out.println("Number of employees: ");
				int emps = sc.nextInt();
				list.add(new Company(name, income, emps));
				
			}
			
		}
		System.out.println();
		
		System.out.println("Taxes paid: ");
		for (TaxPayer cont : list) {
			
			System.out.println(cont);
			
		}
		System.out.println();
		
		System.out.print("Total taxes: $");
		double sum = 0;
		for (TaxPayer cont : list) {
			
			sum += cont.tax();
			
		}
		
		System.out.printf("%.2f", sum);
		
		sc.close();
	}

}
