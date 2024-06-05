import java.util.List;

public class Hulknurk {
    
    List<Integer> xCoords;
    List<Integer> yCoords;

    // algkoordinaatidega konstruktor
    public Hulknurk(List<Integer> xCoords, List<Integer> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public int lisaKoordinaadid(int x, int y) {
        xCoords.add(x);
        yCoords.add(y);
        return umbermoot();
    }

    // ümberm66du arvutamine
    private int umbermoot() {
        int umbermoot = 0;
        int punktideArv = xCoords.size();
        for (int i = 0; i < punktideArv; i++) {
            int x1 = xCoords.get(i);
            int y1 = yCoords.get(i);
            int x2 = xCoords.get((i + 1) % punktideArv); // viimase punkti ja esimese punkti vahelise kauguse arvutamiseks
            int y2 = yCoords.get((i + 1) % punktideArv);
            umbermoot += Math.abs(x2 - x1) + Math.abs(y2 - y1); // siin kasutan absoluutväärtust kuna punktid võivad olla ka negatiivsed
        }
        return umbermoot;
    }
}

