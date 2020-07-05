/* Exercise 1:  Annual salary.
Monthly Salary 900$
taxes 9%
Calculate the Net Annual Salary and the ammount of taxes. */


import java.util.Scanner;

public class CalculateNetSalary {

public static void main(String[] args){


Scanner in = new Scanner(System.in);

System.out.println("Input your monthly gross salary: ");

float monthlySalary = in.nextFloat();

float percentageOfTaxes = 0.09f;

System.out.println("Your monthly gross salary is " + monthlySalary + "$ and Government taxes you " + (percentageOfTaxes * 100) + "% .");

   netAnnulaIncome(in,monthlySalary,percentageOfTaxes);
   ammountOfTaxes(in,monthlySalary, percentageOfTaxes);
}


//Calculate the ammount of taxes for the year.
public static void ammountOfTaxes(Scanner in,float monthlySalary, float percentageOfTaxes) {
        float taxes = ((12*monthlySalary) * percentageOfTaxes );
        System.out.println("The total ammount of taxes for the Year is: " + taxes + "$");
        
  }

public static void netAnnulaIncome(Scanner in,float monthlySalary, float percentageOfTaxes) {
        float netIncome = ((12*monthlySalary) - (12*monthlySalary) * percentageOfTaxes );
        System.out.println("Your net Annual Salary is: " + netIncome + "$");
        
  }

}

