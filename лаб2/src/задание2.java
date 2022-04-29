public class задание2 {
    public static void main(String[] args) {
        int n = 10, j = 0;
        int c[] = new int[n];
        int x[] = new int[n];
        for (int i = 0; i < n; i++){
            c[i] = (int) (Math.random() * 10);
            System.out.print(c[i] + " ");
        }
        System.out.println();
            for (int i = 0; i < n; i++) {
                if (c[i] != 0) {
                    x[j] = c[i] * 4;
                    j++;
                }
            }
            for (int i = 0; i < j; i++)
            System.out.print(x[i] + " ");
    }
}
