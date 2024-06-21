import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame implements ActionListener {
    private JPanel mainWindow;
    private JLabel txt;
    private JTextField txtF;
    private JButton btn;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            JOptionPane.showMessageDialog(mainWindow,txtF.getText());
        }
    }

    public Demo() {
        btn.addActionListener(this);
    }

    public static void main(String[] args) {
        Demo h = new Demo();
        h.setBounds(100,100,500,400);
        h.setContentPane(h.mainWindow);
        h.setTitle("Demo");
        h.setVisible(true);
    }
}
