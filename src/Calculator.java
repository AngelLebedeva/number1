import java.util.Scanner;

public class Calculator {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getInt();
        int secondNumber = getInt();
        char operation = (char) getOperation();
        int result = calculator(firstNumber,secondNumber,operation);
        System.out.println("Результат: "+result);


    }

    public static int getInt() {
        int number;
        System.out.println("Введите число: ");
        if (in.hasNextInt()) {
            number = in.nextInt();

        } else {
            System.out.println("Вы ввели не корректное значение. Попробуйте еще раз");
            number = getInt();
        }
        return number;
    }

    public static int getOperation() {
        char operation;
        System.out.println("Введите вашу операцию: ");
        if (in.hasNext()) {
            operation = in.next().charAt(0);

        } else {
            System.out.println("Вы ввели не корректное значение. Попробуйте еще раз");
             operation= (char) getOperation();
        }
        return operation;
    }
    public static int calculator(int firstNumber, int secondNumber, char operation){
       int result=0;
       switch (operation){
           case '+':
           result =firstNumber+secondNumber;
           break;
           case '-':
               result =firstNumber-secondNumber;
               break;
           case '*':
               result =firstNumber*secondNumber;
               break;
           case '/':
               result =firstNumber/secondNumber;
               break;
            default:
                System.out.println("Вы ввели не корректную операцию. Попробуйте еще раз.");

       }
       return result;

    }

}
