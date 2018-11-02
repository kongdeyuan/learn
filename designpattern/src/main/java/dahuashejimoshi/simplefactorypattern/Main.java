package dahuashejimoshi.simplefactorypattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number A : ");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("input operator (+ - * /) : ");
        String oper = sc.nextLine();
        Operation operation = OperatonFactory.createOperation(oper);
        System.out.println("input number B : ");
        double numberB = Double.parseDouble(sc.nextLine());

        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println("result : " + operation.getResult());
    }
}
