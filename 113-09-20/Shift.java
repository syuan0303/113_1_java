public class Shift {
    public static void main(String[] args) {
        int number = 1; 
        System.out.printf( "2 的 0 次方: %d%n", number); 
        System.out.printf( "2 的 1 次方: %d%n", number << 1); 
        System.out.printf( "2 的 2 次方: %d%n", number << 2); 
        System.out.printf( "2 的 3 次方: %d%n", number << 3); 
    }
}


// 2->00000010
// 2<< 1->000000100=>4
// 2 <<->0000001000=>8
// 5 ->000000101
// 5 << 1 ->00001010 => 10
// 5 << 2 ->00010100