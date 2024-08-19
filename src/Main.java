//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Observer std = new Student(data);
        Observer teacher = new Teacher(data);
        String msg = "Observer Pattern";
        data.setMessage(msg);

        if(!data.getMessage().isEmpty()) {
            data.notifyObservers();
        }
    }
}

