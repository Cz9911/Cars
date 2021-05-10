class Main{
  public static void main(String[] args){
    Car car1 = new Car("Red", "Ferrari 218 Spyder", 2021, 500);
    System.out.println(car1);
    Car car2 = new Car("Black", "Custom Porsche RWB", 2021, 397);
    System.out.println(car2);
    Car car3 = new Car("Red", "Ferrari 250 GTO", 1964, 450);
    System.out.println(car3);
    Car car4 = new Car("Red", "Bugatti Divo", 2019, 755);
    System.out.println(car4);
    Car car5 = new Car("Black/Blue", "Bugatti Chiron Supersport", 2019, 748);
    System.out.println(car5);
    car1.accelerate();
    car1.brake();
    car1.newColor("Yellow");
    System.out.println(car1);
    car3.accelerate();
    car3.accelerate();
    car3.brake();
    car3.brake();
    
  }
  
}