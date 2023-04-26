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
      int counter = 0;
      
      //open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      ArrayList<Policy> accounts = new ArrayList <Policy>();
      
      while (inputFile.hasNext())
      {
        Policy policy1 = new Policy();
       
        policy1.setId(counter);
        
        policy1.setPolicyNum(Integer.parseInt(inputFile.nextLine()));
        policy1.setProviderName(inputFile.nextLine());
        policy1.getPolicyHolder().setFirstName(inputFile.nextLine());
        policy1.getPolicyHolder().setLastName(inputFile.nextLine());
        
        policy1.getPolicyHolder().setAge(Integer.parseInt(inputFile.nextLine()));
        policy1.getPolicyHolder().setSmokerStatus(inputFile.nextLine());
        policy1.getPolicyHolder().setHeightInch(Double.parseDouble(inputFile.nextLine()));
        policy1.getPolicyHolder().setWeightLbs(Double.parseDouble(inputFile.nextLine()));
       
        if (inputFile.hasNext())
        { 
            inputFile.nextLine();
        }
        
        accounts.add(policy1);
       
       
        if (policy1.getPolicyHolder().getSmokingStatus().equals("smoker"))
        {
            smoker++;
        }
        else
        {
            nonSmoker++;
        }
        
        counter++;
      }
      
      // close file
      inputFile.close();
      
      for(int i=0; i < accounts.size(); i++)
      {
         System.out.println(accounts.get(i));//notice how the toString() method does not need to be explicitly called when printing out information of our Course class
         System.out.println(accounts.get(i).getPolicyHolder().toString());
         System.out.println();//print a blank line between Courses for easier readability
      }
      
      System.out.println("There were " + counter + "Policy objects created");
      System.out.println("The number of policies with a smoker is: " + smoker);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      
      System.exit(0);
   }
}