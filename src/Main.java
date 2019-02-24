import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Double num1 = new Double(ask("First number: ", reader));
        char op;
        do{
            op = ask("What operator do you want?: ", reader).charAt(0);
        }while(!(op == '+' || op == '/' || op == '*' || op == '-'));

        Double num2 = new Double(ask("Second number: ", reader));

        System.out.println(getAnswer(num1, num2, op));
    }

    public static Double getAnswer(Double num1, Double num2, char op){
            Double answer = 0.0;
            switch(op){
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    answer = num1 / num2;
                    break;
            }
            return answer;
    }

    public static String ask(String question, Scanner scan){
            System.out.println(question);
            return scan.nextLine();
    }
}