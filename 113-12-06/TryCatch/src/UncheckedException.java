public class UncheckedException {
    public static void main(String[] args) {
       int[]numbers = {1, 2, 3};
       try{
       System.out.println(numbers[5]);
       }catch(Exception e){
           System.out.println("處理未檢例外"+e.getMessage());
       }
    }
}
