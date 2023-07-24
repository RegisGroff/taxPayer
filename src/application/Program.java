package application;

import entities.Company;
import entities.Individual;
import entities.taxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<taxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i ++){
            System.out.println("Tax payer #" + i +" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();

                taxPayer ind = new Individual(name, annualIncome, healthExpenses);
                list.add(ind);
            }
                else{
                    System.out.print("Number of employees: ");
                    int numberOfEmployees = sc.nextInt();

                    taxPayer comp = new Company(name, annualIncome, numberOfEmployees);
                    list.add(comp);
                }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (taxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.taxPaid()));
        }

        double sum = 0;
        for (taxPayer taxPayer : list){
            sum += taxPayer.taxPaid();
        }
        System.out.println();
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum)); 


        sc.close();
    }
}
