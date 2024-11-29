public class calculator {
    class Operation{
      public int divide(int a, int b){
          return a / b;
      }
    }
    public void performOperation(int a, String operation, int b){
        Operation operation = new Operation();
        switch (operation){
            case "+":
                System.out.println(operation.add(a, b));
            case "-":
                System.out.println(operation.subtract(a, b));
            case "*":
                System.out.println(operation.multiply(a, b));
            case "/":
                System.out.println(operation.divide(a, b));
            default-> System.out.println("不支援此預算");
        }
    }
}
