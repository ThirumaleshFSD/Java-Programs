import java.util.*;
class ArrayMedian{
  public static void main(String[] args) {

        int a1[] = {1,2,3};
        int a2[] = {4,3};

        int m[] = new int[a1.length + a2.length];

        int index = 0;

        // merge arrays
        for(int i = 0; i < a1.length; i++) {
            m[index] = a1[i];
            index++;
        }

        for(int i = 0; i < a2.length; i++) {
            m[index] = a2[i];
            index++;
        }

        // sort array
        Arrays.sort(m);

        System.out.println(Arrays.toString(m));

        int n = m.length;

        double median;

        // odd length
        if(n % 2 == 1) {

            median = m[n / 2];

        } else {

            // even length
            median = (m[n/2] + m[(n/2)-1]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}
