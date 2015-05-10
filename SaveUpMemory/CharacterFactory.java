package SaveUpMemory;

import java.util.HashMap;

public class CharacterFactory {

    private HashMap<Character, CharacterFlyweight> characterMap = new HashMap<Character,CharacterFlyweight>();

    private static class CharacterFactoryHolder {

        private static final CharacterFactory INSTANCE = new CharacterFactory();

    }

    public static CharacterFactory getInstance() {

        return CharacterFactoryHolder.INSTANCE;

    }

    CharacterFlyweight get(char unicode) {

        if (!characterMap.containsKey(unicode)) {
            characterMap.put(unicode, new CharacterFlyweight(unicode));

        }

        return characterMap.get(unicode);

    }

}


