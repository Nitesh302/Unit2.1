public class Nitesh extends Person{

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setAge(int age) {
this.age=age;
    }

    public static void main(String[] args) {
        Nitesh nitesh = new Nitesh();
        nitesh.setAge(21);
        nitesh.setName("Nitesh");
        nitesh.printDetails();
    }
}
