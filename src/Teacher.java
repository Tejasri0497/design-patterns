public class Teacher implements Observer{

    private String message;

    public Teacher(Data data) {
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
