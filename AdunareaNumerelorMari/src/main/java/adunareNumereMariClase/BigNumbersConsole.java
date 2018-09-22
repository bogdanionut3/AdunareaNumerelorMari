package adunareNumereMariClase;

public class BigNumbersConsole {
    private String num1;
    private String num2;
    private int vNum1[] = new int[15];
    private int vNum2[] = new int[15];
    private int result[] = new int[15];
    private NumericValues values;
    private MovingElements elements;
    private int i;
    private int k;//numarul elementelor din vectorul rezultat
    private int rest;

    public BigNumbersConsole(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.values = new NumericValues();
        values.getNumericValues(num1, vNum1);
        values.getNumericValues(num2, vNum2);
        this.elements = new MovingElements();
        elements.completeZeroes(vNum1, vNum2, num1.length(), num2.length());
        this.i = Math.max(num1.length(), num2.length()) - 1;
        this.k = 0;
        this.rest = 0;
    }

    public void sumOfBigNumbers() {
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
        System.out.println("Rezultatul adunarii este: ");
        for (i = k - 1; i >= 0; i--)
            System.out.print(result[i]);
    }
}


