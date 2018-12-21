package com.kforce.w3;

public class MyClass {
    public static void main(String[] args) {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(args.length);
        System.out.println("Hello World");
        String name = "John";
        System.out.println("Hello " + name);
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
//        int x = 5;
//        int y = 6;
//        System.out.println(x + y); // Print the value of x + y
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        byte myNumByte = 100;
        System.out.println(myNumByte);
        short myNumShort = 5000;
        System.out.println(myNumShort);
//        int myNum = 100000;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);
        System.out.println(Boolean.TYPE);
        char myGrade = 'B';
        System.out.println(myGrade);
        String greeting = "Hello World";
        System.out.println(greeting);
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        String xx = "10";
        int yy = 20;
        String zz = xx + yy;
        System.out.println(zz);
        zz=yy+xx;
        System.out.println(zz);
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        int integerVal = 0;
        while(integerVal < 5) {
            System.out.println(integerVal);
            integerVal++;
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        for(int[] i : myNumbers)
        {
            for(int j: i){
//                System.out.println("foreach:i:"+i);
                System.out.println("foreach:j:"+j);
            }

        }

        int[] myNumberss = {1, 2, 3};try{

            System.out.println(myNumberss[10]); // error!

        }catch(Exception e){
//            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Just an Error");
        }finally{
            System.out.println("Just an Error - I am in finally");
        }
//        System.out.println(myNumberss[10]); // error!
    }

}