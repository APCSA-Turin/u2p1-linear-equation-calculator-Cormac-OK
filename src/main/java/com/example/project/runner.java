package com.example.project;

public class runner {
    public static void main(String[] args) {
        LinearCalculator c = new LinearCalculator("(0,0)","(5,68)");
        String expectedOutput = "The two points are: (0,0)";
        expectedOutput += " and " + "(5,68)";
        expectedOutput += "\nThe equation of the line between these points is: y=13.6x";
        expectedOutput += "\nThe slope of this line is: 13.6";
        expectedOutput += "\nThe y-intercept of the line is: 0.0";
        expectedOutput += "\nThe distance between the two points is: 68.18";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     
        System.out.println("EXPECTED:");
        System.out.println(expectedOutput);
        
        System.out.println();

        System.out.println("OUTPUT:");
        System.out.println(studentOutput);

        c = new LinearCalculator("(-5,1)","(1,1)");
        expectedOutput = "The two points are: (-5,1)";
        expectedOutput += " and " + "(1,1)";
        expectedOutput += "\nThe equation of the line between these points is: y=1.0";
        expectedOutput += "\nThe slope of this line is: 0.0";
        expectedOutput += "\nThe y-intercept of the line is: 1.0";
        expectedOutput += "\nThe distance between the two points is: 6.0";

        studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();

        System.out.println("EXPECTED:");
        System.out.println(expectedOutput);
        
        System.out.println();

        System.out.println("OUTPUT:");
        System.out.println(studentOutput);

        c = new LinearCalculator("(10,5)","(6,-1)");
        expectedOutput = "The two points are: (10,5)";
        expectedOutput += " and " + "(6,-1)";
        expectedOutput += "\nThe equation of the line between these points is: y=1.5x-10.0";
        expectedOutput += "\nThe slope of this line is: 1.5";
        expectedOutput += "\nThe y-intercept of the line is: -10.0";
        expectedOutput += "\nThe distance between the two points is: 7.21";

        studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();

        System.out.println("EXPECTED:");
        System.out.println(expectedOutput);
        
        System.out.println();

        System.out.println("OUTPUT:");
        System.out.println(studentOutput);
    }
}
