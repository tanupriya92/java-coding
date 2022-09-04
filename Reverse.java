package com.tanu;

public class
Reverse {
    public static void main(String args[])
    {
        int x=1534236469;
        int remainder=0;
        long reverse=0;
        while(x!=0)
        {
            remainder = x % 10;
            x = x / 10;
            reverse = reverse*10+remainder;
        }
        System.out.println("rev num:"+reverse);


}
}


