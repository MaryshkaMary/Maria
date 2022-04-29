public class задание3 {
    public static void main(String[] args) {
        int n = 6, h = 3, a = 1;
        boolean f = false;
        int mas[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mas[i][j] = (int)((Math.random() * 9) + 1);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++){
            if(mas[h][i] > mas[h][i-1])
                f = true;
            else{
                f = false;
                System.out.println("0");
                break;
            }
        }
        if (f){
            System.out.print("1");
        }
    }
}
