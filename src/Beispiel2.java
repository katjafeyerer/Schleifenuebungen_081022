import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Beispiel2 {

    public static void main(String[] args) {
//erste Möglichkeit zur Initialisierung
        int[] values1 = new int[3]; //values1_0, values1_1, values 2_2

            //int value1[] = new int[];
        values1[0] = 3;
        values1[1] = 4;
        values1[2] = 5;

//zweite Möglichkeit zur Initialisierung
            int[] values2 = {7, 5, 1};

            for (int i = 0; i < values1.length; i++) {     //fori und bei i< values1.lentgh = dynamisch und wenn array new int ist geändert, wird auch hier geändert
                System.out.println("i= " + i + "; value: " + values1[i]);

            }
            for (int i = 0; i < values2.length; i++) {
                System.out.println("i= " + i + "; value: " + values2[i]);

            }
                System.out.println("Addition");
                for (int i = 0; i < values1.length && i < values2.length; i++) {
                    int result = values1[i] + values2[i];
                    System.out.print(result);
                    if(i< values1.length-1) {
                        System.out.print(", ");
                    }
//leeres Println, wenn ich davor und danach ein print habe
// oder soutprintln("\nMultiplizieren");

// bei einzeiligen Abfragen kann ich die geschwungenen Klammern weglasseen
                }

        int sum = 0;
        for (int i = 0; i < values1.length; i++) {
        sum = sum + values1[i];
        System.out.println("\nsum = " + sum);

        }
        System.out.println("total sum= " + sum);
        System.out.println("average= " + sum / values1.length*1.0);

        System.out.println(Arrays.toString(values1));
        System.out.println(Arrays.toString(values2));

    }
    }

