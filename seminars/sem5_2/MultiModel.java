package seminars.sem5_2;

public class MultiModel extends CalcModel{
    public MultiModel() {
        
    }
    // do_it
    @Override
    public double result() {
        
        return x * y;
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
