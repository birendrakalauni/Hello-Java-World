import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IOnlySeeMyDream extends JFrame {

    private JTextArea lyricsArea;
    private JButton showButton;

    public IOnlySeeMyDream() {
        setTitle("I Only See My Dream");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("♪ I Only See My Dream ♪", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(new Color(70, 130, 180));

        // Lyrics Area
        lyricsArea = new JTextArea();
        lyricsArea.setFont(new Font("Serif", Font.PLAIN, 20));
        lyricsArea.setEditable(false);
        lyricsArea.setLineWrap(true);
        lyricsArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(lyricsArea);

        // Button
        showButton = new JButton("Show Lyrics");
        showButton.setFont(new Font("Arial", Font.BOLD, 18));

        // Button Action
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLyrics();
            }
        });

        // Add Components
        panel.add(title, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(showButton, BorderLayout.SOUTH);

        add(panel);
    }

    // Method to display lyrics
    private void showLyrics() {

        String lyrics =
                "Verse 1\n" +
                "In the silence of the night,\n" +
                "I chase the stars and city lights,\n" +
                "Every road keeps calling me,\n" +
                "To a place I’ve never seen.\n\n" +

                "Chorus\n" +
                "I only see my dream,\n" +
                "Shining like a distant beam,\n" +
                "No fear can hold me down,\n" +
                "I will rise above the clouds.\n" +
                "I only see my dream,\n" +
                "Brighter than it’s ever been,\n" +
                "Through the dark I still believe,\n" +
                "I only see my dream.\n\n" +

                "Verse 2\n" +
                "When the world says turn away,\n" +
                "I find the strength inside my faith,\n" +
                "Every heartbeat leads the way,\n" +
                "Closer to a brighter day.\n\n" +

                "Bridge\n" +
                "Even if the sky falls down,\n" +
                "I will stand my ground,\n" +
                "With hope inside my soul,\n" +
                "I’ll never let it go.\n\n" +

                "Final Chorus\n" +
                "I only see my dream,\n" +
                "Living wild and running free,\n" +
                "Nothing’s impossible,\n" +
                "When you believe in what you feel.\n" +
                "I only see my dream...\n";

        lyricsArea.setText(lyrics);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IOnlySeeMyDream().setVisible(true);
            }
        });
    }
}