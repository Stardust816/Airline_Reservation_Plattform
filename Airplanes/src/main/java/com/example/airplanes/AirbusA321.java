package com.example.airplanes;

public class AirbusA321 implements AirplanesTest{

    /**
     * Shows the rows of the Airbus A321
     */
    @Override
    public void rows() {

        System.out.println("34 Rows");

    }

    /**
     * Shows the columns of the Airbus A321
     */
    @Override
    public void columns() {

        System.out.println("6 Columns");

    }

    /**
     * Shows the Aircraft Type
     */
    @Override
    public void type() {

        System.out.println("Aircraft Type: Airbus A321");

    }
}
