package Chapter3.inheritance02;

public class 참새 extends 조류 implements 날수있는 {
    참새() {
        myClass = "참새";
    }

    @Override
    public void fly() {
        System.out.println (myClass + "가 날고있네요 ~~^^");
    }
}
