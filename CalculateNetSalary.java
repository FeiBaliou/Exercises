/* Exercise 1:  Annual salary.
Monthly Salary 900$
taxes 9%
Calculate the Net Annual Salary and the ammount of taxes. */


public class CalculateNetSalary {

   public static void main(String[] args){

   ammountOfTaxes(900, 0.09f);
   netAnnulaIncome(900,0.09f);
}


//Calculate the ammount of taxes for the year.
public static float ammountOfTaxes(int monthlySalary, float percentageOfTaxes) {
        float taxes = ((12*monthlySalary) * percentageOfTaxes );
        System.out.println("The ammount of taxes for the Year is: " + taxes + "$");
        return taxes;
  }

public static float netAnnulaIncome(int monthlySalary, float percentageOfTaxes) {
        float netIncome = ((12*monthlySalary) - (12*monthlySalary) * percentageOfTaxes );
        System.out.println("The net Annual Salary is: " + netIncome + "$");
        return netIncome;
  }

}
