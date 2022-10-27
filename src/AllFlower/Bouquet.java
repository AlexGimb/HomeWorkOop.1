package AllFlower;

import java.util.Arrays;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public double getCost() {
        double sum = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers != null) {
                sum += flowers[i].getCost();
            }
        }
        return sum + sum * 0.1f;
    }

    public int getLifeSpan() {
        int minLife = Integer.MAX_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null && flowers[i].getLifeSpan() < minLife) {
                minLife = flowers[i].getLifeSpan();
            }
        }
        return minLife;
    }

    @Override
    public String toString() {
        return "Flower.Bouquet{" +
                "flowers=" + Arrays.toString(flowers) +
                '}';
    }
}
