import java.util.Arrays;

public class task1 {

    public int Result(int[] data) {
        Arrays.sort(data);
        int length = data.length; // Get the length of the array

        // Calculate the product of the three largest elements
        int mult = data[length - 1] * data[length - 2] * data[length - 3];

        return mult;
    }

}
