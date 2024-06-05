import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // kaks listi kordinaatide hoidmiseks
        List<Integer> hulknurk1xCoords = new ArrayList<>();
        hulknurk1xCoords.add(6);
        hulknurk1xCoords.add(8);
        hulknurk1xCoords.add(10);

        List<Integer> hulknurk1yCoords = new ArrayList<>();
        hulknurk1yCoords.add(2);
        hulknurk1yCoords.add(5);
        hulknurk1yCoords.add(1);

        // teeb uue hulknurga ja annab talle algkordinaadid
        Hulknurk hulknurk = new Hulknurk(hulknurk1xCoords, hulknurk1yCoords);

        System.out.println(hulknurk.xCoords);
        System.out.println(hulknurk.yCoords);

        // annab uued koordinaadid ja valjastab ymberm66du
        int umbermoot = hulknurk.lisaKoordinaadid(5, 10);
        System.out.println("Hulknurga ümbermõõt: " + umbermoot);
    }
}
