import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public enum Zodiak{
        Aquarius("Водолей"),
        Fish ("Рыбы"),
        Aries("Овен"),
        Calf("Телец"),
        Twins("Близнецы"),
        Cancer("Рак"),
        Lion("Лев"),
        Virgo("Дева"),
        Libra("Весы"),
        Scorpio("Скорпион"),
        Sagittarius("Стрелец"),
        Capricorn("Козерог");

        Zodiak(String myString) {
        }
    }
    public static class Dots{
        public int x,y;
        public Dots(int _x, int _y){
            this.x = _x;
            this.y = _y;
        }
    }

    /**
     *@param seconds is count of seconds
     *@return  count of hours
     *
     * @version 1.0.1
     * @author D. Stefurak
    */
    public static int calcHours(int seconds){
        return (seconds/60)/60;
    }

    /**
     * @param number is inputted number
     * @return  are all numbers different
     *
     * @version 1.0.1
     * @author D. Stefurak
    */
    public static boolean areAllNumbersDifferent(int number){
        if (((number % 10)!=(number / 10 % 10))&&((number % 10)!=(number / 100))&&((number / 10 % 10)!=(number / 100))){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param a is a dot, with x,y position
     * @param b is a dot, with x,y position
     * @param c is a dot, with x,y position
     * @return a string with information, which dot is closer to a, and distance between them
     *
     * @version 1.0.1
     * @author D. Stefurak
    */
    public static String whoIsCloser(Dots a, Dots b, Dots c){
        String result = "";

        if(Math.sqrt((b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y))>Math.sqrt((c.x-a.x)*(c.x-a.x)+(c.y-a.y)*(c.y-a.y))){
            result = "C{"+c.x+","+c.y+"} is closer to A, distance "+Math.sqrt((b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y));
        }
        else{
            result = "B{"+b.x+","+b.y+"} is closer to A, distance "+Math.sqrt((c.x-a.x)*(c.x-a.x)+(c.y-a.y)*(c.y-a.y));
        }

        return result;
    }

    /**
     * @param day is integer number of day
     * @param month is integer number of month
     * 
     * @return current Zodiak sign, at current day in current month
     * 
     * @version 1.0.0
     * @author D. Stefurak
    */
    public static String printZodiac(int day, int month){
        switch(month){
            case 1:
                if(day <= 20){
                    return Zodiak.Capricorn.toString();
                }
                else{
                    return Zodiak.Aquarius.toString();
                }
            case 2:
                if(day <= 19){
                    return Zodiak.Fish.toString();
                }
                else{
                    return Zodiak.Aries.toString();
                }
            case 3:
                if(day <= 21){
                    return Zodiak.Aries.toString();
                }
                else{
                    return Zodiak.Calf.toString();
                }
            case 4:
                if(day <= 20){
                    return Zodiak.Calf.toString();
                }
                else{
                    return Zodiak.Twins.toString();
                }
            case 5:
                if(day <= 21){
                    return Zodiak.Twins.toString();
                }
                else{
                    return Zodiak.Cancer.toString();
                }
            case 6:
                if(day <= 22){
                    return Zodiak.Cancer.toString();
                }
                else{
                    return Zodiak.Lion.toString();
                }
            case 7:
                if(day <= 23){
                    return Zodiak.Lion.toString();
                }
                else{
                    return Zodiak.Virgo.toString();
                }
            case 8:
                if(day <= 23){
                    return Zodiak.Virgo.toString();
                }
                else{
                    return Zodiak.Libra.toString();
                }
            case 9:
                if(day <= 23){
                    return Zodiak.Libra.toString();
                }
                else{
                    return Zodiak.Scorpio.toString();
                }
            case 10:
                if(day <= 23){
                    return Zodiak.Scorpio.toString();
                }
                else{
                    return Zodiak.Sagittarius.toString();
                }
            case 11:
                if(day <= 23){
                    return Zodiak.Sagittarius.toString();
                }
                else{
                    return Zodiak.Capricorn.toString();
                }
            case 12:
                if(day <= 22){
                    return Zodiak.Capricorn.toString();
                }
                else{
                    return Zodiak.Aquarius.toString();
                }
            default:
                return "None";
        }
    }


    /**
     * @param number number for factorial calculation
     * @return factorial of current number 
     * 
     * @version 1.0.1
     * @author D. Stefurak
    */
    static long factorial(long number){
        if (number == 1 || number == 0)
            return 1;
        else
            return number * factorial(number - 1);
    }
    /**
     * @param n - count of elements in sum
     * @return sum of factorials of N elements in auto incr.
     * 
     * @version 1.0.2
     * @author D. Stefurak 
    */
    public static long findSumOfFactorials(long n){
        long result = 0;
        for(long i = 1; i <= n; i++){
            result += factorial(i);
        }
        return result;
    }

    /**
     * @param n - number for searching
     * @return if number contain "2"
     * 
     * @version 1.0.2
     * @author D. Stefurak 
    */
    public static boolean isTwoPresent(int n){
        boolean result = false;
        while(n>0){
            n/=10;
            if(n % 10 == 2)
                result = true;
        }
        return result;
    }

    /**
     * @param array - array of integers
     * @param l - left border
     * @param r - right border
     * @return sum of elements between two borders
     * 
     * @version 1.0.2
     * @author D. Stefurak 
    */
    public static long calcArrayBorders(int[] array, int l, int r){
        long result = 0;
        if(array.length == 0){
            System.out.println("[calcArrayBorders] Array is empty");
        }
        else if(l < array.length && l >= 0 && l < r && r <= array.length){
            for(int i = l; i <= r; i++){
                result += array[i];
            }
        }
        else{
            System.out.println("[calcArrayBorders] Something is going wrong with borders");
        }
        return result;
    }

    public static int[][] calcMatrix(int matrix[][]){
        //matrix.length;
        //matrix[0].length;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] *= matrix[i][j];
            }
        }
        return matrix;
    }

    /**
     * @param array Array of integer
     * @param size Size of array
     * @return filled array
     *
     * @version 1.0.0
     * @author D. Stefurak
     * */
    public static int[] inputArray(int[] array, int size){
        array = new int[size];
        System.out.println("Enter integer element of array:");
        for(int i = 0; i < size; i++){
            array[i] = scn.nextInt();
        }
        return array;
    }

    /**
     * @param matrix Matrix of integer
     *
     * @version 1.0.0
     * @author D. Stefurak
     * */
    public static void outputMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Dots a = new Dots(5,9),b= new Dots(-4,12),c = new Dots(15,0);
        int[] array = {1,4,87,5,67,3,9,6,7,0,3,5,6,8,34,22,35,65,7,8,5,6,7,0,10,12,1};
        int[][] matrix = {{1,8,3},{2,4,5},{7,8,9}};
        System.out.println(calcHours(5000));
        System.out.println(areAllNumbersDifferent(122));
        System.out.println(whoIsCloser(a,b,c));
        System.out.println(printZodiac(31,1));
        System.out.println(findSumOfFactorials(4));
        System.out.println(isTwoPresent(146));
        System.out.println(calcArrayBorders(array,2,7));
        outputMatrix(calcMatrix(matrix));
    }
}
