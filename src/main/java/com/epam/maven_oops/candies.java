package com.epam.maven_oops;

public class candies extends gift {
	 boolean check_range(int l,int h)
     {
         if(weight>=l && weight<=h)
         {
             return true;
         }
         else
         {
             return false;
         }
     }

}
