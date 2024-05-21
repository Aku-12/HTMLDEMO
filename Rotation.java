import java.util.Arrays;

public class Rotation {
    static int[] rotationNum(int a[]){
        int i = 2;
        int j =a.length-1;
        int temp;

        while(i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return Arrays.copyOf(a, a.length);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotationNum(new int[]{2, 3, 45, 6, 78, 9})));
    }
}
