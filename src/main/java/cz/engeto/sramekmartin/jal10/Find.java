package cz.engeto.sramekmartin.jal10;

import java.util.List;

public class Find {

    public static Double findMatching(List<Double> listOfDoubles, Double lowerLimit, Double upperLimit)
    throws IllegalArgumentException {
        if (listOfDoubles.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (Double number : listOfDoubles) {
            if (number >= lowerLimit && number <= upperLimit ) {
                return number;
            }
        }
        return null;
    }

}
