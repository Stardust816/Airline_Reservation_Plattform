package com.example.airplanes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Our modern fleet:");

        Embrear195 embrear195 = new Embrear195();
        System.out.println(" ");
        embrear195.type();
        embrear195.rows();
        embrear195.columns();

        AirbusA320 airbusA320 = new AirbusA320();
        System.out.println(" ");
        airbusA320.type();
        airbusA320.rows();
        airbusA320.columns();

        AirbusA321 airbusA321 = new AirbusA321();
        System.out.println(" ");
        airbusA321.type();
        airbusA321.rows();
        airbusA321.columns();

    }
}
