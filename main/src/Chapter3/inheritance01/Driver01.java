package Chapter3.inheritance01;

public class Driver01 {

    public static void main( String[] args ) {
        animal 동물 = new animal ();
        mammals 포유류 = new mammals ();
        bird 조류 = new bird ();
        whale 고래 = new whale ();
        bat 박쥐 = new bat ();
        treeSparrow 참새 = new treeSparrow ();
        penguin 펭귄 = new penguin ();


        동물.showMe ();
        포유류.showMe ();
        조류.showMe ();
        고래.showMe ();
        박쥐.showMe ();
        참새.showMe ();
        펭귄.showMe ();

    }
}
