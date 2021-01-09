package Chapter3.inheritance01;

public class Driver02 {
    public static void main( String[] args ) {
        animal 동물 = new animal ();
        animal 포유류 = new mammals ();
        animal 조류 = new bird ();
        animal 고래 = new whale ();
        animal 박쥐 = new bat ();
        animal 참새 = new treeSparrow ();
        animal 펭귄 = new penguin ();

        동물.showMe ();
        포유류.showMe ();
        조류.showMe ();
        고래.showMe ();
        박쥐.showMe ();
        참새.showMe ();
        펭귄.showMe ();


    }
};


//드라이버1과 결과가 같다. 이는 최상위 클래스가 동물이기 때문이다. ex) 00초등학교의 1학년이 구성원의 전부이고 그들을 전부 호출해야할 때
//        ====>> 1학년 모이세요~ == 00초등학교 모이세요