public abstract class Person {
    public String name;
    public int age;
    public abstract void setName(String name);
    public abstract void setAge(int age);
    public void printDetails(){
        System.out.println("Name of the person is "+name);
        System.out.println("Age of the person is "+age);
    }

}
