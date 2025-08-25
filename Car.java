


import java.util.Scanner;

class Car {
    
    int noOfWheels;
    String color;
    float maxSpeed;
    
    float currentFuelInLitres;
    
    int noOfSeats;
    
    public void drive()
    {
        if( currentFuelInLitres == 0)
        {
           System.out.println("car is out of fuel"); 
        }
        else if(currentFuelInLitres < 5 )
        {
         
         System.out.println("car is in reserved mode !! refuel the car:");   
        }
        else {
        System.out.println("car is driving");
        currentFuelInLitres--;
        }
    }
    
    public void addFuel(float fuel)
    {
        currentFuelInLitres += fuel;
    }
        
      public  float getCurrentFuelLevel()
      {
          return currentFuelInLitres;
      }
      
      public static void main(String[] args)
      {
          Car myCar = new Car();
          myCar.addFuel(6);
          myCar.drive();
           myCar.drive();
            myCar.drive();
            myCar.addFuel(2);
            myCar.drive();
          System.out.print(myCar.getCurrentFuelLevel());
          
          
          
          
      }
}
	 



    
