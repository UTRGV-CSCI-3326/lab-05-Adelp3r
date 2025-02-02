import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String user_name;
        int user_age;
        double user_weight;
        boolean user_smoker; 

        System.out.println("What is your name?");
        user_name = scanner.nextLine();

        System.out.println("");
        System.out.println("What is your age?");
        user_age = scanner.nextInt();

        System.out.println("");
        System.out.println("What is your weight?");
        user_weight = scanner.nextDouble();

        System.out.println("");
        System.out.println("Do you smoke? (True/False)");
        user_smoker = scanner.nextBoolean();

        System.out.println("");
        System.out.println(user_name);
        System.out.println("Age: " + user_age);
        System.out.println("Weight: " + user_weight);
        System.out.println("Smoker status: " + user_smoker);
    }

}
