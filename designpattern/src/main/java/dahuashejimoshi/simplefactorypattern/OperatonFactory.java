package dahuashejimoshi.simplefactorypattern;

public class OperatonFactory {

    public static Operation createOperation(String operate) {
        Operation oper;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new ArithmeticException("运算符错误");
        }
        return oper;
    }
}
