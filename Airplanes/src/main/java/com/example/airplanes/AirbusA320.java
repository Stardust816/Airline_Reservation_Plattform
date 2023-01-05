package com.example.airplanes;

public class AirbusA320 implements AirplanesTest{

    /**
     * Shows the rows of the Airbus A320
     */
    @Override
    public void rows() {

        System.out.println("30 Rows");

    }

    /**
     * Shows the columns of the Airbus A320
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

        System.out.println("Aircraft Type: Airbus A320");

    }
}
