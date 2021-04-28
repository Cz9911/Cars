class Car {
  //Fields
  private String color;
  private String model;
  private int year;
  //Constructor
  public Car(String color, String model, int year){
    this.color = color;
    this.model = model;
    this.year = year;
  }
  //object methods.

  public void brake(){
   System.out.println("Brake!");
  }
  public void accelerate(){
    System.out.println("Accelerate");
  }
  //Getter method
  public String getColor(){
    return color;
  }
  //setter method
  public void newColor(String newColor){
    color = newColor;
  }
  //To string!
  public String toString(){
    return "This car is a  "+ color + model;

  }






  }
