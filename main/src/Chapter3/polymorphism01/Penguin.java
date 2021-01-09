package Chapter3.polymorphism01;

public class Penguin extends Animal {

    public String habitat;


    public void showHabitat() {

        System.out.printf ("%s는 주로 %s에 많이 살아~", name, habitat);
    }

@Override
    //오버라이딩-재정의: 상위클래스의 메서드와 같은 메섣 이름, 같은 인자 리스트

    public void showName() {
        System.out.println ("어머.. 내 이름은 알아서 뭐하시게??-_-;;");
    }


    // 오버로딩-중복정의: 같은 메서드 이름, 다른 인자 리스트

    public void showName( String yourName ) {
        System.out.printf ("%s 안녕, 나는 %s라고 해~", yourName, name);
    }
}





