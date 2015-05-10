package SaveUpMemory;

import java.awt.Font;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;

import java.util.Map;

public class RunArray {

    private Map<Integer, Font> runArrayMap = new HashMap<Integer, Font>();

// Index which will always point to the last index of all the existing runs

    private int runIndex = 0;

    public boolean addRun(int startIndex, int runCount, Font font) {

// A new run should always start within runindex, startindex should

// always be positive and the runlength should also be postive.

        if (startIndex > runIndex || startIndex < 0 || runCount < 0) {
            return false;
        } else {

            Integer key = startIndex + runCount - 1;



// Here key is used as end index for the run. Since we are

// including startindex in our run, our end index/key will be one

// less than startIndex+runCount.



// Adding new run to the end of all existing runs

            if (runIndex == startIndex) {

                runArrayMap.put(key, font);

                runIndex += runCount;

            }

// Adding a new run in between an existing run

            else if (startIndex < runIndex) {

                runArrayMap.put(startIndex, get(startIndex));

                runArrayMap.put(key, font);

            }

        }

        return true;

    }

    boolean appendRun(int runCount, Font font) {

        Integer key = runIndex + runCount;

        runArrayMap.put(key, font);

        runIndex += runCount;

        return true;

    }

    Font get(Integer index) {

        Font mapValue = runArrayMap.get(index);

        if (mapValue != null) {

            return mapValue;

        }

        ArrayList<Integer> sortedKeys = new ArrayList<Integer>(runArrayMap.size());
        sortedKeys.addAll(runArrayMap.keySet());

        Collections.sort(sortedKeys);

        Integer startValue = sortedKeys.get(0);

        for (int i = 0; i < sortedKeys.size(); i++) {

            if (index < sortedKeys.get(i)) {


                startValue = sortedKeys.get(i);

                break;
            }

        }


        return runArrayMap.get(startValue);

    }
}

