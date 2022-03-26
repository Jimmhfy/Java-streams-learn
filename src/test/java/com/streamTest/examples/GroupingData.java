package com.streamTest.examples;


import com.streamTest.beans.Car;
import com.streamTest.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupingData {

    @Test
    public void simpleGrouping() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void groupingAndCounting() throws Exception {
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );
    }

}