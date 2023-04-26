/** 
   Project Part 1: Policy Class
*/

public class Policy
{
   // data fields
   private int policyNum; // Policy Number
   private String providerName; // Provider Name
   private int id; //to track the number of policy objects
   private PolicyHolder policyHolder; 
      
   /**
      No-Arg Constructor
   */
   public Policy()
   {
      policyNum = 0;
      providerName = " ";
      id = 0;
      policyHolder = new PolicyHolder();
   }
   
   /**
      Constructor
      @param num for the policy num
      @param pronam for the providers name
      @param person the policyholder
   */
   public Policy(int num, String pronam, int i)
   {
      policyNum = num;
      providerName = pronam;
      id = i;      
   }
   
   // SETTERS
   
   /**
      the setPolicyNum sets the policy number
      @param num number   
   */
   public void setPolicyNum(int num)
   {
      policyNum = num;
   }
   
   /**
      the setProviderName sets the policy number
      @param pronam the providers name   
   */
   public void setProviderName(String pronam)
   {
      providerName = pronam;
   }
   
   /**
      the setId sets the id
      @param i (the object counter)
   */
   public void setId(int i)
   { 
      id = i;
   }
   
   /**
      @param person - a PolicyHolder object  
   */  
   
   public void setPolicyHolder()
   {
      policyHolder = new PolicyHolder();
   }
      
   // GETTERS
   
   /** 
      the getPolicyNum method gets the policy number
      @return the policy number
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /**
      the getProviderName method gets the providers name
      @return The providers name
   */
   public String getProviderName()
   { 
      return providerName;
   }
   
   /**
      the getId gets the id
      @returns the id counter
   */
   public int getId()
   { 
      return id;
   }
   
  /**
      getPolicyHolder method
      @return - return a reference to a copy of this course's PolicyHolder object
  */

   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(); 
   }
      
   // METHODS
   
   /**
      the getPolicyPrice method gets the policy price
      @param ag
      @param smoke
      @return the policy price
   */
   public double getPolicyPrice(int age, String smokerStatus)
   {
      double policyPrice;
      
      //intialize policy price with the base price
      policyPrice = 600;
      
      if (age > 50)
      {
         policyPrice += 75;
      }
      
      if (smokerStatus == "smoker" || smokerStatus == "Smoker")
      { 
         policyPrice += 100;
      }
      
      if (policyHolder.getBMI() > 35)
      {
         policyPrice += (policyHolder.getBMI() - 35) * 20;
      }
      
      return policyPrice;
   }
   
   /**
      toString method
      @return - A string containing the policy's information
  */ 
  public String toString()
   {
      return String.format("Policy Number:  " + policyNum + 
             "\nProvider Name: " + providerName + 
             "\nPolicy Price: $%.2f \n", getPolicyPrice(policyHolder.getAge(), policyHolder.getSmokingStatus()));
   }

}