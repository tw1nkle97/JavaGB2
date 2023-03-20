package homeworks.hw4;

import java.util.Scanner;

public class View{
    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.next();
    }

    public String[] parsing(String expression){
        return expression.split(" ");
    }

    // print(f'{title} = {data}')
    public void print(double data, String title) {
        System.out.printf("%s %.2f\n", title, data);
    }
}
