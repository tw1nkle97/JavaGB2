package homeworks.hw4;

public class Program {
    public static void main(String[] args) {
        Presenter plus = new Presenter(new SumModel(), new View());
        Presenter minus = new Presenter(new MinusModel(), new View());
        Presenter divide = new Presenter(new DivideModel(), new View());
        Presenter multi = new Presenter(new MultiModel(), new View());
    }
    
}
