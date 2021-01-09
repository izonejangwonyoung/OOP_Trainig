package Chapter3.Izone;

public class IzoneDriver {
    public static void main ( String[] args ) {
        Izone yujin = new Izone ();

        yujin.age = 19;
        yujin.name = "안유진";
        yujin.position = "리드보컬";

        yujin.sing ();

        yujin = null;

        Izone chawon = new Izone ();

        yujin.age = 22;
        yujin.name = "김채원";
        yujin.position = "리드보컬";

        chawon.sing ();


    }
}
