package UI;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameInterFace {
    private int counter = 0;
    private JFrame gameFrame;
    private playerinterface userPanel;
    private UImain[] UImainArr = new UImain[6];

    private String wordString;


    class UImain extends JPanel {
        JLabel[] label_Columns = new JLabel[5];

        public UImain() {
            this.setLayout(new GridLayout(1, 5));
            Border blackBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            for (int i = 0; i < 5; i++) {
                label_Columns[i] = new JLabel();
                label_Columns[i].setHorizontalAlignment(JLabel.CENTER);
                label_Columns[i].setOpaque(true);
                label_Columns[i].setBorder(blackBorder);
                this.add(label_Columns[i]);
            }
        }
        public void setText(String charValue, int position, Color color) {
            this.label_Columns[position].setText(charValue);
            this.label_Columns[position].setBackground(color);
        }
        public void clearUI() {
            for (int i = 0; i < 5; i++) {
                label_Columns[i].setText("");
            }
        }
    }
    class playerinterface extends JPanel {

        private JButton Button_enter;
        private JTextField input_user;


        public playerinterface() {
            this.setLayout(new GridLayout(1, 2));
            input_user = new JTextField();
            this.add(input_user);
            Button_enter = new JButton("Enter");
            this.add(Button_enter);
        }

        public JTextField getUserInput() {
            return input_user;
        }

        public JButton getOkButton() {
            return Button_enter;
        }

    }

    public GameInterFace() {
        gameFrame = new JFrame("Wordle Game");
        gameFrame.setSize(300, 300);
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameFrame.setLayout(new GridLayout(7, 1));
        gameFrame.setVisible(true);
        gameFrame.setLocationRelativeTo(null);

        for (int i = 0; i < 6; i++) {
            UImainArr[i] = new UImain();
            gameFrame.add(UImainArr[i]);
        }
        userPanel = new playerinterface();
        userPanel.getOkButton().addActionListener((ActionListener) this);
        gameFrame.add(userPanel);
        gameFrame.revalidate();
        //
        //ender the word from database here
        //
    }
}
