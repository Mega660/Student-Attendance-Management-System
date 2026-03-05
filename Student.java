public class Student {
    private int id;
    private String name;
    private int daysPresent;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.daysPresent = 0; 
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void markPresent() {
        daysPresent++;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Days Present: " + daysPresent;
    }
}