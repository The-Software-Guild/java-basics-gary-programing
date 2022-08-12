public class SummaritiveArrays {
    public static void main(String[] args) {
        int array1 [] = { 1, 90, -33, -55, 67, -16, 28, -55, 15};
        int array2 [] = {999, -60, -77, 14, 160, 301};
        int array3 [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        int total_array1 = addArrays(array1);
        int total_array2 = addArrays(array2);
        int total_array3 = addArrays(array3);
        System.out.println("#1 Array sum: "+total_array1+"\n#2 Array sum: "+total_array2+"\n#3 Array sum: "+total_array3);
    }

    private static int addArrays(int[] array) {
        int total=0;
        for (int i = 0; i < array.length; i++) {
            total = total+array[i];
        }
        return total;
    }
}
