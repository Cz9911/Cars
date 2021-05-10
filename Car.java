class Car {
  //Fields
  private String color;
  private String model;
  private int year;
  private double speed;
  private double hrsPrs;
  //Constructor
  public Car(String color, String model, int year, double hrsPrs){
    this.color = color;
    this.model = model;
    this.year = year;
    this.speed = 0;
    this.hrsPrs = hrsPrs;
  }
  //object methods.

  public void brake(){
   System.out.println("Brake!");
   speed -= 1;
   System.out.println(speed + " MPH"); 
  }

  public void accelerate(){
    System.out.println("Accelerate");
    speed += 1;
    System.out.println(speed + " MPH");
      
  }
  //Getter method
  public String getColor(){
    return color;
  }
  public double getHrsPrs(){
    return hrsPrs;
  }
  //setter method
  public void newColor(String newColor){
    color = newColor;
  }
  //To string!
  public String toString(){
    return "This car is a "+ color + " " + model+ " " + year + " " + hrsPrs;

  }






  }
