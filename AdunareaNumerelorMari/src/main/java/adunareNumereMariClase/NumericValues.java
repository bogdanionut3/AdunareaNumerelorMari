package adunareNumereMariClase;

public class NumericValues {

    public NumericValues(){
    }

    public void getNumericValues(String number, int v[]){
        for(int i = 0; i<number.length(); i++){
            v[i] = Character.getNumericValue(number.charAt(i));
        }
    }
}
