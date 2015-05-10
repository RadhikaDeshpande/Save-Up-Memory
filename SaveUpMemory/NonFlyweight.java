package SaveUpMemory;

import java.awt.Font;

public class NonFlyweight {

    private Character[] characterArray = new Character[326];

    public NonFlyweight() {

        for (int i = 0; i < 326; i++) {
            characterArray[i] = new Character((char) i);

        }

        for (int i = 0; i < 326; i++) {
            new Font("Arial", Font.BOLD, 16);

        }

    }

}



