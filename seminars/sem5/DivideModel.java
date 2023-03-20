package seminars.sem5;

public class DivideModel extends CalcModel {

    public DivideModel() {
        
    }
    // do_it
    @Override
    public double result() {
        return x / y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }

}

