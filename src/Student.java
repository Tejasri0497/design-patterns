public class Student implements Observer{
    private String message;
    public Student(Data data) {
        data.registerObserver(this);
    }

    public void update(String message) {
        this.message = message;
        display();
    }

    public void display() {
        System.out.println(this.message);
    }
}
