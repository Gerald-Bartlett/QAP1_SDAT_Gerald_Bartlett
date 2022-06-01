package com.keyin.CircleSphere;

public class CircleSphere {

    public double area(double Num) {

        return 3.14 * 4 * Num * Num; // 4PI * radius^2

    }

    public double circumference(double Num) {
        return  6.2832 * Num; // 2PI* radius
    }


        public double volume(double radius) {

            return 4.186 * radius * radius * radius; // 4/3 * 3.14 * radius^3;
        }
    }
