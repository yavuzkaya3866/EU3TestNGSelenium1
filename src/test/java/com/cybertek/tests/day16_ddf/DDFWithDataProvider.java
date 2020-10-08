package com.cybertek.tests.day16_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object [][] testData(){
        String [][] data= {
                {"Person of Interest","10"},
                {"Sherlock","9"},
                {"Braking Bad","9"},
                {"The Office","8"},
                {"Friends","7"},
                {"WestWorld","10"},
                {"Gotham","9"},
                {"Dark","7"},
        };
        return data;
    }
    @Test(dataProvider = "testData")
    public void test1(String tvshow, String rating){
        System.out.println("Tv show: "+tvshow+" has raiting: "+rating);

    }
}
