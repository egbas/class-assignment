import java.util.Random;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        System.out.println("testing");


        Random random = new Random();
        Scanner userInput = new Scanner(System.in);
        int score = 0;
        System.out.println("Enter your name: ");
        String name = userInput.nextLine();

        System.out.println("You're welcome to this test "+ name);

        int x;
        int y;

        x = randomNum();
        y = randomNum();
        System.out.println("what is the sum of "+ x +" + " + y);
        int sum = x + y;
        int userSum = userInput.nextInt();
        System.out.println("My answer is: "+ userSum);
        if (userSum == sum){
            score++;
        }

        x = randomNum();
        y = randomNum();
        System.out.println("what is the product of "+ x +" * " + y);
        int product = x * y;
        int userProduct = userInput.nextInt();
        System.out.println("My answer is: "+ userProduct);
        if (userProduct == product){
            score++;
        }

        x = randomNum();
        y = randomNum();
        System.out.println("what is the difference of "+ x +" - " + y);
        int difference = x - y;
        int userDifference = userInput.nextInt();
        System.out.println("My answer is: "+ userDifference);
        if (userDifference == difference){
            score++;
        }

        x = randomNum();
        y = randomNum();
        System.out.println("what is the quotient of "+ x +" / " + y);
        int quotient = x / y;
        int userQuotient = userInput.nextInt();
        System.out.println("My answer is: "+ userQuotient);
        if (userQuotient == quotient){
            score++;
        }

        x = randomNum();
        y = randomNum();
        System.out.println("what is the remainder of "+ x +" % " + y);
        int remainder = x % y;
        int userRemainder = userInput.nextInt();
        System.out.println("My answer is: "+ userRemainder);
        if (userRemainder == remainder){
            score++;
        }

        System.out.println(name + " Your final score is: "+ score);

    }

    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(1,100);
    }
}
