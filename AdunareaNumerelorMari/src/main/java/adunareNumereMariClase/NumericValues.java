package adunareNumereMariClase;
/*Rolul clasei este de a converti variabilele de tip String intr-un vector de numere intregi. In
cadrul vectorului, pe masura parcurgerii lui se va obtine valoarea numerica a fiecarui ca-
racter din variabila String data*/
public class NumericValues {
    private int[] v;

    public NumericValues(int[] v) {
        this.v = v;
    }

    public int[] getNumericValues(String number) {
        for (int i = 0; i < number.length(); i++) {
            v[i] = Character.getNumericValue(number.charAt(i));
        }
        return v;
    }

}

