package SaveUpMemory;


import java.awt.Font;

public class FlyweightClient {

    public FlyweightClient() {

        @SuppressWarnings("unused")

        char[] characterArray = new char[326];

        CharacterFactory c = CharacterFactory.getInstance();

        for (int i = 1; i < 55; i++) {
            c.get((char) i);

        }

        Font fontA = FontFactory.getInstance().get("Arial", Font.BOLD, 16);

        Font fontB = FontFactory.getInstance().get("Couriernew", Font.BOLD, 13);

        RunArray runarray = new RunArray();

        runarray.addRun(0, 115, fontA);

        runarray.addRun(115, 211, fontB);

    }

}
