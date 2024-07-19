public class Main {
    public static void main(String[] args) {
        //Expression is the entire line
        //; is a statement
        //Whitespaces is spacing in code to make it more readable
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more");
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable= " + myVariable);

        if (myVariable == 0) {
            System.out.println("Its now 0");
        }
    }
}