package main.java.src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output );
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg Con Test " +test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        System.out.println("Tick test 1 preTick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("\t Test Test 1 PostTick"  + tickTest1.getTime());
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00

        ClockDisplaySeconds testSecs1 = new ClockDisplaySeconds();
        testSecs1.setTime(1,3,5);
        System.out.println("Time = "+ testSecs1.getTime());
        testSecs1.timeTick();
        System.out.println("Time = " + testSecs1.getTime());
        testSecs1.setTime(1, 0 , 59);
        System.out.println("Time test 1:00:59 = "+testSecs1.getTime());
        testSecs1.timeTick();
        System.out.println("Test tick time= "+testSecs1.getTime());
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour testAMPM = new ClockDisplay12Hour();
        System.out.println("Intial time AMPM test: " + testAMPM.getTime());
        testAMPM.setTime(3, 32, false);
        System.out.println("Time test1 pre: " + testAMPM.getTime());
        testAMPM.timeTick();
        System.out.println("Time tes1 post: " + testAMPM.getTime());

        testAMPM.setTime(11, 59, false);
        System.out.println("Time test2 pre: " + testAMPM.getTime());
        testAMPM.timeTick();
        System.out.println("Time test2 post: " + testAMPM.getTime());

    }
}
