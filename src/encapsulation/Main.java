package encapsulation;

// Fully Encapsulation Program

public class Main {

    // Private Fields
    private String name;
    private int age;
    private String place;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getPlace()
    {
        return place;
    }
    public void setPlace(String place)
    {
        this.place = place;
    }

    public void behaviour()
    {
        System.out.println(getName()+" is a good Person");
    }

    public static void main(String[] args)
    {
        Main m = new Main();

        m.setName("Tom");
        m.setAge(22);
        m.setPlace("Mumbai");

        System.out.println("Name: " + m.getName());
        System.out.println("Age: " + m.getAge());
        System.out.println("Place: " + m.getPlace());

        m.behaviour();

    }
}
