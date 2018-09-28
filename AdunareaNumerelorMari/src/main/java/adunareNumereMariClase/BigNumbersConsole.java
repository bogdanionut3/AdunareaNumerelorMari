package adunareNumereMariClase;

public class BigNumbersConsole {
    private int vNum1[];
    private int vNum2[];
    private NumericValues values;
    private MovingElements elements;

    public BigNumbersConsole(String num1, String num2) {
        vNum1 = createIntArray(num1, num2);
        vNum2 = createIntArray(num1, num2);
        this.values = new NumericValues(vNum1);
        values.getNumericValues(num1);
        this.values = new NumericValues(vNum2);
        values.getNumericValues(num2);
        this.elements = new MovingElements();
        elements.completeZeroes(vNum1, vNum2, num1.length(), num2.length());
    }

    private int[] createIntArray(String num1, String num2) {
        if (num2.length() >= num1.length()) {
            return new int[num2.length()];
        } else {
            return new int[num1.length()];
        }
    }

    public int[] sumOfBigNumbers() {
        int i = vNum1.length - 1;
        int k = 0;
        int rest = 0;
        int[] result = new int[vNum1.length + 1];

        while (i >= 0) {
            int value = vNum1[i] + vNum2[i] + rest;
            if (value > 9) {
                result[k] = value % 10;
                rest = value / 10;
                k++;
                i--;
            } else {
                result[k] = value;
                rest = 0;
                k++;
                i--;
            }
        }
        if (rest > 0) {
            result[k] = rest;
            k++;
        }
        return result;
    }
}


