public class ArrayDemo1 {
    public static void main(String[] args) {
//erste Möglichkeit zur Initialisierung
        int[] values1 = new int[8]; //values1_0, values1_1, values 2_2

        //int value1[] = new int[];
        values1[0] = 3;
        values1[1] = 4;
        values1[2] = 5;

//zweite Möglichkeit zur Initialisierung
        int[] values2 = {5, 7, 1, 3};

        for (int i = 0; i < values1.length; i++) {     //fori und bei i< values1.lentgh = dynamisch und wenn array new int ist geändert, wird auch hier geändert
            System.out.println("i= " + i + "; value: " + values1[i]);

        }
        for (int i = 0; i < values2.length; i++) {
            System.out.println("i= " + i + "; value: " + values2[i]);

        }
    }
}
