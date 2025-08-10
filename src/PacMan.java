import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;

public class PacMan extends JPanel {
    private int columnCount = 19;
    private int rowCount = 21;
    private int titleSize = 32;
    private int boardWith = columnCount * titleSize;
    private int boardHeight = rowCount * titleSize;

    PacMan() {
        setPreferredSize(new Dimension(boardWith, boardHeight));
        setBackground(Color.BLACK);
    }
}
