package com.kurama.day_1;

public class HelloWorld {
    public static void main(String[] args) {
        double inch, meter;
        int counter;

        counter = 0;
        for(inch = 0; inch <= 144; inch++) {
            meter = inch * 0.0254;
            System.out.println(inch + " inches is " + meter + " meters");

            counter++;
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }

}
