/** 
   Project Part 1: Policy Class
*/

public class Policy
{
   // data fields
   private int policyNum; // Policy Number
   private String providerName; // Provider Name
      
   /**
      No-Arg Constructor
   */
   public Policy()
   {
      policyNum = 0;
      providerName = " ";
   }
   
   /**
      Constructor
      @param num for the policy num
      @param pronam for the providers name
   */
   public Policy(int num, String pronam)
   {
      policyNum = num;
      providerName = pronam;      
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
      
      if (getBMI() > 35)
      {
         policyPrice += (getBMI() - 35) * 20;
      }
      
      return policyPrice;
   }
}