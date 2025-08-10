import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int columnCount = 19;
        int rowCount = 21;
        int titleSize = 32;
        int boardWith = columnCount * titleSize;
        int boardHeight = rowCount * titleSize; 

        JFrame frame = new JFrame("Pacman");
        frame.setVisible(true);
        frame.setSize(boardWith, boardHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


    }
}
