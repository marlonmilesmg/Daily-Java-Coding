package za.co.marlonmagonjo;

/**
 *  Given an array of temperatures: return temperature closest to 0
 */
public class ClosestToZero {

    public static int computeClosestToZero(int[] ts) {
        if (ts.length == 0) {
            return 0;  // Return 0 if the array is empty
        }

        int closestTemp = ts[0];  // Assume the first temperature is the closest to 0

        for (int i = 1; i < ts.length; i++) {
            int currentTemp = ts[i];

            // Check if the absolute value of the current temperature is closer to 0
            if (Math.abs(currentTemp) < Math.abs(closestTemp) ||
                    (Math.abs(currentTemp) == Math.abs(closestTemp) && currentTemp > 0)) {
                closestTemp = currentTemp;  // Update the closest temperature
            }
        }
        return closestTemp;
    }
    public static void main(String[] args) {
        int[] temperatures = {2, -5, 8, -3, 3, 1};
        int closestTemperature = computeClosestToZero(temperatures);
        System.out.println("Closest temperature to 0: " + closestTemperature);
    }
}
