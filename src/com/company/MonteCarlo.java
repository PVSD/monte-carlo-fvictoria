package com.company;
import java.util.Random;
public class MonteCarlo {

    public double h,k,r;

    private Random rndm = new Random();
    public MonteCarlo(double height, double width, double radius)
    {
        h = height;
        k  = width;
        r = radius;
    }
    public double nextRainDrop_x()
    {
        return rndm.nextDouble()*k;
    }
    public double nextRainDrop_y()
    {
        return rndm.nextDouble()*h;
    }

    public boolean insideCircle(double x,double y)
    {
        if (Math.pow(x-h,2)+Math.pow(y-k,2)<=Math.pow(r,2))
        return true;
        else if(!(Math.pow(x-h,2)+Math.pow(y-k,2)<=Math.pow(r,2)));
        return false;
    }


}