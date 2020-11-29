package HomeworkBankArrays;

public class Arrays2 {


    public static int random() {
        return (int)(Math.random() * 78.0D) - 2;
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][7];

        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 7; ++j) {
                arr[i][j] = random();
                System.out.print(arr[i][j] + " ");
            }

            System.out.println(" ");
        }

    }
}
