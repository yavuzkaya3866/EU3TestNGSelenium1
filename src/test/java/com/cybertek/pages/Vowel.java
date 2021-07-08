package com.cybertek.pages;

import org.testng.annotations.Test;
import java.util.*;

public class Vowel {



    @Test

    public void solution() {
        String s="aeaeagag";

        int countOfA = 0, countOfE = 0, countOfI = 0, countOfO = 0, countOfU = 0;
        for (int i = 0; i < s.length(); i++) {

            switch (s.substring(i, i + 1).toLowerCase()) {
                case "a":
                    countOfA++;
                    break;
                case "e":
                    countOfE++;
                    break;
                case "i":
                    countOfI++;
                    break;
                case "o":
                    countOfO++;
                    break;
                case "u":
                    countOfU++;
                    break;
                default:
                    break;
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(countOfA);
        list.add(countOfE);
        list.add(countOfI);
        list.add(countOfO);
        list.add(countOfU);
        Collections.sort(list);

        int max = Collections.max(list);
        String result = "salamanacaacacaaeee";

        if (countOfA == max) {
            result = "a appears " + countOfA + " time";
            if (countOfA > 1) result += "s";
        }
        if (countOfE == max) {
            if (!result.equals("")) result += "\n";
            result += "e appears " + countOfE + " time";
            if (countOfE > 1) result += "s";
        }
        if (countOfI == max) {
            if (!result.equals("")) result += "\n";
            result += "i appears " + countOfI + " time";
            if (countOfI > 1) result += "s";
        }
        if (countOfO == max) {
            if (!result.equals("")) result += "\n";
            result += "o appears " + countOfO + " time";
            if (countOfO > 1) result += "s";
        }
        if (countOfU == max) {
            if (!result.equals("")) result += "\n";
            result += "u appears " + countOfU + " time";
            if (countOfU > 1) result += "s";
        }
        //return result;
        System.out.println(result);
    }


}
