import java.util.*;

public class Si_lab2_231555ManualTest {
    public static void main(String[] args) {
        testEveryStatement();
        testMultipleCondition();
    }

    public static void testEveryStatement() {
        System.out.println("Running testEveryStatement...");


        try {
            Si_lab2_231555.checkCart(null, "1234567891234567");
            System.out.println("Test 1 failed: expected exception");
        } catch (RuntimeException ex) {
            assertEqual(ex.getMessage(), "allItems list can't be null!", "Test 1");
        }


        try {
            Si_lab2_231555.checkCart(List.of(new Item(null, 11, 301, 0.1)), "1234567891234567");
            System.out.println("Test 2 failed: expected exception");
        } catch (RuntimeException ex) {
            assertEqual(ex.getMessage(), "Invalid item!", "Test 2");
        }


        try {
            Si_lab2_231555.checkCart(List.of(new Item("e", 11, 301, 0)), null);
            System.out.println("Test 3 failed: expected exception");
        } catch (RuntimeException ex) {
            assertEqual(ex.getMessage(), "Invalid card number!", "Test 3");
        }


        try {
            Si_lab2_231555.checkCart(List.of(new Item("e", 11, 301, 0.1)), "123456789123456a");
            System.out.println("Test 4 failed: expected exception");
        } catch (RuntimeException ex) {
            assertEqual(ex.getMessage(), "Invalid character in card number!", "Test 4");
        }


        double result5 = Si_lab2_231555.checkCart(List.of(new Item("e", 11, 301, 0)), "1234567891234567");
        assertEqual(result5, -30 + 301 * 11, "Test 5");


        double result6 = Si_lab2_231555.checkCart(List.of(new Item("e", 11, 301, 0.1)), "1234567891234567");
        assertEqual(result6, -30 + 301 * 0.9 * 11, "Test 6");
    }

    public static void testMultipleCondition() {
        System.out.println("Running testMultipleCondition...");


        try {
            Si_lab2_231555.checkCart(List.of(new Item(null, 1, 100, 0)), "1234567891234567");
            System.out.println("Test A failed: expected exception");
        } catch (RuntimeException ex) {
            assertEqual(ex.getMessage(), "Invalid item!", "Test A");
        }


        try {
            Si_lab2_231555.checkCart(List.of(new Item("", 1, 100, 0)), "1234567891234567");
            System.out.println("Test B failed: expected exception");
        } catch (RuntimeException ex) {
            assertEqual(ex.getMessage(), "Invalid item!", "Test B");
        }


        double result = Si_lab2_231555.checkCart(List.of(new Item("e", 1, 100, 0)), "1234567891234567");
        assertEqual(result, 100, "Test C");
    }

    private static void assertEqual(double actual, double expected, String testName) {
        if (Math.abs(actual - expected) < 0.0001) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", got " + actual);
        }
    }

    private static void assertEqual(String actual, String expected, String testName) {
        if (actual.equals(expected)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected \"" + expected + "\", got \"" + actual + "\"");
        }
    }
}
