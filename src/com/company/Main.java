package com.company;

public class Main {

    public static void main(String[] args) {
        MonteCarlo mcObj = new MonteCarlo(5,3,2);
        int sqrCount = 0,cirCount = 0;

        for(int i = 0; i <100;i++)
        {
            if(mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y()));

            cirCount++;
            sqrCount++;
        }
        double solution = (cirCount*(mcObj.k*mcObj.h))/(cirCount*Math.pow(mcObj.r,2));
        System.out.println(solution);



    }
}
