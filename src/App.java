//                             A17 Miles Per Hour
//                             Logan Weisgerber
//                                9/20/2023


import java.util.Scanner;

class App {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); // Scanner

    int d,h,m;

    System.out.print("Enter the distance you\'ve travelled: ");
    d = kb.nextInt(); // sets the var to what the user entered. 
    System.out.print("Enter the hour(s) you\'ve been travelling for: ");
    h = kb.nextInt();
    System.out.println("Enter the minute(s) you\'ve been travelling for: ");
    m = kb.nextInt();

    MPHRunner mph = new MPHRunner();


    mph.setNums(d,h,m); // Sets the nums to the int defined by users. 
    mph.calcMPH(); // calculates speed
    mph.print(); // print function
  }
}