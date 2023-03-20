package homeworks.hw4;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        String exp = view.getValue("Expression: ");
        view.parsing(exp);
        model.setX(Double.parseDouble(view.parsing(exp)[0]));
        model.setY(Double.parseDouble(view.parsing(exp)[2]));
        model.setOp(view.parsing(exp)[1]);
        double result = model.result();
        view.print(result, "Result: ");
    }
}