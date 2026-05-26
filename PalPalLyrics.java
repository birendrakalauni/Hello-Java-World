
public class PalPalLyrics {

    // Fixed: The sequence must end with 'm' for the terminal to recognize it
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        printLyrics();
    }

    public static void printLyrics() {
        String[] lyrics = {
            "Main ab Kyun hosh may aata nahi?",
            "Sukoon yeh dil kyun Paata nahi?",
            "Kyun torrun khud se jo thay waadey",
            "ke ab yeh ishq nibhana nahi?",
            "Mein morrun tum se jo yeh chehra",
            "Dobara nazar milana nahi",
            "Yeh duniya jaanay mera dard",
            "Tujhe yeh nazar kyun aata nahi?",
            "🎶🎶🎶🎶..."
        };

        double[] delays = {0.3, 0.3, 0.4, 0.3, 0.3, 0.3, 0.8, 0.7};

        System.out.println(" Pal Pal:\n");
        
        delay(1200);

        for (int i = 0; i < lyrics.length; i++) {
            String line = lyrics[i];
            
            // Turn text blue
            System.out.print(ANSI_BLUE);
            
            for (char ch : line.toCharArray()) {
                System.out.print(ch);
                System.out.flush();
                delay(60);
            }
            
            // Reset back to default color so your terminal stays clean
            System.out.print(ANSI_RESET);
            System.out.println(); 

            if (i < delays.length) {
                delay((long) (delays[i] * 1000));
            } else {
                delay(800);
            }
        }
    }

    private static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
