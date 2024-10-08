package sys.tem;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int difference;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.difference = max - min + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(difference) + min;
            }
        };
    }
}
