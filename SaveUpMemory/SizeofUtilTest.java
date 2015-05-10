package SaveUpMemory;

import static org.junit.Assert.*;

import java.awt.Font;

import org.junit.Test;

public class SizeofUtilTest {

    @Test

    public void testHeaderSize() {

        assertEquals(16.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            CharacterFlyweight obj = null;

            @Override

            protected int create() {

                obj = new CharacterFlyweight('\u0070');

                return 1;

            }

        }.averageBytes(), 0);

        assertEquals(72.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            Font obj = null;

            @Override

            protected int create() {

                obj = new Font("Arial", Font.BOLD, 16);

                return 1;

            }

        }.averageBytes(), 0);

        assertEquals(64.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            CharacterFactory obj = null;

            @Override

            protected int create() {

                obj = new CharacterFactory();

                return 1;

            }

        }.averageBytes(), 0);

        assertEquals(64.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            FontFactory obj = null;

            @Override

            protected int create() {

                obj = new FontFactory();

                return 1;

            }

        }.averageBytes(), 0);

        assertEquals(72.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            RunArray obj = null;

            @Override

            protected int create() {

                obj = new RunArray();

                return 1;

            }

        }.averageBytes(), 0);

        assertEquals(1232.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            FlyweightClient obj = null;

            @Override

            protected int create() {

                obj = new FlyweightClient();

                return 1;

            }

        }.averageBytes(), 0);

        assertEquals(30024.0, new SizeofUtil() {

            @SuppressWarnings("unused")

            NonFlyweight obj = null;

            @Override

            protected int create() {

                obj = new NonFlyweight();

                return 1;

            }

        }.averageBytes(), 0);
    }
}
