package Chapter3.inheritance01;

public class Driver03 {
    public static void main( String[] args ) {
        animal[] 동물 = new animal[7];
        동물[0] = new animal ();
        동물[1] = new bird ();
        동물[2] = new penguin ();
        동물[3] = new treeSparrow ();
        동물[4] = new bat ();
        동물[5] = new whale ();
        동물[6] = new mammals ();

        for (int index = 0; index < 동물.length; index++) {
            동물[index].showMe ();
        }


    }
}
