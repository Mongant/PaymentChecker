package handler;

import java.util.Random;

public class PayCheckerHandler {

    public String getRandomStatus() {
        Random random = new Random();
        return random.nextBoolean() ? "COMPLETED" : "ERROR";
    }
}
