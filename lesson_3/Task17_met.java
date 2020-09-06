public class Task17_met {

    public static void main(String[] args) {

        int[][] array = new int[7][7];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {

                if(i < array.length / 2) {
                    if(j >= i && array.length > i + j) {
                        array[i][j] = 1;
                    }
                } else if(i >= array.length / 2) {
                    if(j <= i && i + j >= array.length - 1) {
                        array[i][j] = 1;
                    }
                }
            }
        }


        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println();
        }
    }
}