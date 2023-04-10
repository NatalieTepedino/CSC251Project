/** 
   Project Part 1: Policy Class
*/

public class Policy
{
   // data fields
   private int policyNum; // Policy Number
   private String providerName; // Provider Name
   private String firstName; // Policyholder’s First Name
   private String lastName; // Policyholder’s Last Name
   private int age; // Policyholder’s Age
   private String smokerStatus; // Policyholder’s Smoking Status (smoker/non-smoker)
   private double heightInch; // Policyholder’s Height in inches
   private double weightLbs; // Policyholder’s Weight in pounds
   
   /**
      No-Arg Constructor
   */
   public Policy()
   {
      policyNum = 0;
      providerName = " ";
      firstName = " ";
      lastName = " ";
      age = 0;
      smokerStatus = " ";
      heightInch = 0.0;
      weightLbs = 0.0;
   }
   
   /**
      Constructor
      @param num for the policy num
      @param pronam for the providers name
      @param fir for the first name of the policy holder
      @param las for the last name of the policy holder
      @param ag for the age of the policy holder
      @param smoke for the smoker status of the policy holder
      @param height for the height of the policy holder
      @param weight for the weight of the policy holder
   */
   public Policy(int num, String pronam, String fir, String las, int ag, String smoke, double height, double weight)
   {
      policyNum = num;
      providerName = pronam;
      firstName = fir;
      lastName = las;
      age = ag;
      smokerStatus = smoke;
      heightInch = height;
      weightLbs = weight;      
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
      the setFirstName sets the persons first name
      @param fir their first name  
   */
   public void setFirstName(String fir)
   {
      firstName = fir;
   }
   
   /**
      the setLastName sets the persons last name
      @param las their last name  
   */
   public void setLastName(String las)
   {
      lastName = las;
   }
   
   /**
      the setAge sets the persons age
      @param ag their age  
   */
   public void setAge(int ag)
   {
      age = ag;
   }
   
   /**
      the setSmokerStatus sets the persons smoker status as a string
      @param smoke their smoker status as a string 
   */
   public void setSmokerStatus(String smoke)
   {
      smokerStatus = smoke;
   }
   
   /**
      the setHeightInch sets the persons height in inches
      @param height their height in inches 
   */
   public void setHeightInch(double height)
   {
      heightInch = height;
   }
   
   /**
      the setWeightLbs sets the persons weight in pounds
      @param weight their weight in pounds 
   */
   public void setWeightLbs(double weight)
   {
      weightLbs = weight;
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
      the getFirstName method gets the policyholder's first name
      @return The first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      the getLasttName method gets the policyholder's last name
      @return The last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      the getAge method gets the policyholder's age
      @return The age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      the getSmokingStatus gets the policyholder's smoking status
      @return The persons smoking status
   */
   public String getSmokingStatus()
   {
      return smokerStatus;
   }
   
   /**
      the getHeight method gets the policyholder's height in inches
      @return the persons height
   */
   public double getHeight()
   {
      return heightInch;
   }
   
   /**
      the getWeight method gets the policyholder's weight in pounds
      @return their weight
   */
   public double getWeight()
   {
      return weightLbs;
   }
   
   // METHODS
   
   /**
      the getBMI method gets the BMI of the policyholder
      @return the bmi
   */
   public double getBMI()
   {
      return ((weightLbs * 703) / ((heightInch) * (heightInch)));
   }
   
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