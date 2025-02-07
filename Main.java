
abstract class Apple {
    String variety;

    Apple(String variety) {
        this.variety = variety;
    }

    abstract void taste();

    void showVariety() {
        System.out.println("Apple variety: " + variety);
    }
}

class FujiApple extends Apple {
    FujiApple() {
        super("Fuji");
    }

    @Override
    void taste() {
        System.out.println("Fuji apples are sweet and crisp!");
    }
}

class GrannySmith extends Apple {
    GrannySmith() {
        super("Granny Smith");
    }

    @Override
    void taste() {
        System.out.println("Granny Smith apples are tart and tangy!");
    }
}

public class AppleTest {
    public static void main(String[] args) {
        Apple fuji = new FujiApple();
        Apple grannySmith = new GrannySmith();

        fuji.showVariety();
        fuji.taste();

        grannySmith.showVariety();
        grannySmith.taste();
    }
}
