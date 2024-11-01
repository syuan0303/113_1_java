public class Student {
    private String studentID;
    private String name;

    public Student(){
        new Student("00000000","未知");
    }

    public  Student(String StudentID){
        new Student(studentID,"未知");
    }

    public Student(String StudentID,String name){
        this.studentID = studentID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void printDate(){
        System.out.printf("%s %s",studentID,name);
    }




}
