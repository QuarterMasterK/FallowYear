import java.util.Scanner;
public class FallowYear { 
private static  Scanner scan = new Scanner(System.in);
private static  int[][] firstYear = new int[10][10]; // first year
public static void main(String[] args) {
    System.out.println("Initial Year: ");
    int year = scan.nextInt();

    FirstYear();

    boolean flag = true;
    while (flag) {
        scan = new Scanner(System.in);
        boolean EmptyChecker;
        EmptyChecker = scan.hasNextInt();
        if(EmptyChecker) {
            System.out.println(year + 1);
            int startx, starty, endx, endy;
            startx = scan.nextInt();
            starty = scan.nextInt();
            endx = scan.nextInt();
            endy = scan.nextInt();
            for (int i = starty; i <= endy; i++) {
                for (int j = startx; j <= endx; j++) {firstYear[i][j] += 2; }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (firstYear[i][j] > 0) {firstYear[i][j]--;}
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {System.out.print(firstYear[i][j]+ " ");}
                System.out.println(" ");
            }
        }

        else {
            System.out.println(year + 1);
            for (int i = 0; i < 10; i++) {
                for (int r = 0; r < 10; r++) {if (firstYear[i][r] > 0) {firstYear[i][r]--;}}
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {System.out.print(firstYear[i][j]+ " ");}
                System.out.println(" ");
            }
        }
        year++; if(year == 2020) break;
        
        }
    }
private static void FirstYear() {
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {firstYear[i][j] = 0;}
    }

    for (int i = 0; i < 10; i++) {
        for (int d = 0; d < 10; d++) {System.out.print(firstYear[i][d]+ " ");}
        System.out.println(" ");
    }
}
}