public class GettingLoopy {
    public static void main(String args[]) {
        int n = 13;
        int x = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j == 1 || j == 2 * n - 1 || j == x || j == 2 * n - x) {
                    System.out.print("W ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            x++;
        }
    }
}
