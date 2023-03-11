import java.util.Scanner;

public class Main {

    static int sum (int a, int b){
        return a+b;
    }

    public static void main (String[] args){
//        System.out.println("Hello World");
//        String name = "gani";
//        System.out.println(name);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter");
//        int a = sc.nextInt();
//        System.out.println(a);
//
//        byte ui = -56;
//        double d = 45.65434567d;
//        System.out.println(ui);
//        System.out.println(d);
//
//        int num1 = 45, num2 = 50;
//        System.out.println("the sum is ");
//        System.out.println(num1+num2);
//
//        // taking input from user
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Something => ");
//        int input = scan.nextInt();
//        System.out.println(input);

//        String name = "Ganesh";
//        String middle = "Narayana";
//        String last = "Shinde";
//
//        String fullName = name +" "+ middle +" "+ last;
//        System.out.println(fullName);
//        System.out.println(fullName.length());
//        System.out.println(fullName.toUpperCase());
//        System.out.println(fullName + "\"\\");
//        System.out.println(fullName.contains("Ganesh"));
//        System.out.println(fullName.charAt(2));
//        System.out.println(fullName.endsWith("de"));
//        System.out.println(fullName.indexOf("Ganesh"));

//        int num1 = 4, num2=7;
//        System.out.println(Math.max(num1,num2));
//        System.out.println(Math.min(num2,num1));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(-9));
//        System.out.println(Math.round(Math.random()*10));


        // if else

//        while (true){
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Enter your age => ");
//            int age = scan.nextInt();
//            System.out.println(age);
//            if (age > 18) {
//                System.out.println("Eligible to vote");
//            } else if ( age == 0) {
//                break;
//            } else {
//                System.out.println("Not Eligible to vote");
//            }
//        }
//        Scanner scan = new Scanner(System.in);
//            System.out.print("Enter your age => ");
//            int age = scan.nextInt();
//            System.out.println(age);
//
//            switch (age){
//                case 12:
//                    System.out.println("you are 12");
//                    break;
//                case 20:
//                    System.out.println("you are 20");
//                    break;
//                case 30:
//                    System.out.println("you are 30");
//                    break;
//                default:
//                    System.out.println("error");
//            }

        // print sunday to  saturday based on numbers user put

//        while(true){
//            Scanner day = new Scanner(System.in);
//            System.out.println("Enter the day number => ");
//            int no = day.nextInt();
//
//            switch (no){
//                case 1:
//                    System.out.println("Sunday");
//                    break;
//                case 2:
//                    System.out.println("Monday");
//                    break;
//                case 3:
//                    System.out.println("Thuesday");
//                    break;
//                case 4:
//                    System.out.println("Wednesday");
//                    break;
//                case 5:
//                    System.out.println("Thursday");
//                    break;
//                case 6:
//                    System.out.println("Friday");
//                    break;
//                case 7:
//                    System.out.println("Saturday");
//                    break;
//                default:
//                    System.out.println("error");
//                    break;
//
//            }
//        }

        // LOOPS

//        int i = 0;
//        while (i<=100){
//            System.out.println("The value of i is "+ i);
//            i++;
//        }

//        for(int i=0;i<=100;i++){
//            if(i==40) continue;
//            System.out.println(i);
//        }
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i<=100);


        //Java Arrays

//        int [] marks = {1,2,3,4};
////        System.out.println(marks[3]);
//        marks[3]= 45;
//        for (int i=0;i<marks.length;i++){
////            System.out.println(marks[i]);
//        }
//        //For each loop
//        for(int value:marks){
////            System.out.println(value);
//        }

//        int [][]matrix= {{1,2,3},{4,5,6}};
//        for(int j = 0;j<2;j++){
//            for (int k=0;k<3;k++) {
//                System.out.println(matrix[j][k]);
//
//            }
//        }

//        String [] cars = {"yamaha","blue","hayabhuja","honda","Range rover"};
//        for(String value:cars){
//            System.out.println(value);

        //Try - Cacth

//        String [] bikes = {"Honda","Hero","Ninja","Mercides"};
//        try {
//            System.out.println(bikes[4]);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("you are using try-catch method");


        // methods in Java
        System.out.println(sum(5,7));


    }
/*
 variables are containers which stores data values
 strings, int, float, chr, boolean

 types of java datatypes
 primitive = byte (1 byte), short (2 bytes), int (4 bytes), float (4 bytes), long (8 bytes)
 non primitive or reference data types

 Operators in Java
 operand, operator, operand = result
 4        +         4       = 8

 comparision operators
 ==
 !=
 <
 >
 <=
 >=

 logical operators
 &&
 ||
 !

 */
}