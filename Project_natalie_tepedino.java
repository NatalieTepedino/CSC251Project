/**
   policyDemo for Project Part 1
*/

import java.util.Scanner;
public class Project_natalie_tepedino
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in); //scanner
      
      // input
      System.out.print("Please enter the Policy Number: ");
      int policyNum = keyboard.nextInt();
      keyboard.nextLine(); // clearing buffer
      System.out.println();
      
      
      System.out.print("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      String firstName = keyboard.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      String lastName = keyboard.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine(); // clearing buffer
      System.out.println();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smokerStatus = keyboard.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      double heightInch = keyboard.nextDouble(); 
      System.out.println();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      double weightLbs = keyboard.nextDouble(); 
      System.out.println();
      
      // intialize information into the policy class
      Policy policy1 = new Policy(policyNum, providerName, firstName, lastName, age, smokerStatus, heightInch, weightLbs);
      
      //output
      System.out.println("Policy Number: " + policy1.getPolicyNum());
      System.out.println("Provider Name: " + policy1.getProviderName());
      System.out.println("Policyholder's First Name: " + policy1.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy1.getLastName());
      System.out.println("Policyholder's Age: " + policy1.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy1.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy1.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy1.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %,.2f", policy1.getBMI(policy1.getWeight(), policy1.getHeight()));
      System.out.println();
      System.out.printf("Policy Price: $%,.2f", policy1.getPolicyPrice(policy1.getBMI(policy1.getWeight(), policy1.getHeight()), policy1.getAge(), policy1.getSmokingStatus()));
      System.out.println();
      
      System.exit(0);
   }
}