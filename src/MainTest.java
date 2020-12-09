import org.junit.jupiter.api.Test;
import org.opentest4j.*;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    public void calcHoursTest_Pos(){
        int actual = Main.calcHours(12000);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void calcHoursTest_Neg(){
        int actual = Main.calcHours(12000);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void areAllNumbersDifferentTest_Pos(){
        boolean actual = Main.areAllNumbersDifferent(142);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void areAllNumbersDifferentTest_Neg(){
        boolean actual = Main.areAllNumbersDifferent(133);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void printZodiacTest_Pos(){
        String actual = Main.printZodiac(5,5);
        String expected = "Twins";
        assertEquals(expected, actual);
    }
    @Test
    public void printZodiacTest_Neg(){
        String actual = Main.printZodiac(30,1);
        String expected = "Lion";
        assertEquals(expected, actual);
    }

    @Test
    public void findSumOfFactorialsTest_Pos(){
        long actual = Main.findSumOfFactorials(4);
        long expected = 33;
        assertEquals(expected, actual);
    }
    @Test
    public void findSumOfFactorialsTest_Neg(){
        long actual = Main.findSumOfFactorials(5);
        long expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    public void isTwoPresentTest_Pos(){
        Boolean actual = Main.isTwoPresent(54);
        Boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void isTwoPresentTest_Neg(){
        Boolean actual = Main.isTwoPresent(3343);
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void calcArrayBordersTest_Pos(){
        long actual = Main.calcArrayBorders(new int[]{3,4,7,8,4,3,4,5,6,0},0,5);
        long expected = 29;
        assertEquals(expected, actual);
    }
    @Test
    public void calcArrayBordersTest_Neg(){
        long actual = Main.calcArrayBorders(new int[]{3,4,7,8,4,3,4,5,6,0},0,3);
        long expected = 23;
        assertEquals(expected, actual);
    }
}