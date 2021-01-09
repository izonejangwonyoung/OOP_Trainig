package Chapter3.Abstraction02;

public class MouseDriver {

    public static void main( String[] args ) {

        Mouse.countOfTail = 1;


        Mouse mickey = new Mouse ();
        Mouse Jerry = new Mouse ();
        Mouse yujin = new Mouse ();


        System.out.println (Mouse.countOfTail);

        System.out.println (Mouse.countOfTail);

        System.out.println (Mouse.countOfTail);


    }
}
