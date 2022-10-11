//1.1 Class declaration
class MyClass {
    int x = 7;
}

//1.2 Class with method
class ClassWithMethod {
    public static void print(String s) {
        System.out.println(s);

    }
    //1.3
}

class PrivateMethod {
    private static void print2(int y) {
        System.out.println(y);
    }
}

//1.5 Public properties, and 1.8 Constructor with arguments
class House {
    public String HouseAdress;
    public int NumberOfRooms;
    public double value;

    public House(String HouseAdress, int NumberOfRooms, double value) {
        this.HouseAdress = HouseAdress;
        this.NumberOfRooms = NumberOfRooms;
        this.value = value;

    }

    public String toString() {
        return ("House is located on " + HouseAdress + ", it has " + NumberOfRooms + " rooms and costs " + value + " dollars.");
    }
}

//1.6
class ClassWithPrivateProperties {
    private String HouseAddress;
    private int NumberOfRooms;
    private double value;

    public ClassWithPrivateProperties(String HouseAddress, int NumberOfRooms, double value) {
        this.HouseAddress = HouseAddress;
        this.NumberOfRooms = NumberOfRooms;
        this.value = value;
    }

    public String toString() {
        return ("House is located on " + HouseAddress + ", it has " + NumberOfRooms + " rooms and costs " + value + " dollars.");
    }
}
//1.7 Demonstrate Setters and Getters
class ClassWithGetter {
    private String name;
    private String lastname;
    private int age;

    public void setName(String s) {
        name = s;
    }

    public void setLastname(String s) {
        lastname = s;
    }
    public void setAge(int n){
        age = n;
    }

    public String getName() {
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
}

public class Project9 {
    int i;

    // 1.4 Class constructor
    public Project9(int n) {
        i = n;
    }

    public static void main(String[] args) {
        MyClass Obj1 = new MyClass(); //object creation
        System.out.println(Obj1.x);
        ClassWithMethod obj2 = new ClassWithMethod();
        obj2.print("print something");
        // PrivateMethod obj3 = new PrivateMethod();
        //obj3.print2(29); //demonstrate error 1.3
        Project9 obj4 = new Project9(6);
        System.out.println(obj4.i);
        House house1 = new House("Green lane 5", 5, 100000);
        System.out.println(house1.toString());
        ClassWithPrivateProperties cl1 = new ClassWithPrivateProperties("Baker street 221", 3, 50000);
        ClassWithGetter obj5 = new ClassWithGetter();
        obj5.setName("Mariia");
        obj5.setLastname("Gordieieva");
        obj5.setAge(17);
        System.out.println("Name: "+obj5.getName()+"\nLast name: "+ obj5.getLastname()+"\nAge: "+obj5.getAge());

    }
}

