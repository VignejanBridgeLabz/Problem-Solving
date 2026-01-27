package org.example.Day5.FunctionalProgram;

public class WindChill {
    public static void main(String[] args) {

        // Check for two command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide temperature (t) and wind speed (v)");
            return;
        }

        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        double windChill = 35.74+ 0.6215 * t+(0.4275 * t - 35.75)*Math.pow(v, 0.16);
        System.out.println("Wind Chill = " + windChill);
    }
}
