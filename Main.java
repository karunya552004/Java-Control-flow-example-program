import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            if (n1 >= 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
            if (n1 > 0) {
                for (int i = 1; i <= n1; i++) {
                    System.out.println(i);
                }
                for (int j = n1; j >= 1; j--) {
                    System.out.println(j);
                }
            } else {
                System.out.println("No numbers to print because n1 is less than or equal to 0.");
            }
            switch (n1) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input for a day of the week.");
                    break;
            }
            int itr = 1;
            do {
                System.out.print(itr);
                itr++;
            } while (itr <= 3);
        }
    }
}
