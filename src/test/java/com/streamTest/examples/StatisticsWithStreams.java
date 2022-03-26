package com.streamTest.examples;


import com.streamTest.beans.Car;
import com.streamTest.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StatisticsWithStreams {

    @Test
    public void count() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();
    }


    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
    }

}