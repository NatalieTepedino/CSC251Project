/**
   policyDemo for Project Part 1
*/

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_natalie_tepedino
{
   public static void main(String[] args) throws IOException
   {  
   
      int smoker = 0, nonSmoker = 0;
      
      //open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      ArrayList<Policy> accounts = new ArrayList <Policy>();
      
      while (inputFile.hasNext())
      {
        Policy policy1 = new Policy();
       
        policy1.setPolicyNum(Integer.parseInt(inputFile.nextLine()));
        policy1.setProviderName(inputFile.nextLine());
        policy1.setFirstName(inputFile.nextLine());
        policy1.setLastName(inputFile.nextLine());
        
        policy1.setAge(Integer.parseInt(inputFile.nextLine()));
        policy1.setSmokerStatus(inputFile.nextLine());
        policy1.setHeightInch(Double.parseDouble(inputFile.nextLine()));
        policy1.setWeightLbs(Double.parseDouble(inputFile.nextLine()));
        String skipLine = inputFile.nextLine();
        
        accounts.add(policy1);
        
        if (policy1.getSmokingStatus() == "smoker")
        {
            smoker++;
        }
        else
        {
            nonSmoker++;
        }
        
        //output
        System.out.println("Policy Number: " + policy1.getPolicyNum());
        System.out.println("Provider Name: " + policy1.getProviderName());
        System.out.println("Policyholder's First Name: " + policy1.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy1.getLastName());
        System.out.println("Policyholder's Age: " + policy1.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy1.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy1.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy1.getWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %,.2f", policy1.getBMI());
        System.out.println();
        System.out.printf("Policy Price: $%,.2f", policy1.getPolicyPrice(policy1.getAge(), policy1.getSmokingStatus()));
        System.out.println();
        System.out.println();
      }
      
      // close file
      inputFile.close();
      
      System.out.println("The number of policies with a smoker is: " + smoker);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      
      System.exit(0);
   }
}