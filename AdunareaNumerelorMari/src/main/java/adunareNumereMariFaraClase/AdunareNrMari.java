package adunareNumereMariFaraClase;

import java.util.Scanner;

    public class AdunareNrMari {

        public static void getCharacters(String a, int b[]) {
            for (int i = 0; i < a.length(); i++) {
                b[i] = Character.getNumericValue(a.charAt(i));
            }
        }

        public static void completeZeros(int a[], int b[], int a1, int a2) {

            if (a1 > a2) {
                for (int j = 0; j < a1 - a2; j++) {
                    for (int i = a1; i >= 1; i--) {
                        b[i] = b[i - 1];
                    }
                }
                for (int i = 0; i < a1 - a2; i++)
                    b[i] = 0;
            }
            if (a2 > a1) {
                for (int j = 0; j < a2 - a1; j++) {
                    for (int i = a2; i >= 1; i--) {
                        a[i] = a[i - 1];
                    }
                }
                for (int i = 0; i < a2 - a1; i++)
                    a[i] = 0;
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String a = new String();
            String b = new String();
            System.out.println("Introduceti primul numar: ");
            a = sc.next();
            System.out.println("Introduceti al doilea numar; ");
            b = sc.next();

            int array3[] = new int[15];
            int array1[] = new int[15];
            int array2[] = new int[15];

            getCharacters(a, array1);
            getCharacters(b, array2);


            int i = Math.max(a.length(), b.length()) - 1;
            int k = 0;
            int rest = 0;

            completeZeros(array1, array2, a.length(), b.length());


            while (i >= 0) {
                int value = array1[i] + array2[i] + rest;
                if (value > 9) {
                    array3[k] = value % 10;
                    rest = value / 10;
                    k++;
                    i--;
                } else {
                    array3[k] = value;
                    k++;
                    i--;
                    rest = 0;
                }
            }
            if (rest > 0) {
                array3[k] = rest;
                k++;
            }
            for (i = k - 1; i >= 0; i--)
                System.out.print(array3[i]);
        }
    }



