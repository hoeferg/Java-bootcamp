public class Hello {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 91;
        if ((topScore > secondTopScore) && (topScore <100)) {
            System.out.println(("greater tja second top score and less then 100"));
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar ) {
            System.out.println("This is not suppose to happen");
        }

        String makeOFCar = "Volkswagen";
        boolean isDomestic = makeOFCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country ");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double num1 = 20.00d;
        double num2 = 80.00d;

        double numsTotal = ((num1+ num2) * 100.00d) % 40.00d;
        System.out.println(numsTotal);
        boolean isZero = (numsTotal == 0.00d);
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("got some remender");
        }
    }
}
