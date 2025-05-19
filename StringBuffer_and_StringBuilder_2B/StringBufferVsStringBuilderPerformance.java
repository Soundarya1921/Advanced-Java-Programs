//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.

package Sb;
public class StringBufferVsStringBuilderPerformance {
    public static void main(String[] args) {
        int iterations = 10000;
        String textToAppend = "AIET";

        // Test StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbf.append(textToAppend);
        }
        long endTime1 = System.nanoTime();
        long durationBuffer = endTime1 - startTime1;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // Test StringBuilder
        StringBuilder sbd = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbd.append(textToAppend);
        }
        long endTime2 = System.nanoTime();
        long durationBuilder = endTime2 - startTime2;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Conclusion
        if (durationBuffer > durationBuilder) {
            System.out.println("\nConclusion: StringBuilder is faster than StringBuffer.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("\nConclusion: StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("\nConclusion: Both took the same time.");
        }
    }
}

