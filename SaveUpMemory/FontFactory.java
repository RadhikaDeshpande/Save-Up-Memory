package SaveUpMemory;

import java.awt.Font;
import java.util.HashMap;

public class FontFactory {

    private HashMap<String, Font> fontMap = new HashMap<String, Font>();

    private static class FontFactoryHolder {

        private static final FontFactory INSTANCE = new FontFactory();

    }

    public static FontFactory getInstance() {

        return FontFactoryHolder.INSTANCE;

    }

    Font get(String fontName, int fontStyle, int fontSize) {

        final String FONT_KEY = fontName + fontSize + fontStyle;

        if (!fontMap.containsKey(FONT_KEY)) {

            fontMap.put(FONT_KEY, new Font(fontName, fontStyle, fontSize));

        }

        return fontMap.get(FONT_KEY);

    }

}


