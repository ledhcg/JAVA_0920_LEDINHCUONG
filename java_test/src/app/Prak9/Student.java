package app.Prak9;

public class Student {
    private Integer Age = 0;
    private Integer INN = null;
    private String Name = null;

    public Student() {

    }

    public Student(Integer Age, Integer INN, String Name) {
        this.Age = Age;
        this.INN = INN;
        this.Name = Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getINN() {
        return INN;
    }

    public void setINN(Integer INN) {
        this.INN = INN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void information() {
        System.out.println("------------------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("INN: " + this.getINN());
        System.out.println("------------------------------------");
    }

    public boolean checkEX() throws StudentNotFoundException, EmptyStringException {
        if (this.INN == null) {
            throw new StudentNotFoundException("INN - Student is not found.");
        } else if (this.Name == null) {
            throw new EmptyStringException("Name - Student is not found.");
        } else {
            return true;
        }
    }
}
