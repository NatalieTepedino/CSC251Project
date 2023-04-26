public class PolicyHolder
{ 
    // data fields
     private String firstName; // Policyholder’s First Name
     private String lastName; // Policyholder’s Last Name
     private int age; // Policyholder’s Age
     private String smokerStatus; // Policyholder’s Smoking Status (smoker/non-smoker)
     private double heightInch; // Policyholder’s Height in inches
     private double weightLbs; // Policyholder’s Weight in pounds
  
   /**
      No-Arg Constructor
   */
   public PolicyHolder()
   {
      firstName = " ";
      lastName = " ";
      age = 0;
      smokerStatus = " ";
      heightInch = 0.0;
      weightLbs = 0.0;
   }
   
   /**
      Constructor
      @param fir for the first name of the policy holder
      @param las for the last name of the policy holder
      @param ag for the age of the policy holder
      @param smoke for the smoker status of the policy holder
      @param height for the height of the policy holder
      @param weight for the weight of the policy holder
   */
   public PolicyHolder(String fir, String las, int ag, String smoke, double height, double weight)
   {
      firstName = fir;
      lastName = las;
      age = ag;
      smokerStatus = smoke;
      heightInch = height;
      weightLbs = weight;      
   }
   
   /*The copy constructor creates a copy of the TextBook class that it is passed as a parameter.
     We use this to avoid secuirty holes.  See Chapter 7 for more information about this.
     @param object2 - the object to copy
   */
   public PolicyHolder(PolicyHolder object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      age = object2.age;
      smokerStatus = object2.smokerStatus;
      heightInch = object2.heightInch;
      weightLbs = object2.weightLbs;
   }
   // SETTERS
   
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
      toString method
      @return - A string containing the policy holder's information
  */ 
  public String toString()
   {
      return String.format("Policyholder's First Name: " + firstName + 
             "\nPolicyholder's Last Name: " + lastName + 
             "\nPolicyholder's Age: " + age +
             "\nPolicyholder's Smoking Status (Y/N): " + smokerStatus +
             "\nPolicyholder's Height: " + heightInch + 
             "\nPolicyholder's Weight: " + weightLbs +
             "\nPolicyholder's BMI: " + getBMI());
   }
}