package adunareNumereMariClase;

public class MovingElements {
    public MovingElements() {
    }

    public void completeZeroes(int[] vNum1, int[] vNum2, int num1, int num2) {
        if (num1 > num2) {
            for (int i = 0; i < (num1 - num2); i++) {
                for (int j = num1 - 1; j >= 1; j--) {
                    vNum2[j] = vNum2[j - 1];
                }
                vNum2[i] = 0;
            }
        }
        if (num2 > num1) {
            for (int i = 0; i < (num2 - num1); i++) {
                for (int j = num2 - 1; j >= 1; j--) {
                    vNum1[j] = vNum1[j - 1];
                }
                vNum1[i] = 0;
            }
        }
    }
}
