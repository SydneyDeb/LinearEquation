import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String c1 = myScanner.nextLine();
        System.out.println("Enter coordinate 2: ");
        String c2 = myScanner.nextLine();

        String cPart1 = c1.substring(1,c1.indexOf(","));
        String cPart2 = c1.substring(c1.indexOf(",")+2, c1.indexOf(")"));

        int x1 = Integer.parseInt(cPart1);
        int y1 = Integer.parseInt(cPart2);

        String cPart3 = c2.substring(1,c2.indexOf(","));
        String cPart4 = c2.substring(c2.indexOf(",")+2, c2.indexOf(")"));

        int x2 = Integer.parseInt(cPart3);
        int y2 = Integer.parseInt(cPart4);

        System.out.println(new LinearEquation(x1, y1, x2, y2).lineInfo());

        if (x1 != x2) {
            System.out.println("Enter a value for x: ");
            double xVal = myScanner.nextDouble();

            System.out.print("The point on the line is: ");
            System.out.print(new LinearEquation(x1, y1, x2, y2).coordinateForX(xVal));
        }
    }
}