package fundamentals;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array;
        array = new int[4];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        for (int i=0;i<array.length;i++){
          System.out.println(array[i]);
        }

    }
}