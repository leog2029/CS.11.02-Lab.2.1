/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME:  Leo Gao
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int twoSum = add(3,8);
        System.out.println(twoSum);

        int fourSum = add(3,8,4,9);
        System.out.println(fourSum);

        String morningMessage = morningGreeting("Toby Fox");
        System.out.println(morningMessage);

        String afternoonMessage = afternoonGreeting("Mac Miller");
        System.out.println(afternoonMessage);

        String tripleText = triple("oohbaby");
        System.out.println(tripleText);

        double halvedValue = half(17);
        System.out.println(halvedValue);

        int roundPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositive);

        int roundNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNegative);

    }

    // 1. add
    public static int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    
    // 2. add
    public static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber){
        int sumOfFirstPair = add(firstNumber, secondNumber);
        int sumOfSecondPair = add(thirdNumber, fourthNumber);
        return add(sumOfFirstPair, sumOfSecondPair);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String inputText){
        return inputText + inputText + inputText;
    }

    // 6. half
    public static double half(int number){
        return number/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double positiveNumber){
        return (int) (positiveNumber + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negativeNumber){
        return (int) (negativeNumber - 0.5);
    }

}
