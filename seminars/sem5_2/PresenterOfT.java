package seminars.sem5_2;

public class PresenterOfT<T extends CalcModel> {
 

    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        String exp = view.getValue("Expression: ");
        view.parsing(exp);
        //model.expression(exp);
        double result = model.result();
        view.print(result, "Result: ");
    }
}
