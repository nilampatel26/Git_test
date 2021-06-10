import java.util.Scanner; // Import the Scanner class

class Difference {
  public static void main(String[] args) {
    int x, y, dif;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input

    dif = x - y;  // Calculate the sum of x + y
    System.out.println("Dif  is: " + dif); // Print the sum
  }
} 