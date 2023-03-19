public class Main {
    public static void main(String[] args) {

//        String someText = "Some random text";
//        int someNumber = someText;
//
//        Character x = 88;
//        int testOne = x;
//        String testTwo = testOne;
//        long testThree = xl;
//
//        System.out.println(testTwo);

        String firstName = "Alma";
        String lastName = "Strujic";
        Character firstLetterOfName = 'A';
        int yearOfBirth = 1986;
        long oneHundredBillion = 100000000000L;
        float randomDecimalNumber = 42.001f;
        System.out.println("Name & surname: " + firstName + " " + lastName);
        System.out.println("Initial: " + firstLetterOfName);
        System.out.println("Birth year: " + " " + yearOfBirth);
        System.out.println(oneHundredBillion);
        System.out.println(randomDecimalNumber);

        Character letterA = 97;
        Character letterL = 108;
        Character letterM = 109;
        Character letterS = 115;
        Character letterT = 116;
        Character letterR = 114;
        Character letterU = 117;
        Character letterJ = 106;
        Character letterI = 105;
        Character letterC = 99;
        System.out.print(letterA);
        System.out.print(letterL);
        System.out.print(letterM);
        System.out.print(letterA);
        System.out.print(letterS);
        System.out.print(letterT);
        System.out.print(letterR);
        System.out.print(letterU);
        System.out.print(letterJ);
        System.out.print(letterI);
        System.out.print(letterC);

        boolean ultimateQuestion = true;
        String ultimateAnswer = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: ";

        System.out.println(ultimateAnswer + ultimateQuestion);


        String textPartOne = "This is a number ";
        String textPartTwo = "and it is about to double: ";
        String originalNumberStatus = "The original number has been doubled: ";
        String numberOfTimes = "times";
        int originalNumber = 10;
        int x = 2;
        int twoX = x * 2;
        int threeX = twoX * 2;
        int fourX = threeX * 2;
        int fiveX = fourX * 2;
        int sixX = fiveX * 2;
        int sevenX = sixX * 2;
        int eightX = sevenX * 2;

        System.out.println((textPartOne) + (originalNumber) + " " + (textPartTwo) + (originalNumber * x));
        System.out.println(originalNumberStatus + x);

        System.out.println((textPartOne) + (originalNumber * x) + " " + (textPartTwo) + (originalNumber * twoX));
        System.out.println(originalNumberStatus + twoX);

        System.out.println((textPartOne) + (originalNumber * twoX) + " " + (textPartTwo) + (originalNumber * threeX));
        System.out.println(originalNumberStatus + threeX);

        System.out.println((textPartOne) + (originalNumber * threeX) + " " + (textPartTwo) + (originalNumber * fourX));
        System.out.println(originalNumberStatus + fourX);

        System.out.println((textPartOne) + (originalNumber * fourX) + " " + (textPartTwo) + (originalNumber * fiveX));
        System.out.println(originalNumberStatus + fiveX);

        System.out.println((textPartOne) + (originalNumber * fiveX) + " " + (textPartTwo) + (originalNumber * sixX));
        System.out.println(originalNumberStatus + sixX);

        System.out.println((textPartOne) + (originalNumber * sixX) + " " + (textPartTwo) + (originalNumber * sevenX));
        System.out.println(originalNumberStatus + sevenX);

        System.out.println((textPartOne) + (originalNumber * sevenX) + " " + (textPartTwo) + (originalNumber * eightX));
        System.out.println(originalNumberStatus + eightX);

    }
}