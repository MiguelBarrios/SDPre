class Objective3Lab2 {
  public static void main(String[] args){
    double side1, side2, hypotenuse;
    side1 = 10.0;
    side2 = 8.0;

    hypotenuse = Math.sqrt(side1*side1 + side2*side2);
    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);

  }
}
