import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        switch(op){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print(a/b);
                break;
            default:
                System.out.print("Invalid Operator");
        }
    }
}