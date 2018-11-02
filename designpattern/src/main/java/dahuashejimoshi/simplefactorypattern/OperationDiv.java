package dahuashejimoshi.simplefactorypattern;

public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0D) {
            throw new ArithmeticException("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}
