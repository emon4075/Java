package CollectionFramework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dist {
    public static void main(String[] args) throws IOException {
        File F = new File("src\\CollectionFramework\\data.txt");
        Scanner S = new Scanner(F);
        double[] track_Temp = new double[65];
        double[] track_Humidity = new double[65];
        double[] track_Rain = new double[65];
        int[] track_Days = new int[65];

        while (S.hasNextLine()) {
            String M = S.nextLine();
            String[] Arr = M.split(" ");

            int District_ID = Integer.parseInt(Arr[0]);
            double Temparature = Double.parseDouble(Arr[2]);
            double Humidity = Double.parseDouble(Arr[3]);
            double Rain = Double.parseDouble(Arr[4]);

            track_Temp[District_ID] += Temparature;
            track_Humidity[District_ID] += Humidity;
            track_Rain[District_ID] += Rain;
            track_Days[District_ID]++;
        }

        S.close();

        /*
         * Temparature
         */
        FileWriter Tem = new FileWriter("src\\CollectionFramework\\Temparature.txt");
        for (int i = 1; i <= 64; i++) {
            Tem.write(i + " " + track_Temp[i] / track_Days[i] + "\n");
        }
        Tem.close();

        /*
         * Humidity
         */

        FileWriter Hum = new FileWriter("src\\CollectionFramework\\Humidity.txt");
        for (int i = 1; i <= 64; i++) {
            Hum.write(i + " " + track_Humidity[i] / track_Days[i] + "\n");
        }
        Hum.close();

        /*
         * Rain
         */

        FileWriter Ra = new FileWriter("src\\CollectionFramework\\Temparature.txt");
        for (int i = 1; i <= 64; i++) {
            Ra.write(i + " " + track_Rain[i] / track_Days[i] + "\n");
        }
        Ra.close();
    }
}
