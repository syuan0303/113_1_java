public class calcuatorTest {
    class Operation{
        public  int add(int a, int b){
            return a + b;
        }
        public  int subtract(int a, int b){
            return a - b;
        }
        public  int multiply(int a, int b){
            return a * b;
        }
        public int divide(int a, int b){
            return a / b;
        }
    }
    public void performOperation(int a, String operation, int b){
        Operation operation = new Operation();
        System.out.println(operation.add(1, 2));
        System.out.println(operation.subtract(1, 2));
        System.out.println(operation.multiply(1, 2));
        System.out.println(operation.divide(1, 2));
    }
}
