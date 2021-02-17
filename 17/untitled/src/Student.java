public class Student {
    private  String name;
    private  int age;
    private String rollNo;

    public Student(String name,int age,String rollno){
        this.name = name;
        this.age= age;
        this.rollNo=rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {
        Student student = new Student("Nitesh",22,"2nite23");
        System.out.println("Name is "+student.getName());
        System.out.println("Age is "+ student.getAge());
        System.out.println("Roll.NO is "+student.getRollNo());
    }
}
