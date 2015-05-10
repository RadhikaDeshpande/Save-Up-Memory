package SaveUpMemory;

import static org.junit.Assert.*;

import org.junit.Test;

import java.awt.Font;

public class RunArrayTest {

    @Test

    public void addRuntest() {

        RunArray runarray = new RunArray();

        Font fontA = FontFactory.getInstance().get("Arial", Font.BOLD, 16);

        Font fontB = FontFactory.getInstance().get("Couriernew", Font.BOLD, 13);

// until 115 characters from the start index 0 its of the font fontA

        boolean a = runarray.addRun(0, 115, fontA);

        assertTrue(a);

// from 115 upto 211 characters its of the font fontB

        a = runarray.addRun(115, 211, fontB);

        assertTrue(a);

// now the run is spilt from 90th index to next 10 characters

// which will be of font fontB.

// now hashmap is stored as[90 fontA, 100 fontB, 115 fontA, 326 fontB]

        a = runarray.addRun(90, 10, fontB);

        assertTrue(a);

// runcount negative

        a = runarray.addRun(0, -12, fontA);

        assertFalse(a);

// startindex negative

        a = runarray.addRun(-11, 115, fontA);

        assertFalse(a);

// index which not found

        a = runarray.addRun(400, 10, fontB);

        assertFalse(a);

    }

    @Test

    public void appendRuntest() {

        RunArray runarray = new RunArray();

        Font fontB = FontFactory.getInstance().get("Couriernew", Font.BOLD, 13);

        boolean a = runarray.appendRun(211, fontB);

        assertTrue(a);

    }

    @Test

    public void gettest() {

        RunArray runarray = new RunArray();

        Font a;

        Font fontA = FontFactory.getInstance().get("Arial", Font.BOLD, 16);

        Font fontB = FontFactory.getInstance().get("Couriernew", Font.BOLD, 13);

        runarray.addRun(0, 115, fontA);

        runarray.addRun(115, 211, fontB);

        runarray.addRun(90, 10, fontB);

        a = runarray.get(112);

        assertEquals(a, fontA);

        a = runarray.get(250);

        assertEquals(a, fontB);

// after the latest spilt of the runarray 95th index

// will return fontB insted of fontA

        a = runarray.get(95);

        assertEquals(a, fontB);

// edge case

        a = runarray.get(115);

        assertEquals(a, fontB);

    }
}
