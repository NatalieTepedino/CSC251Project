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
   
   /** 
      the getPolicyNum method gets the policy number
      @param num
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /**
      the getProviderName method gets the providers name
      @param pronam
   */
   public String getProviderName()
   { 
      return providerName;
   }
   
   /**
      the getFirstName method gets the policyholder's first name
      @param fir
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      the getLasttName method gets the policyholder's last name
      @param las
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      the getAge method gets the policyholder's age
      @param ag
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      the getSmokingStatus gets the policyholder's smoking status
      @param smoke
   */
   public String getSmokingStatus()
   {
      return smokerStatus;
   }
   
   /**
      the getHeight method gets the policyholder's height in inches
      @param height
   */
   public double getHeight()
   {
      return heightInch;
   }
   
   /**
      the getWeight method gets the policyholder's weight in pounds
      @param weight
   */
   public double getWeight()
   {
      return weightLbs;
   }
   
   /**
      the getBMI method gets the BMI of the policyholder
      @param weightLbs
      @param heightInch
   */
   public double getBMI(double weightLbs, double heightInch)
   {
      double bmi;
      
      bmi = ((weightLbs * 703) / (heightInch) * (heightInch));
      
      return bmi;
   }
   
   /**
      the getPolicyPrice method gets the policy price
      @param bmi
      @param ag
      @param smoke
   */
   public double getPolicyPrice(double bmi, int age, String smokerStatus)
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
      
      if (bmi > 35)
      {
         policyPrice += (bmi - 35) * 20;
      }
      
      return policyPrice;
   }
}