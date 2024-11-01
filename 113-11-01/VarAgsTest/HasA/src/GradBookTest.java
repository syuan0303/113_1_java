public class GradBookTest {
    public static void  main(String[]args){
        final int NUMBER_OG_STUDENTS=3;
        Student[]students = new Student[NUMBER_OG_STUDENTS];
        students[0] = new Student("A112221009","吳奇隆");
        students[1] = new Student("A11222100","吳奇隆");
        students[2] = new Student("A112221011","吳奇隆");
        GradeBook gradBook = new GradeBook("java程式設計",students,NUMBER_OG_STUDENTS);
        GradeBook.processStudensGradess();
        GradeBook.dispiayMessage();
    }
}
