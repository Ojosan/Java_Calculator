import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    //creating object for Scanner so we could promt user
    Scanner myObj = new Scanner(System.in);
    boolean exit=false;
    do{
            System.out.print("Enter a number > ");
    String userInput = myObj.nextLine();  
    Double number1=Double.parseDouble(userInput);

    System.out.print("Enter an operator (+, -, *, /) > ");
    String operator = myObj.nextLine();

    System.out.print("Enter a number > ");
    userInput = myObj.nextLine();  
    Double number2=Double.parseDouble(userInput);


    switch(operator) {
      case "+":
      System.out.println(number1 +"+" + number2+"="+(number1+number2));
      break;
      case "-":
      System.out.println(number1 + "-" + number2 + "="+(number1-number2));
        // code block
      break;
      case "*":
     System.out.println(number1 + "*" + number2 + "=" +(number1*number2));
     break;
     case "/":
     System.out.println(number1 + "/" + number2 + "=" +(number1/number2));
     break;
      default:
      System.out.println("Error, " + operator + " isn't an operator");
    }
    System.out.println("Would you like to exit? Enter 'y' for yes and 'n' for no. > ");
    String operator1 = myObj.nextLine();
        if(operator1.equals("y")) {
      exit = true;
    }
    } 
    while (!exit); //if exit = true then exit
    
    System.out.println("Goodbye!");
     

  }
}