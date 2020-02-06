package com.epam.maven_oops;

import java.util.Scanner;

public class gift {
	int weight=0;
    public void collect()
    {
        
        System.out.println("enter your gift weight=");
        Scanner s=new Scanner(System.in);
        weight=s.nextInt();
        
    }
    public int total()
    {
        return weight;
    }

}
