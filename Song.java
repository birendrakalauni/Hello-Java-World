public class Song {

    public static void main(String[] args)
            throws InterruptedException {

        String[] lyrics = {

                // First slower section
                "\nMaya Namarnu Dhairya Sanga",
                "Parkhi Basnu Hai",
                "Parkhi Basnu Hai",
                "Kehi Samaya Lagla",
                "Aauchu Ma Kasaam Timilai Lina Lai",
                "Ma Timilai Lina Lai",
                "Jamai Samaya Boki Aaunu",
                "Tyo Jeevan Bitauna Lai",
                "Jeevan Bitauna Lai",
                "Yo Juni Kamti Parey",
                "Aarko Juni Samma Lai",
                "Lai Lai Lai Lai...\n",

                // Faster repeated chorus
                "\nMaya Namarnu Dhairya Sanga",
                "Timi Parkhi Basnu Hai",
                "Kehi Samaya Lagla",
                "Aauchu Ma Kasaam Timilai Lina Lai",
                "Jamai Samaya Boki Aaunu",
                "Tyo Jeevan Bitauna Lai",
                "Yo Juni Kamti Parey",
                "Aarko Juni Samma Lai",
                "......🎶🎶🎶🎶......\n"
        };

        /*
           More accurate timing
           based on vocal pacing and pauses
        */

        double[] lineTimes = {

               // Slow section timings
                0.0,
                3.2,
                4.8,
                6.9,
                9.5,
                12.0,
                14.9,
                16.0,
                17.0,
                22.2,
                24.8,
                27.0,

                // Faster repeated chorus
                30.0,
                34.8,
                37.0,
                41.0,
                45.0,
                49.0,
                53.5,
                56.9,
                59.5
        };

        long startTime =
                System.currentTimeMillis();

        for (int i = 0; i < lyrics.length; i++) {

            String[] words =
                    lyrics[i].split(" ");

            // Dynamic speed
            double wordDelay;

            // Slower emotional section
            if (i <= 11) {
                wordDelay = 0.43;
            }

            // Faster repeated chorus
            else {
                wordDelay = 0.33;
            }

            // Wait for exact timing
            while ((System.currentTimeMillis()
                    - startTime)
                    < lineTimes[i] * 1000) {

                Thread.sleep(5);
            }

            // Karaoke print
            for (String word : words) {

                System.out.print(word + " ");
                System.out.flush();

                Thread.sleep(
                        (long)(wordDelay * 1000));
            }

            System.out.println();
        }

        System.out.println(
                "\n♪ ♪");
    }
}